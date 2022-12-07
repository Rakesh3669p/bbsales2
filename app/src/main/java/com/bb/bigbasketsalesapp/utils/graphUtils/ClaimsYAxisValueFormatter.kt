package com.bb.bigbasketsalesapp.utils.graphUtils

import android.content.Context
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.formatter.ValueFormatter
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.round
import kotlin.math.roundToInt



class ClaimsXAxisValueFormatter(var datesList: List<String>) :
    ValueFormatter() {
    private var parsedDate: Date? = null

    override fun getAxisLabel(value: Float, axis: AxisBase): String {
/*
Depends on the position number on the X axis, we need to display the label, Here, this is the logic to convert the float value to integer so that I can get the value from array based on that integer and can convert it to the required value here, month and date as value. This is required for my data to show properly, you can customize according to your needs.
*/
//        1/06/2022
        println("=== $value")
        val position = value.roundToInt()
        val sdf = SimpleDateFormat("dd/MM/yyyy",Locale.getDefault())
        val sdf1 = SimpleDateFormat("MMM dd",Locale.getDefault())

        when (position) {
            0 -> {
                 parsedDate = sdf.parse(datesList[0])
            }
            5 -> {
                 parsedDate = sdf.parse(datesList[8])
            }
            10 -> {
                parsedDate = sdf.parse(datesList[16])
            }
            15 -> {
                 parsedDate = sdf.parse(datesList[21])
            }
            20 -> {
                 parsedDate = sdf.parse(datesList[24])
            }
            25 -> {
                 parsedDate = sdf.parse(datesList[datesList.size-1])
            }
        }
        return sdf1.format(parsedDate)
    }
}