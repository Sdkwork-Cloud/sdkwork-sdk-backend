package com.sdkwork.backend

data class PlusMusicForm(
    val title: String? = null,
    val description: String? = null,
    val contentUrl: String? = null,
    val format: String? = null,
    val duration: Int? = null,
    val fileSize: Int? = null,
    val thumbnailUrl: String? = null,
    val artist: String? = null,
    val genre: String? = null,
    val bitrate: Int? = null,
    val status: String? = null
)
