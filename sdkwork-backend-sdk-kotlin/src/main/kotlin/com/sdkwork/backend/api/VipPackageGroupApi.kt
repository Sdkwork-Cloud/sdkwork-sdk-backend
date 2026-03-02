package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class VipPackageGroupApi(private val client: HttpClient) {

    /** Update an existing VIP package group */
    suspend fun update(body: PlusVipPackGroupForm): PlusApiResultPlusVipPackGroupVO? {
        return client.put(ApiPaths.backendPath("/vip/pack_group"), body) as? PlusApiResultPlusVipPackGroupVO
    }

    /** Create a new VIP package group */
    suspend fun create(body: PlusVipPackGroupForm): PlusApiResultPlusVipPackGroupVO? {
        return client.post(ApiPaths.backendPath("/vip/pack_group"), body) as? PlusApiResultPlusVipPackGroupVO
    }

    /** List public */
    suspend fun listPublic(body: PlusVipPackGroupQueryForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipPackGroupVO? {
        return client.post(ApiPaths.backendPath("/vip/pack_group/list_public"), body, params) as? PlusApiResultPagePlusVipPackGroupVO
    }

    /** Get VIP package groups by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusVipPackGroupVO? {
        return client.post(ApiPaths.backendPath("/vip/pack_group/list"), body, params) as? PlusApiResultPagePlusVipPackGroupVO
    }

    /** Get all VIP package groups */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusVipPackGroupVO? {
        return client.post(ApiPaths.backendPath("/vip/pack_group/list/all"), body) as? PlusApiResultListPlusVipPackGroupVO
    }

    /** Get a VIP package group by ID */
    suspend fun getById(id: String): PlusApiResultPlusVipPackGroupVO? {
        return client.get(ApiPaths.backendPath("/vip/pack_group/$id")) as? PlusApiResultPlusVipPackGroupVO
    }

    /** Delete a VIP package group */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/vip/pack_group/$id")) as? PlusApiResultBoolean
    }
}
