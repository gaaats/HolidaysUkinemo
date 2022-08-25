package com.holidayscountrypackone.holidaysukraine.entity

import kotlin.random.Random

data class HolideyItemUI(
    val id: Long = Random.nextLong(from = 0, until = 1000000),
    val name: String,
    val date: String,
    val day: String,
)
