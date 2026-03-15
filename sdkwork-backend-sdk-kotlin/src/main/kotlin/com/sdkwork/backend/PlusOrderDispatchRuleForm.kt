package com.sdkwork.backend

data class PlusOrderDispatchRuleForm(
    val taskCode: String? = null,
    val taskName: String? = null,
    val enabled: Boolean? = null,
    val allowGrab: Boolean? = null,
    val allowAssign: Boolean? = null,
    val defaultTaskConcurrentLimit: Int? = null,
    val metadata: OrderDispatchRuleMetadata? = null
)
