package com.example.vishingguard.pishing.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SmishingResponse(
    @SerialName("status") val status: Int,
    @SerialName("message") val message: String,
    @SerialName("data") val data: List<SmishingReport>
)

@Serializable
data class SmishingReport(
    @SerialName("smishingScript") val smishingScript: String,
    @SerialName("phone") val phone: String,
    @SerialName("created_at") val created_at: String,
    @SerialName("keywordComment") val keywordComment: String
)