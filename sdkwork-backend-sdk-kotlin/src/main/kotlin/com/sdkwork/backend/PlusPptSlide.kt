package com.sdkwork.backend

data class PlusPptSlide(
    val id: String? = null,
    val elements: List<PPTBaseElement>? = null,
    val notes: List<PPTNote>? = null,
    val remark: String? = null,
    val background: PPTSlideBackground? = null,
    val animations: List<PPTAnimation>? = null,
    val turningMode: PPTTurningMode? = null,
    val sectionTag: PPTSectionTag? = null,
    val type: PPTSlideType? = null,
    val payload: PlusPptPayload? = null
)
