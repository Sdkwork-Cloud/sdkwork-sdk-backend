package com.sdkwork.backend

data class PlusUserAddressVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val phone: String? = null,
    val countryCode: String? = null,
    val provinceCode: String? = null,
    val cityCode: String? = null,
    val districtCode: String? = null,
    val addressDetail: String? = null,
    val postalCode: String? = null,
    val isDefault: Boolean? = null,
    val tags: TagsContent? = null
)
