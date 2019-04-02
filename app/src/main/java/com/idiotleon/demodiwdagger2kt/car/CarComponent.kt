package com.idiotleon.demodiwdagger2kt.car

import com.idiotleon.demodiwdagger2kt.MainActivity
import dagger.Component

@Component
interface CarComponent {
    // For constructor injection
    fun getCar(): Car

    // For field injectioin
    fun inject(mainActivity: MainActivity)
}