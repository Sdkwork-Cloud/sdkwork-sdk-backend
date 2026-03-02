package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class CharacterApi(private val client: HttpClient) {

    /** Update character */
    suspend fun update(body: PlusCharacterForm): PlusApiResultPlusCharacterVO? {
        return client.put(ApiPaths.backendPath("/character"), body) as? PlusApiResultPlusCharacterVO
    }

    /** Create character */
    suspend fun create(body: PlusCharacterForm): PlusApiResultPlusCharacterVO? {
        return client.post(ApiPaths.backendPath("/character"), body) as? PlusApiResultPlusCharacterVO
    }

    /** Get characters by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusCharacterVO? {
        return client.post(ApiPaths.backendPath("/character/list"), body, params) as? PlusApiResultPagePlusCharacterVO
    }

    /** Get all characters */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusCharacterVO? {
        return client.post(ApiPaths.backendPath("/character/list/all"), body) as? PlusApiResultListPlusCharacterVO
    }

    /** Get character by ID */
    suspend fun getById(id: String): PlusApiResultPlusCharacterVO? {
        return client.get(ApiPaths.backendPath("/character/$id")) as? PlusApiResultPlusCharacterVO
    }

    /** Delete character */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/character/$id")) as? PlusApiResultBoolean
    }
}
