package com.sdkwork.backend

data class PlusMusicVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val version: Int? = null,
    val title: String? = null,
    val coverImages: ImageMediaResourceList? = null,
    val description: String? = null,
    val resource: MusicMediaResource? = null,
    val author: AuthorInfo? = null,
    val contentUrl: String? = null,
    val resourceList: AssetMediaResourceList? = null,
    val format: String? = null,
    val duration: Int? = null,
    val fileSize: Int? = null,
    val thumbnailUrl: String? = null,
    val artist: String? = null,
    val genre: String? = null,
    val bitrate: Int? = null,
    val status: String? = null
)
