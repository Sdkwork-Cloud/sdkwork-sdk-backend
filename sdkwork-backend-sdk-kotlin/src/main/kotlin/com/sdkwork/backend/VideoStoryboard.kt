package com.sdkwork.backend

data class VideoStoryboard(
    val shots: List<VideoShotItem>? = null,
    val finalVideo: VideoMediaResource? = null,
    val finalAudio: AudioMediaResource? = null,
    val title: String? = null,
    val description: String? = null,
    val style: String? = null,
    val aspectRatio: String? = null,
    val prompt: String? = null,
    val duration: Double? = null,
    val speaker: VoiceSpeakerInfo? = null
)
