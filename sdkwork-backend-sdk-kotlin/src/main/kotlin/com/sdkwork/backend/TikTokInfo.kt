package com.sdkwork.backend

data class TikTokInfo(
    val userId: String? = null,
    val username: String? = null,
    val displayName: String? = null,
    val avatarUrl: String? = null,
    val bio: String? = null,
    val isVerified: Boolean? = null,
    val followerCount: Int? = null,
    val followingCount: Int? = null,
    val likeCount: Int? = null
)
