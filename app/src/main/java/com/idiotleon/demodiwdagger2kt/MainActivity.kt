package com.idiotleon.demodiwdagger2kt

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.idiotleon.demodiwdagger2kt.car.Car
import com.idiotleon.demodiwdagger2kt.car.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent = DaggerCarComponent.create()
        carComponent.inject(this)
        car.drive()
    }
}