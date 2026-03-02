package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class UserOauthAccountApi(private val client: HttpClient) {

    /** Update user OAuth account */
    suspend fun update(body: PlusUserOAuthAccountForm): PlusApiResultPlusUserOAuthAccountVO? {
        return client.put(ApiPaths.backendPath("/user/oauth/account"), body) as? PlusApiResultPlusUserOAuthAccountVO
    }

    /** Create user OAuth account */
    suspend fun create(body: PlusUserOAuthAccountForm): PlusApiResultPlusUserOAuthAccountVO? {
        return client.post(ApiPaths.backendPath("/user/oauth/account"), body) as? PlusApiResultPlusUserOAuthAccountVO
    }

    /** Get user OAuth accounts by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusUserOAuthAccountVO? {
        return client.post(ApiPaths.backendPath("/user/oauth/account/list"), body, params) as? PlusApiResultPagePlusUserOAuthAccountVO
    }

    /** Get all user OAuth accounts */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusUserOAuthAccountVO? {
        return client.post(ApiPaths.backendPath("/user/oauth/account/list/all"), body) as? PlusApiResultListPlusUserOAuthAccountVO
    }

    /** Get user OAuth account by ID */
    suspend fun getById(id: String): PlusApiResultPlusUserOAuthAccountVO? {
        return client.get(ApiPaths.backendPath("/user/oauth/account/$id")) as? PlusApiResultPlusUserOAuthAccountVO
    }

    /** Delete user OAuth account */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/user/oauth/account/$id")) as? PlusApiResultBoolean
    }
}
