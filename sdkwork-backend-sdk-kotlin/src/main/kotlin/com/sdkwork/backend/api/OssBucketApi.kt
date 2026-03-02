package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class OssBucketApi(private val client: HttpClient) {

    /** Update an existing OSS bucket */
    suspend fun update(body: PlusOssBucketForm): PlusApiResultPlusOssBucketVO? {
        return client.put(ApiPaths.backendPath("/oss/bucket"), body) as? PlusApiResultPlusOssBucketVO
    }

    /** Create a new OSS bucket */
    suspend fun create(body: PlusOssBucketForm): PlusApiResultPlusOssBucketVO? {
        return client.post(ApiPaths.backendPath("/oss/bucket"), body) as? PlusApiResultPlusOssBucketVO
    }

    /** Get OSS buckets by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusOssBucketVO? {
        return client.post(ApiPaths.backendPath("/oss/bucket/list"), body, params) as? PlusApiResultPagePlusOssBucketVO
    }

    /** Get all OSS buckets */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusOssBucketVO? {
        return client.post(ApiPaths.backendPath("/oss/bucket/list/all"), body) as? PlusApiResultListPlusOssBucketVO
    }

    /** Get an OSS bucket by ID */
    suspend fun getById(id: String): PlusApiResultPlusOssBucketVO? {
        return client.get(ApiPaths.backendPath("/oss/bucket/$id")) as? PlusApiResultPlusOssBucketVO
    }

    /** Delete an OSS bucket */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/oss/bucket/$id")) as? PlusApiResultBoolean
    }
}
