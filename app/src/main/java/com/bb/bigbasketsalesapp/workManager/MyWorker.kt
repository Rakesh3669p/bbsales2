package com.bb.bigbasketsalesapp.workManager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.bb.bigbasketsalesapp.utils.locationUpdate
import com.bb.bigbasketsalesapp.utils.makeStatusNotification
import com.bb.bigbasketsalesapp.utils.sleep


class MyWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {

    override fun doWork(): Result {
        val appContext = applicationContext

        makeStatusNotification("Worker started work.", appContext)
        sleep(10)
        makeStatusNotification("Worker finshed work.", appContext)
//        locationUpdate.postValue(true)
        println("Hello Working....")
        return Result.success()
    }

}