package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class DnsRecordApi(private val client: HttpClient) {

    /** Update an existing DNS record */
    suspend fun update(body: PlusDnsRecordForm): PlusApiResultPlusDnsRecordVO? {
        return client.put(ApiPaths.backendPath("/net/dns/record"), body) as? PlusApiResultPlusDnsRecordVO
    }

    /** Create a new DNS record */
    suspend fun create(body: PlusDnsRecordForm): PlusApiResultPlusDnsRecordVO? {
        return client.post(ApiPaths.backendPath("/net/dns/record"), body) as? PlusApiResultPlusDnsRecordVO
    }

    /** Get DNS records by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusDnsRecordVO? {
        return client.post(ApiPaths.backendPath("/net/dns/record/list"), body, params) as? PlusApiResultPagePlusDnsRecordVO
    }

    /** Get all DNS records */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusDnsRecordVO? {
        return client.post(ApiPaths.backendPath("/net/dns/record/list/all"), body) as? PlusApiResultListPlusDnsRecordVO
    }

    /** Get a DNS record by ID */
    suspend fun getById(id: String): PlusApiResultPlusDnsRecordVO? {
        return client.get(ApiPaths.backendPath("/net/dns/record/$id")) as? PlusApiResultPlusDnsRecordVO
    }

    /** Delete a DNS record */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/net/dns/record/$id")) as? PlusApiResultBoolean
    }
}
