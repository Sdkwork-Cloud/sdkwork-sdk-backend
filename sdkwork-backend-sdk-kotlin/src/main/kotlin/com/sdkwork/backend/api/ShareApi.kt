package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class ShareApi(private val client: HttpClient) {

    /** 更新分享 */
    suspend fun update(body: PlusShareForm): PlusApiResultPlusShareVO? {
        return client.put(ApiPaths.backendPath("/share"), body) as? PlusApiResultPlusShareVO
    }

    /** 创建分享 */
    suspend fun create(body: PlusShareForm): PlusApiResultPlusShareVO? {
        return client.post(ApiPaths.backendPath("/share"), body) as? PlusApiResultPlusShareVO
    }

    /** 分页获取分享 */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusShareVO? {
        return client.post(ApiPaths.backendPath("/share/list"), body, params) as? PlusApiResultPagePlusShareVO
    }

    /** 获取所有分享 */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusShareVO? {
        return client.post(ApiPaths.backendPath("/share/list/all"), body) as? PlusApiResultListPlusShareVO
    }

    /** 获取分享详情 */
    suspend fun getById(id: String): PlusApiResultPlusShareVO? {
        return client.get(ApiPaths.backendPath("/share/$id")) as? PlusApiResultPlusShareVO
    }

    /** 删除分享 */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/share/$id")) as? PlusApiResultBoolean
    }
}
