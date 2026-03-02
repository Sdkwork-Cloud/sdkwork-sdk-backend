package com.sdkwork.backend

data class MsgMusicContent(
    val content: String? = null,
    val resource: MusicMediaResource? = null,
    val title: String? = null,
    val artist: String? = null,
    val album: String? = null,
    val duration: Int? = null
)
