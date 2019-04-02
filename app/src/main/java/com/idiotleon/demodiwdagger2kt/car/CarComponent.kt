package com.idiotleon.demodiwdagger2kt.car

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}