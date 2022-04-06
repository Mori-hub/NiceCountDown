package com.src.ncd

import android.app.Activity
import android.content.res.Resources
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout

class CountView(
    activity: Activity,
    parentLayout: Int,
    val finishFunction: (() -> Unit),
    val runningFunction: (() -> Unit)? = null,
    timerTheme: String? = null
) {

    var res: Resources = activity.resources
    var packageName: String = activity.packageName
    var isPaused = false
    var view: View
     var timerPause: View? =null
     var timerStop: View? = null
    var t: String = "d"

    init {
        val rootLayout = activity.window.decorView.rootView
        val parent: RelativeLayout = rootLayout.findViewById(parentLayout)
        view =
            LayoutInflater.from(activity).inflate(R.layout.countview, parent, false)
        val nameT: String = themeBack(timerTheme) + "0"

        view.findViewById<ImageView>(R.id.ivTimer).setImageResource(
            res.getIdentifier(
                nameT,
                "drawable",
                packageName
            )
        )
        view.findViewById<ImageView>(R.id.ivTimer2).setImageResource(
            res.getIdentifier(
                nameT,
                "drawable",
                packageName
            )
        )
        view.findViewById<ImageView>(R.id.ivTimer3).setImageResource(
            res.getIdentifier(
                nameT,
                "drawable",
                packageName
            )
        )
        view.findViewById<ImageView>(R.id.ivTimer4).setImageResource(
            res.getIdentifier(
                nameT,
                "drawable",
                packageName
            )
        )
        view.findViewById<ImageView>(R.id.ivTimer5).setImageResource(
            res.getIdentifier(
                nameT + "0",
                "drawable",
                packageName
            )
        )
        parent.apply { addView(view) }
    }

    fun startTimer(timeMin: Int, timeSeconds: Int) {
        val timeStart: Int = (60000 * timeMin) + (1000 * timeSeconds)
        object : CountDownTimer(timeStart.toLong(), 1000) {
            override fun onTick(p0: Long) {

                var num: Int = (p0 / 1000).toInt()


                val m = (p0 - 60000)
                val p = (p0 / 60000).toInt()
                var c = 0
                var f = 0
                if (m > 0) {
                    num = (((p0) / 1000).toInt() - p * 60)
                    c = Math.round((m / 60000).toDouble()).toInt() + 1
                    if (c > 9) {
                        f = c / 10
                        c %= 10
                    }
                }

                val resID = res.getIdentifier(
                    "$t${num % 10}",
                    "drawable", packageName
                )

                val resID2 = res.getIdentifier(
                    "$t${(num / 10)}",
                    "drawable", packageName
                )
                val resID3 = res.getIdentifier(
                    "$t$c",
                    "drawable", packageName
                )
                val resID4 = res.getIdentifier(
                    "$t${(f)}",
                    "drawable", packageName
                )

                val resID5 = res.getIdentifier(
                    t + "00",
                    "drawable", packageName
                )
                view.findViewById<ImageView>(R.id.ivTimer).setImageResource(resID)
                view.findViewById<ImageView>(R.id.ivTimer2).setImageResource(resID2)
                view.findViewById<ImageView>(R.id.ivTimer3).setImageResource(resID3)
                view.findViewById<ImageView>(R.id.ivTimer4).setImageResource(resID4)
                view.findViewById<ImageView>(R.id.ivTimer5).setImageResource(resID5)
                timerStop?.setOnClickListener {

                    startTimer(0, 1)
                    cancel()
                }
                timerPause?.setOnClickListener {
                    if (isPaused) {
                        cancel()
                        startTimer(0, (p0 / 1000).toInt())
                        isPaused = false
                        println(isPaused)
                    } else {
                        cancel()
                        isPaused = true
                        println(isPaused)
                    }
                }
                runningFunction?.invoke()
            }
            override fun onFinish() {
                finishFunction.invoke()
                println("Finish")

            }

        }.start()
    }

    fun buttons(buttonStop: View, buttonPause: View) {
        this.timerStop = buttonStop
        this.timerPause = buttonPause
    }

    private fun themeBack(timerTheme: String? = null): String {
        when (timerTheme) {
            null -> {
                t = "d"
            }
            "black" -> {
                t = "b"
            }
            "wooden" -> {
                t = "t"
            }
            "happy" -> {
                t = "h"
            }
            "neon" -> {
                t = "n"
            }
            "classic" -> {
                t = "c"
            }
        }
        return t
    }
}