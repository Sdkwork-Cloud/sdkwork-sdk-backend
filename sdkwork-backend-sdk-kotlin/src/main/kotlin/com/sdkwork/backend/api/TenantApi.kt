package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class TenantApi(private val client: HttpClient) {

    /** Update an existing tenant */
    suspend fun update(body: PlusTenantForm): PlusApiResultPlusTenantVO? {
        return client.put(ApiPaths.backendPath("/tenant"), body) as? PlusApiResultPlusTenantVO
    }

    /** Create a new tenant */
    suspend fun create(body: PlusTenantForm): PlusApiResultPlusTenantVO? {
        return client.post(ApiPaths.backendPath("/tenant"), body) as? PlusApiResultPlusTenantVO
    }

    /** Uninstall app from tenant */
    suspend fun uninstall(id: String, body: PlusTenantForm): PlusApiResultPlusTenantVO? {
        return client.post(ApiPaths.backendPath("/tenant/$id/uninstall"), body) as? PlusApiResultPlusTenantVO
    }

    /** Install app for tenant */
    suspend fun install(id: String, body: PlusTenantForm): PlusApiResultPlusTenantVO? {
        return client.post(ApiPaths.backendPath("/tenant/$id/install"), body) as? PlusApiResultPlusTenantVO
    }

    /** Get tenant audit logs by page */
    suspend fun listAuditLogs(id: String, params: Map<String, Any>? = null): PlusApiResultPagePlusTenantAuditLogVO? {
        return client.post(ApiPaths.backendPath("/tenant/$id/audit_logs/list"), null, params) as? PlusApiResultPagePlusTenantAuditLogVO
    }

    /** Get tenants by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusTenantVO? {
        return client.post(ApiPaths.backendPath("/tenant/list"), body, params) as? PlusApiResultPagePlusTenantVO
    }

    /** Get all tenants */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusTenantVO? {
        return client.post(ApiPaths.backendPath("/tenant/list/all"), body) as? PlusApiResultListPlusTenantVO
    }

    /** Get access tokens */
    suspend fun getAccessTokens(body: GetAccessTokenForm): PlusApiResultListTokenResult? {
        return client.post(ApiPaths.backendPath("/tenant/get_access_tokens"), body) as? PlusApiResultListTokenResult
    }

    /** Get a tenant by ID */
    suspend fun getById(id: String): PlusApiResultPlusTenantVO? {
        return client.get(ApiPaths.backendPath("/tenant/$id")) as? PlusApiResultPlusTenantVO
    }

    /** Delete a tenant */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/tenant/$id")) as? PlusApiResultBoolean
    }
}
