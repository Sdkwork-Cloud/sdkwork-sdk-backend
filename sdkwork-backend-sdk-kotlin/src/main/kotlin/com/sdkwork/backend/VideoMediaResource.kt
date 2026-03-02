package com.sdkwork.backend

data class VideoMediaResource(
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
    val duration: Int? = null,
    val width: Int? = null,
    val height: Int? = null
)
