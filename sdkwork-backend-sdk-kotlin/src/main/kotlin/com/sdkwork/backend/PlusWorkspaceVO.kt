package com.sdkwork.backend

data class PlusWorkspaceVO(
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val id: Int? = null,
    val uuid: String? = null,
    val name: String? = null,
    val code: String? = null,
    val title: String? = null,
    val description: String? = null,
    val icon: String? = null,
    val color: String? = null,
    val type: String? = null,
    val status: String? = null,
    val ownerId: Int? = null,
    val leaderId: Int? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val maxMembers: Int? = null,
    val currentMembers: Int? = null,
    val maxStorage: Int? = null,
    val usedStorage: Int? = null,
    val settings: Map<String, Any>? = null,
    val isDeleted: Boolean? = null,
    val isPublic: Boolean? = null,
    val isTemplate: Boolean? = null
)
