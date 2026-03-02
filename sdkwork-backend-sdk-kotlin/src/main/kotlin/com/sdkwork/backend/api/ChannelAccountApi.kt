package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChannelAccountApi(private val client: HttpClient) {

    /** Update channel account */
    suspend fun update(body: PlusChannelAccountForm): PlusApiResultPlusChannelAccountVO? {
        return client.put(ApiPaths.backendPath("/channel/account"), body) as? PlusApiResultPlusChannelAccountVO
    }

    /** Create channel account */
    suspend fun create(body: PlusChannelAccountForm): PlusApiResultPlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account"), body) as? PlusApiResultPlusChannelAccountVO
    }

    /** Get SMS channel accounts */
    suspend fun listSms(body: PlusChannelAccountQueryForm? = null): PlusApiResultListPlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account/list_sms"), body) as? PlusApiResultListPlusChannelAccountVO
    }

    /** Get payment channel accounts */
    suspend fun listPayment(body: PlusChannelAccountQueryForm? = null): PlusApiResultListPlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account/list_payment"), body) as? PlusApiResultListPlusChannelAccountVO
    }

    /** Get OSS channel accounts */
    suspend fun listOss(body: PlusChannelAccountQueryForm? = null): PlusApiResultListPlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account/list_oss"), body) as? PlusApiResultListPlusChannelAccountVO
    }

    /** Get official account channel accounts */
    suspend fun listOfficialAccount(body: PlusChannelAccountQueryForm? = null): PlusApiResultListPlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account/list_official_account"), body) as? PlusApiResultListPlusChannelAccountVO
    }

    /** Get mini program channel accounts */
    suspend fun listMiniProgram(body: PlusChannelAccountQueryForm? = null): PlusApiResultListPlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account/list_mini_program"), body) as? PlusApiResultListPlusChannelAccountVO
    }

    /** Get channel accounts by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account/list"), body, params) as? PlusApiResultPagePlusChannelAccountVO
    }

    /** Get all channel accounts */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account/list/all"), body) as? PlusApiResultListPlusChannelAccountVO
    }

    /** Get channel account by ID */
    suspend fun getById(id: String): PlusApiResultPlusChannelAccountVO? {
        return client.get(ApiPaths.backendPath("/channel/account/$id")) as? PlusApiResultPlusChannelAccountVO
    }

    /** Delete channel account */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/channel/account/$id")) as? PlusApiResultBoolean
    }
}
