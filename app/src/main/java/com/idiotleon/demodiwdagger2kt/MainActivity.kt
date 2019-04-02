package com.idiotleon.demodiwdagger2kt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.idiotleon.demodiwdagger2kt.car.Car
import com.idiotleon.demodiwdagger2kt.car.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    private lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent = DaggerCarComponent.create()
        car = carComponent.getCar()
        car.drive()
    }
}