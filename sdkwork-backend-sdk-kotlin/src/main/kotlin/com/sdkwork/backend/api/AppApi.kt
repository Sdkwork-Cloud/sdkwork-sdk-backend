package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AppApi(private val client: HttpClient) {

    /** Update application */
    suspend fun update(body: PlusAppForm): PlusApiResultPlusAppVO? {
        return client.put(ApiPaths.backendPath("/app"), body) as? PlusApiResultPlusAppVO
    }

    /** Create application */
    suspend fun create(body: PlusAppForm): PlusApiResultPlusAppVO? {
        return client.post(ApiPaths.backendPath("/app"), body) as? PlusApiResultPlusAppVO
    }

    /** Get applications by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusAppVO? {
        return client.post(ApiPaths.backendPath("/app/list"), body, params) as? PlusApiResultPagePlusAppVO
    }

    /** Get all applications */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusAppVO? {
        return client.post(ApiPaths.backendPath("/app/list/all"), body) as? PlusApiResultListPlusAppVO
    }

    /** Get app SDK config */
    suspend fun getSdkConfig(body: CreateJsapiSignatureForm): PlusApiResultAppSdkConfigVO? {
        return client.post(ApiPaths.backendPath("/app/get_sdk_config"), body) as? PlusApiResultAppSdkConfigVO
    }

    /** Get application by ID */
    suspend fun getById(id: String): PlusApiResultPlusAppVO? {
        return client.get(ApiPaths.backendPath("/app/$id")) as? PlusApiResultPlusAppVO
    }

    /** Delete application */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/app/$id")) as? PlusApiResultBoolean
    }

    /** Get app info */
    suspend fun getAppInfo(): PlusApiResultAppInfoVO? {
        return client.get(ApiPaths.backendPath("/app/info")) as? PlusApiResultAppInfoVO
    }
}
