package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChatParticipantApi(private val client: HttpClient) {

    /** Update an existing chat participant */
    suspend fun update(body: PlusParticipantForm): PlusApiResultPlusParticipantVO? {
        return client.put(ApiPaths.backendPath("/participant"), body) as? PlusApiResultPlusParticipantVO
    }

    /** Create a new chat participant */
    suspend fun create(body: PlusParticipantForm): PlusApiResultPlusParticipantVO? {
        return client.post(ApiPaths.backendPath("/participant"), body) as? PlusApiResultPlusParticipantVO
    }

    /** Get chat participants by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusParticipantVO? {
        return client.post(ApiPaths.backendPath("/participant/list"), body, params) as? PlusApiResultPagePlusParticipantVO
    }

    /** Get all chat participants */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusParticipantVO? {
        return client.post(ApiPaths.backendPath("/participant/list/all"), body) as? PlusApiResultListPlusParticipantVO
    }

    /** Get a chat participant by ID */
    suspend fun getById(id: String): PlusApiResultPlusParticipantVO? {
        return client.get(ApiPaths.backendPath("/participant/$id")) as? PlusApiResultPlusParticipantVO
    }

    /** Delete a chat participant */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/participant/$id")) as? PlusApiResultBoolean
    }
}
