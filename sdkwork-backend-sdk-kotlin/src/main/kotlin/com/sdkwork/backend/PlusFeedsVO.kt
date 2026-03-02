package com.sdkwork.backend

data class PlusFeedsVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val userId: Int? = null,
    val title: String? = null,
    val summary: String? = null,
    val contentType: String? = null,
    val contentId: Int? = null,
    val coverImages: ImageMediaResourceList? = null,
    val resourceList: AssetMediaResourceList? = null,
    val author: AuthorInfo? = null,
    val source: String? = null,
    val publishTime: String? = null,
    val tags: TagsContent? = null,
    val status: String? = null,
    val viewCount: Int? = null,
    val likeCount: Int? = null,
    val commentCount: Int? = null
)
