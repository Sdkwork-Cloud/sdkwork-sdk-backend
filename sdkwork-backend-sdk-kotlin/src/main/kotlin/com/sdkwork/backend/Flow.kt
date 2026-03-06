package com.sdkwork.backend

data class Flow(
    val id: String? = null,
    val name: String? = null,
    val description: String? = null,
    val status: String? = null,
    val nodes: List<Node>? = null,
    val edges: List<EdgeObject>? = null,
    val subFlows: List<Flow>? = null,
    val parentId: Int? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val lastNode: Node? = null,
    val parentFlow: Flow? = null,
    val allAgents: List<PlusAgent>? = null
)
