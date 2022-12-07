package com.bb.bigbasketsalesapp.di

import android.content.Context
import com.bb.bigbasketsalesapp.data.BBSalesRepository
import com.bb.bigbasketsalesapp.utils.SessionManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideRepository() = BBSalesRepository()

/*

    @Singleton
    @Provides
    fun provideAgileLoader(@ApplicationContext context: Context) = AgileLoader(context)
*/

    @Singleton
    @Provides
    fun provideSessionManager(@ApplicationContext context: Context) =
        SessionManager(context)

    /*@Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context):AppDataBase =
        Room.databaseBuilder(context,AppDataBase::class.java,"gym_app_db").fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()

    @Singleton
    @Provides
    fun provideAppDao(db: AppDataBase) =
        db.getAppDao()*/


}