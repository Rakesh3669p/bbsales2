package com.bb.bigbasketsalesapp.utils

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.ContentResolver
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.location.LocationManager
import android.net.Uri
import android.os.Build
import android.util.Base64
import android.util.Log
import android.util.Patterns
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.webkit.MimeTypeMap
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import com.bb.bigbasketsalesapp.R
import com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.AddressDataModel
import com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeData
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.gym.gymapp.utils.SingleLiveEvent
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.InputStream


val messageListItemClicked = MutableLiveData<Int>()
val messageListItemData = SingleLiveEvent<EmployeeData>()
val basicForm = MutableLiveData<Int>()
val addressFormData = MutableLiveData<AddressDataModel>()
val notificationCount = MutableLiveData<Int>()
val newCustomerAdded = SingleLiveEvent<Boolean>()
val locationUpdate = SingleLiveEvent<Boolean>()


@SuppressLint("CheckResult")
fun profileRequestOption(): RequestOptions {
    return RequestOptions().apply {
        placeholder(R.drawable.ic_user_image)
        error(R.drawable.ic_user_image).centerInside()
        diskCacheStrategy(DiskCacheStrategy.NONE)
    }
}

@SuppressLint("CheckResult")
fun noImage(): RequestOptions {
    return RequestOptions().apply {
        placeholder(R.drawable.placeholder).fitCenter()
        error(R.drawable.no_image).centerInside()
        diskCacheStrategy(DiskCacheStrategy.NONE)
    }
}

fun bitmapFromVector(context: Context, vectorResId: Int): BitmapDescriptor {
    val vectorDrawable = ContextCompat.getDrawable(context, vectorResId)
    vectorDrawable!!.setBounds(0, 0, vectorDrawable.intrinsicWidth, vectorDrawable.intrinsicHeight)
    val bitmap = Bitmap.createBitmap(
        vectorDrawable.intrinsicWidth,
        vectorDrawable.intrinsicHeight,
        Bitmap.Config.ARGB_8888
    )
    val canvas = Canvas(bitmap)
    vectorDrawable.draw(canvas)
    return BitmapDescriptorFactory.fromBitmap(bitmap)
}

data class ChartData(
    val xValue: Float,
    val yValue: Float
)

fun getTempChartData(): MutableList<ChartData> {
    val temChartData: MutableList<ChartData> = ArrayList()
    temChartData.add(ChartData(1F, 14F))
    temChartData.add(ChartData(2F, 22F))
    temChartData.add(ChartData(4F, 50F))
    temChartData.add(ChartData(4F, 35F))
    temChartData.add(ChartData(5F, 46F))
    temChartData.add(ChartData(6F, 45F))
    temChartData.add(ChartData(7F, 45F))
    temChartData.add(ChartData(8F, 40F))
    temChartData.add(ChartData(9F, 15F))
    temChartData.add(ChartData(10F, 11F))
    temChartData.add(ChartData(11F, 24F))
    temChartData.add(ChartData(12F, 34F))
    temChartData.add(ChartData(13F, 34F))
    temChartData.add(ChartData(14F, 24F))
    temChartData.add(ChartData(15F, 24F))
    temChartData.add(ChartData(16F, 14F))
    temChartData.add(ChartData(17F, 33F))
    temChartData.add(ChartData(18F, 18F))
    temChartData.add(ChartData(19F, 19F))
    temChartData.add(ChartData(20F, 24F))
    temChartData.add(ChartData(21F, 34F))
    temChartData.add(ChartData(22F, 39F))
    temChartData.add(ChartData(23F, 12F))
    temChartData.add(ChartData(24F, 18F))
    temChartData.add(ChartData(25F, 11F))
    temChartData.add(ChartData(26F, 10F))
    temChartData.add(ChartData(27F, 22F))
    temChartData.add(ChartData(28F, 24F))
    temChartData.add(ChartData(29F, 24F))
    temChartData.add(ChartData(30F, 24F))
    temChartData.add(ChartData(30F, 44F))
    return temChartData
}

fun CharSequence?.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun Fragment.showToast(msg: String) {
    Toast.makeText(this.requireContext(), msg, Toast.LENGTH_SHORT).show()
}

fun View.makeInvisible() {
    this.visibility = View.INVISIBLE
}

