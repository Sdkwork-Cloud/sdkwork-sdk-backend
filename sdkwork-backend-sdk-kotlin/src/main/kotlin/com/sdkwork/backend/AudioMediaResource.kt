package com.sdkwork.backend

data class AudioMediaResource(
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
    val format: String? = null,
    val bitRate: Int? = null,
    val sampleRate: Int? = null,
    val channels: Int? = null,
    val duration: Int? = null
)
