package com.bb.bigbasketsalesapp.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bb.bigbasketsalesapp.data.BBSalesRepository
import com.bb.bigbasketsalesapp.ui.loginSignUp.model.LoginModel
import com.doctorsplaza.app.utils.Resource
import com.google.gson.JsonObject
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.common.model.RemoteModelManager
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.TranslateRemoteModel
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions
import com.gym.gymapp.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: BBSalesRepository) : ViewModel() {

    val login = SingleLiveEvent<Resource<LoginModel>>()

    val downloadLanguage = SingleLiveEvent<Resource<Boolean>>()

    fun setLogin(jsonObject: JsonObject) = viewModelScope.launch {
        safeLoginCall(jsonObject)
    }

    private suspend fun safeLoginCall(jsonObject: JsonObject) {
        login.postValue(Resource.Loading())

        try {
            val response = repository.login(jsonObject)
            if (response.isSuccessful) {
                response.body()?.let { resultResponse ->
                    login.postValue(Resource.Success(resultResponse))
                }
            } else {

                login.postValue(Resource.Error(response.message(), null))
            }


        } catch (t: Throwable) {
            when (t) {
                is IOException -> login.postValue(
                    Resource.Error(
                        "Network Failure",
                        null
                    )
                )
                else -> login.postValue(
                    Resource.Error(
                        "Conversion Error ${t.message}",
                        null
                    )
                )
            }
        }
    }

    fun downloadlang() {
        viewModelScope.launch { safeDownloadLang() }
    }

    private fun safeDownloadLang() {
        downloadLanguage.postValue(Resource.Loading())
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.ARABIC)
            .setTargetLanguage(TranslateLanguage.ENGLISH)
            .build()

        val englishGermanTranslator = Translation.getClient(options)
        val conditions = DownloadConditions.Builder().build()

        englishGermanTranslator.downloadModelIfNeeded(conditions)
            .addOnSuccessListener {
                downloadLanguage.postValue(Resource.Success(true))
            }.addOnFailureListener {
                downloadLanguage.postValue(Resource.Error(it.message))
                val modelManager = RemoteModelManager.getInstance()
                val germanModel = TranslateRemoteModel.Builder(TranslateLanguage.GERMAN).build()

                modelManager.deleteDownloadedModel(germanModel)
                    .addOnSuccessListener {}
                    .addOnFailureListener {}
            }

    }
}