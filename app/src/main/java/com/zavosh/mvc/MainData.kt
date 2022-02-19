package com.zavosh.mvc

import androidx.databinding.BaseObservable

data class MainData(
    var textCountOne: String = "Count 0",
    var textCountTwo: String = "Count 0",
    var textCountThree: String = "Count 0",
) : BaseObservable()