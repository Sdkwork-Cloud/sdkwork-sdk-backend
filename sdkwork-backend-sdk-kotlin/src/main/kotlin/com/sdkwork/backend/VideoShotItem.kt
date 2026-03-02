package com.sdkwork.backend

data class VideoShotItem(
    val id: String? = null,
    val uuid: String? = null,
    val shotPrompt: String? = null,
    val dialogue: String? = null,
    val duration: Double? = null,
    val startFrame: ImageMediaResource? = null,
    val endFrame: ImageMediaResource? = null,
    val image: ImageMediaResource? = null,
    val resourceList: AssetMediaResourceList? = null,
    val emotion: String? = null,
    val videoDescription: String? = null,
    val video: VideoMediaResource? = null
)
