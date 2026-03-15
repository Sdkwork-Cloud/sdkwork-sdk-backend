package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class NetApi(private val client: HttpClient) {

    /** 更新域名 */
    suspend fun update(body: PlusHostDomainForm): PlusApiResultPlusHostDomainVO? {
        return client.put(ApiPaths.backendPath("/net/host/domain"), body) as? PlusApiResultPlusHostDomainVO
    }

    /** 创建域名 */
    suspend fun create(body: PlusHostDomainForm): PlusApiResultPlusHostDomainVO? {
        return client.post(ApiPaths.backendPath("/net/host/domain"), body) as? PlusApiResultPlusHostDomainVO
    }

    /** Update an existing DNS record */
    suspend fun updateRecord(body: PlusDnsRecordForm): PlusApiResultPlusDnsRecordVO? {
        return client.put(ApiPaths.backendPath("/net/dns/record"), body) as? PlusApiResultPlusDnsRecordVO
    }

    /** Create a new DNS record */
    suspend fun createRecord(body: PlusDnsRecordForm): PlusApiResultPlusDnsRecordVO? {
        return client.post(ApiPaths.backendPath("/net/dns/record"), body) as? PlusApiResultPlusDnsRecordVO
    }

    /** 分页获取域名 */
    suspend fun createListByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusHostDomainVO? {
        return client.post(ApiPaths.backendPath("/net/host/domain/list"), body, params) as? PlusApiResultPagePlusHostDomainVO
    }

    /** 获取所有域名 */
    suspend fun createListAllEntities(body: QueryListForm? = null): PlusApiResultListPlusHostDomainVO? {
        return client.post(ApiPaths.backendPath("/net/host/domain/list/all"), body) as? PlusApiResultListPlusHostDomainVO
    }

    /** Get DNS records by page */
    suspend fun createListByPageRecord(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDnsRecordVO? {
        return client.post(ApiPaths.backendPath("/net/dns/record/list"), body, params) as? PlusApiResultPagePlusDnsRecordVO
    }

    /** Get all DNS records */
    suspend fun createListAllEntitiesRecord(body: QueryListForm? = null): PlusApiResultListPlusDnsRecordVO? {
        return client.post(ApiPaths.backendPath("/net/dns/record/list/all"), body) as? PlusApiResultListPlusDnsRecordVO
    }

    /** 获取域名详情 */
    suspend fun getById(id: String): PlusApiResultPlusHostDomainVO? {
        return client.get(ApiPaths.backendPath("/net/host/domain/$id")) as? PlusApiResultPlusHostDomainVO
    }

    /** 删除域名 */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/net/host/domain/$id")) as? PlusApiResultBoolean
    }

    /** Get a DNS record by ID */
    suspend fun getByIdRecord(id: String): PlusApiResultPlusDnsRecordVO? {
        return client.get(ApiPaths.backendPath("/net/dns/record/$id")) as? PlusApiResultPlusDnsRecordVO
    }

    /** Delete a DNS record */
    suspend fun deleteRecord(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/net/dns/record/$id")) as? PlusApiResultBoolean
    }
}
