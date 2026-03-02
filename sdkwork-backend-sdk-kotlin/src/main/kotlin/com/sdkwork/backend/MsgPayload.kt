package com.sdkwork.backend

data class MsgPayload(
    val audio: MsgAudioContent? = null,
    val file: MsgFileContent? = null,
    val image: MsgImageContent? = null,
    val location: MsgLocationContent? = null,
    val music: MsgMusicContent? = null,
    val text: MsgTextContent? = null,
    val video: MsgVideoContent? = null
)
