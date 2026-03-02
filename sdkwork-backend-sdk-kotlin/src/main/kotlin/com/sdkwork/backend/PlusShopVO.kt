package com.sdkwork.backend

data class PlusShopVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val name: String? = null,
    val description: String? = null,
    val logo: ImageMediaResource? = null,
    val cover: ImageMediaResource? = null,
    val contactPhone: String? = null,
    val contactEmail: String? = null,
    val location: GeoPoint? = null,
    val address: String? = null,
    val licenseNumber: String? = null,
    val tags: List<String>? = null,
    val status: String? = null,
    val businessHours: String? = null
)
