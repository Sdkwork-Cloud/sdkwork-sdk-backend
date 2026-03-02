package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ImageApi(private val client: HttpClient) {

    /** Update an existing image */
    suspend fun update(body: PlusImageForm): PlusApiResultPlusImageVO? {
        return client.put(ApiPaths.backendPath("/image"), body) as? PlusApiResultPlusImageVO
    }

    /** Create a new image */
    suspend fun create(body: PlusImageForm): PlusApiResultPlusImageVO? {
        return client.post(ApiPaths.backendPath("/image"), body) as? PlusApiResultPlusImageVO
    }

    /** Get images by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusImageVO? {
        return client.post(ApiPaths.backendPath("/image/list"), body, params) as? PlusApiResultPagePlusImageVO
    }

    /** Get all images */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusImageVO? {
        return client.post(ApiPaths.backendPath("/image/list/all"), body) as? PlusApiResultListPlusImageVO
    }

    /** Get an image by ID */
    suspend fun getById(id: String): PlusApiResultPlusImageVO? {
        return client.get(ApiPaths.backendPath("/image/$id")) as? PlusApiResultPlusImageVO
    }

    /** Delete an image */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/image/$id")) as? PlusApiResultBoolean
    }
}
