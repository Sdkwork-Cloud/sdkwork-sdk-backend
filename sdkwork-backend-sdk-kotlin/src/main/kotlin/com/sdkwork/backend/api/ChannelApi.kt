package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ChannelApi(private val client: HttpClient) {

    /** Update channel */
    suspend fun update(body: PlusChannelForm): PlusApiResultPlusChannelVO? {
        return client.put(ApiPaths.backendPath("/channel"), body) as? PlusApiResultPlusChannelVO
    }

    /** Create channel */
    suspend fun create(body: PlusChannelForm): PlusApiResultPlusChannelVO? {
        return client.post(ApiPaths.backendPath("/channel"), body) as? PlusApiResultPlusChannelVO
    }

    /** Update an existing channel resource */
    suspend fun updateResource(body: PlusChannelResourceForm): PlusApiResultPlusChannelResourceVO? {
        return client.put(ApiPaths.backendPath("/channel/resource"), body) as? PlusApiResultPlusChannelResourceVO
    }

    /** Create a new channel resource */
    suspend fun createResource(body: PlusChannelResourceForm): PlusApiResultPlusChannelResourceVO? {
        return client.post(ApiPaths.backendPath("/channel/resource"), body) as? PlusApiResultPlusChannelResourceVO
    }

    /** Update channel proxy */
    suspend fun updateProxy(body: PlusChannelProxyForm): PlusApiResultPlusChannelProxyVO? {
        return client.put(ApiPaths.backendPath("/channel/proxy"), body) as? PlusApiResultPlusChannelProxyVO
    }

    /** Create channel proxy */
    suspend fun createProxy(body: PlusChannelProxyForm): PlusApiResultPlusChannelProxyVO? {
        return client.post(ApiPaths.backendPath("/channel/proxy"), body) as? PlusApiResultPlusChannelProxyVO
    }

    /** Update channel account */
    suspend fun updateAccount(body: PlusChannelAccountForm): PlusApiResultPlusChannelAccountVO? {
        return client.put(ApiPaths.backendPath("/channel/account"), body) as? PlusApiResultPlusChannelAccountVO
    }

    /** Create channel account */
    suspend fun createAccount(body: PlusChannelAccountForm): PlusApiResultPlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account"), body) as? PlusApiResultPlusChannelAccountVO
    }

    /** Get channel resources by page */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChannelResourceVO? {
        return client.post(ApiPaths.backendPath("/channel/resource/list"), body, params) as? PlusApiResultPagePlusChannelResourceVO
    }

    /** Get all channel resources */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusChannelResourceVO? {
        return client.post(ApiPaths.backendPath("/channel/resource/list/all"), body) as? PlusApiResultListPlusChannelResourceVO
    }

    /** List channel proxies by page */
    suspend fun createListByPageProxy(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChannelProxyVO? {
        return client.post(ApiPaths.backendPath("/channel/proxy/list"), body, params) as? PlusApiResultPagePlusChannelProxyVO
    }

    /** List all channel proxies */
    suspend fun createListAllEntitiesProxy(body: QueryListForm? = null): PlusApiResultListPlusChannelProxyVO? {
        return client.post(ApiPaths.backendPath("/channel/proxy/list/all"), body) as? PlusApiResultListPlusChannelProxyVO
    }

    /** List channels by page */
    suspend fun createListByPageChannel(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChannelVO? {
        return client.post(ApiPaths.backendPath("/channel/list"), body, params) as? PlusApiResultPagePlusChannelVO
    }

    /** List all channels */
    suspend fun createListAllEntitiesChannel(body: QueryListForm? = null): PlusApiResultListPlusChannelVO? {
        return client.post(ApiPaths.backendPath("/channel/list/all"), body) as? PlusApiResultListPlusChannelVO
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
    suspend fun createListByPageAccount(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account/list"), body, params) as? PlusApiResultPagePlusChannelAccountVO
    }

    /** Get all channel accounts */
    suspend fun createListAllEntitiesAccount(body: QueryListForm? = null): PlusApiResultListPlusChannelAccountVO? {
        return client.post(ApiPaths.backendPath("/channel/account/list/all"), body) as? PlusApiResultListPlusChannelAccountVO
    }

    /** Get channel by ID */
    suspend fun getById(id: String): PlusApiResultPlusChannelVO? {
        return client.get(ApiPaths.backendPath("/channel/$id")) as? PlusApiResultPlusChannelVO
    }

    /** Delete channel */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/channel/$id")) as? PlusApiResultBoolean
    }

    /** Get a channel resource by ID */
    suspend fun getByIdResource(id: String): PlusApiResultPlusChannelResourceVO? {
        return client.get(ApiPaths.backendPath("/channel/resource/$id")) as? PlusApiResultPlusChannelResourceVO
    }

    /** Delete a channel resource */
    suspend fun deleteResource(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/channel/resource/$id")) as? PlusApiResultBoolean
    }

    /** Get channel proxy by ID */
    suspend fun getByIdProxy(id: String): PlusApiResultPlusChannelProxyVO? {
        return client.get(ApiPaths.backendPath("/channel/proxy/$id")) as? PlusApiResultPlusChannelProxyVO
    }

    /** Delete channel proxy */
    suspend fun deleteProxy(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/channel/proxy/$id")) as? PlusApiResultBoolean
    }

    /** Get channel account by ID */
    suspend fun getByIdAccount(id: String): PlusApiResultPlusChannelAccountVO? {
        return client.get(ApiPaths.backendPath("/channel/account/$id")) as? PlusApiResultPlusChannelAccountVO
    }

    /** Delete channel account */
    suspend fun deleteAccount(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/channel/account/$id")) as? PlusApiResultBoolean
    }
}
