package com.sdkwork.backend

data class VideoMediaResourceList(
    val videos: List<VideoMediaResource>? = null,
    val resources: List<AssetMediaResource>? = null
)
