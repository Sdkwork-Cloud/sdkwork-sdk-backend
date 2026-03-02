package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VoiceSpeakerApi(private val client: HttpClient) {

    /** Update an existing voice speaker */
    suspend fun update(body: PlusVoiceSpeakerForm): PlusApiResultPlusVoiceSpeakerVO? {
        return client.put(ApiPaths.backendPath("/voice/speaker"), body) as? PlusApiResultPlusVoiceSpeakerVO
    }

    /** Create a new voice speaker */
    suspend fun create(body: PlusVoiceSpeakerForm): PlusApiResultPlusVoiceSpeakerVO? {
        return client.post(ApiPaths.backendPath("/voice/speaker"), body) as? PlusApiResultPlusVoiceSpeakerVO
    }

    /** Get voice speakers by page */
    suspend fun listPublic(body: PlusVoiceSpeakerQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVoiceSpeakerVO? {
        return client.post(ApiPaths.backendPath("/voice/speaker/list_public"), body, params) as? PlusApiResultPagePlusVoiceSpeakerVO
    }

    /** Get voice speakers by page */
    suspend fun listByPage(body: PlusVoiceSpeakerQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVoiceSpeakerVO? {
        return client.post(ApiPaths.backendPath("/voice/speaker/list"), body, params) as? PlusApiResultPagePlusVoiceSpeakerVO
    }

    /** Get all voice speakers */
    suspend fun listAllEntities(body: PlusVoiceSpeakerQueryForm? = null): PlusApiResultListPlusVoiceSpeakerVO? {
        return client.post(ApiPaths.backendPath("/voice/speaker/list/all"), body) as? PlusApiResultListPlusVoiceSpeakerVO
    }

    /** Get a voice speaker by ID */
    suspend fun getById(id: String): PlusApiResultPlusVoiceSpeakerVO? {
        return client.get(ApiPaths.backendPath("/voice/speaker/$id")) as? PlusApiResultPlusVoiceSpeakerVO
    }

    /** Delete a voice speaker */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/voice/speaker/$id")) as? PlusApiResultBoolean
    }
}
