package com.sdkwork.backend

data class PPTNote(
    val id: String? = null,
    val content: String? = null,
    val time: Int? = null,
    val user: String? = null,
    val elId: String? = null,
    val replies: List<PPTNoteReply>? = null
)
