package com.idiotleon.demodiwdagger2kt.car

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) {

    fun drive() {
        Log.d(TAG, "driving")
    }

    companion object {
        public val TAG = Car::class.simpleName
    }
}

class Engine @Inject constructor()
class Wheels @Inject constructor()