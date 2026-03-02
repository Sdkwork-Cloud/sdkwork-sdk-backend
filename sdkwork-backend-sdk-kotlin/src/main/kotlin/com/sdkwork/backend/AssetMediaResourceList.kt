package com.sdkwork.backend

data class AssetMediaResourceList(
    val images: List<ImageMediaResource>? = null,
    val videos: List<VideoMediaResource>? = null,
    val audios: List<AudioMediaResource>? = null,
    val files: List<FileMediaResource>? = null,
    val musics: List<MusicMediaResource>? = null,
    val resources: List<AssetMediaResource>? = null
)
