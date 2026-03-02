package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class HostApi(private val client: HttpClient) {

    /** 更新域名 */
    suspend fun update(body: PlusHostDomainForm): PlusApiResultPlusHostDomainVO? {
        return client.put(ApiPaths.backendPath("/net/host/domain"), body) as? PlusApiResultPlusHostDomainVO
    }

    /** 创建域名 */
    suspend fun create(body: PlusHostDomainForm): PlusApiResultPlusHostDomainVO? {
        return client.post(ApiPaths.backendPath("/net/host/domain"), body) as? PlusApiResultPlusHostDomainVO
    }

    /** 分页获取域名 */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusHostDomainVO? {
        return client.post(ApiPaths.backendPath("/net/host/domain/list"), body, params) as? PlusApiResultPagePlusHostDomainVO
    }

    /** 获取所有域名 */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusHostDomainVO? {
        return client.post(ApiPaths.backendPath("/net/host/domain/list/all"), body) as? PlusApiResultListPlusHostDomainVO
    }

    /** 获取域名详情 */
    suspend fun getById(id: String): PlusApiResultPlusHostDomainVO? {
        return client.get(ApiPaths.backendPath("/net/host/domain/$id")) as? PlusApiResultPlusHostDomainVO
    }

    /** 删除域名 */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/net/host/domain/$id")) as? PlusApiResultBoolean
    }
}
