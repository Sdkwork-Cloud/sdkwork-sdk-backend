package com.sdkwork.backend

data class PlusAiModelInfoQueryListForm(
    val id: Int? = null,
    val createdAtFrom: String? = null,
    val createdAtTo: String? = null,
    val keyword: String? = null,
    val channel: String? = null,
    val modelType: String? = null,
    val status: String? = null,
    val family: String? = null,
    val vendor: String? = null,
    val openSource: Boolean? = null,
    val pricingType: String? = null,
    val lifecycleStage: String? = null,
    val minContextTokens: Int? = null,
    val supportReasoning: Boolean? = null,
    val supportMultimodal: Boolean? = null,
    val supportFunctionCall: Boolean? = null,
    val supportRealtime: Boolean? = null,
    val supportFineTuning: Boolean? = null
)
