package com.sdkwork.backend

data class AssetMediaResource(
    val id: Int? = null,
    val uuid: String? = null,
    val url: String? = null,
    val bytes: String? = null,
    val localFile: Any? = null,
    val base64: String? = null,
    val type: String? = null,
    val mimeType: String? = null,
    val size: Int? = null,
    val name: String? = null,
    val extension: String? = null,
    val tags: TagsContent? = null,
    val metadata: Map<String, Any>? = null,
    val prompt: String? = null,
    val image: ImageMediaResource? = null,
    val video: VideoMediaResource? = null,
    val audio: AudioMediaResource? = null,
    val music: MusicMediaResource? = null,
    val character: CharacterMediaResource? = null,
    val file: FileMediaResource? = null,
    val extraProps: Map<String, Any>? = null
)