fun isLocationEnabled(context: Context): Boolean {
    val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
    return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
        LocationManager.NETWORK_PROVIDER
    )
}

fun isPermissionsGiven(context: Context): Boolean {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        ActivityCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_COARSE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(
            context,
            Manifest.permission.READ_EXTERNAL_STORAGE
        ) == PackageManager.PERMISSION_GRANTED
    }else{
        ActivityCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
            context,
            Manifest.permission.ACCESS_COARSE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(
            context,
            Manifest.permission.READ_EXTERNAL_STORAGE
        ) == PackageManager.PERMISSION_GRANTED
    }
}

fun encodeImage(activity: Activity, uri: Uri): String? {
    val imageStream: InputStream = activity.contentResolver.openInputStream(uri)!!
    val bm = BitmapFactory.decodeStream(imageStream)
    val baos = ByteArrayOutputStream()
    bm.compress(Bitmap.CompressFormat.JPEG, 100, baos)
    val b = baos.toByteArray()
    return Base64.encodeToString(b, Base64.DEFAULT)
}


fun encode(activity: Activity, filepath: String): String {
    val imgtype = getMimeType(activity, Uri.parse(filepath))
    val bitmap = BitmapFactory.decodeFile(File(filepath).absolutePath)
    val stream = ByteArrayOutputStream()
    bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
    val image: ByteArray = stream.toByteArray()
    val imgtobase64: String = Base64.encodeToString(image, 0)
    return imgtype + imgtobase64
}

fun getMimeType(activity: Activity, uri: Uri): String? {
    val extension: String? = if (uri.scheme.equals(ContentResolver.SCHEME_CONTENT)) {
        val mime = MimeTypeMap.getSingleton()
        mime.getExtensionFromMimeType(activity.contentResolver.getType(uri))
    } else {
        MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(File(uri.path)).toString())
    }
    return "data:image/$extension;base64,";
}

fun getBase64Image(imageString: String): ByteArray?  {
     return try {
        Base64.decode(imageString, Base64.DEFAULT)
    } catch (e: Exception) {
        null
    }
}

fun hideKeyboard(activity: Activity) {
    val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    var view = activity.currentFocus
    if (view == null) {
        view = View(activity)
    }
    imm.hideSoftInputFromWindow(view.windowToken, 0)
}



val params: MutableMap<String, String> = HashMap()



fun makeStatusNotification(message: String, context: Context) {

    // Make a channel if necessary
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        val name = VERBOSE_NOTIFICATION_CHANNEL_NAME
        val description = VERBOSE_NOTIFICATION_CHANNEL_DESCRIPTION
        val importance = NotificationManager.IMPORTANCE_LOW
        val channel = NotificationChannel(CHANNEL_ID, name, importance)
        channel.description = description

        // Add the channel
        val notificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager?

        notificationManager?.createNotificationChannel(channel)
    }

    // Create the notification
    val builder = NotificationCompat.Builder(context, CHANNEL_ID)
        .setSmallIcon(R.drawable.ic_launcher_foreground)
        .setContentTitle(NOTIFICATION_TITLE)
        .setContentText(message)
        .setPriority(NotificationCompat.PRIORITY_LOW)
        .setVibrate(LongArray(0))
    NotificationManagerCompat.from(context).notify(NOTIFICATION_ID, builder.build())
}

/**
 * Method for sleeping for a fixed about of time to emulate slower work
 */
fun sleep(durationInSec: Long) {
    try {
        Thread.sleep(ONE_SECOND_IN_MILLIS * durationInSec, 0)
    } catch (e: InterruptedException) {
        Log.e("TAG", e.message.toString())
    }
}


@JvmField val VERBOSE_NOTIFICATION_CHANNEL_NAME: CharSequence =
    "Verbose WorkManager Notifications"
const val VERBOSE_NOTIFICATION_CHANNEL_DESCRIPTION =
    "Shows notifications whenever work starts"
@JvmField val NOTIFICATION_TITLE: CharSequence = "WorkRequest Starting"
const val CHANNEL_ID = "VERBOSE_NOTIFICATION"
const val NOTIFICATION_ID = 1
const val ONE_SECOND_IN_MILLIS: Long = 1000