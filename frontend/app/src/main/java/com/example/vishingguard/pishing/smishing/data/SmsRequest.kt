package com.example.vishingguard.pishing.smishing.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SmsRequest(
    @SerialName("smishingScript")
    val smishingScript: String,
    @SerialName("phone")
    val phone: String
)