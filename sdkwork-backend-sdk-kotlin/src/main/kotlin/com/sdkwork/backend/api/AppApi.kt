package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class AppApi(private val client: HttpClient) {

    /** Get app SDK config */
    suspend fun getSdkConfig(body: CreateJsapiSignatureForm): PlusApiResultAppSdkConfigVO? {
        return client.post(ApiPaths.backendPath("/app/get_sdk_config"), body) as? PlusApiResultAppSdkConfigVO
    }

    /** Get app info */
    suspend fun getAppInfo(): PlusApiResultAppInfoVO? {
        return client.get(ApiPaths.backendPath("/app/info")) as? PlusApiResultAppInfoVO
    }
}
