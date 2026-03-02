package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class KnowledgeBaseApi(private val client: HttpClient) {

    /** Update an existing knowledge base */
    suspend fun update(body: PlusKnowledgeBaseForm): PlusApiResultPlusKnowledgeBaseVO? {
        return client.put(ApiPaths.backendPath("/knowledge_base"), body) as? PlusApiResultPlusKnowledgeBaseVO
    }

    /** Create a new knowledge base */
    suspend fun create(body: PlusKnowledgeBaseForm): PlusApiResultPlusKnowledgeBaseVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base"), body) as? PlusApiResultPlusKnowledgeBaseVO
    }

    /** Get knowledge bases by page */
    suspend fun listByPage(body: QueryListForm? = null, params: Map<String, Any>? = null): PlusApiResultPagePlusKnowledgeBaseVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base/list"), body, params) as? PlusApiResultPagePlusKnowledgeBaseVO
    }

    /** Get all knowledge bases */
    suspend fun listAllEntities(body: QueryListForm? = null): PlusApiResultListPlusKnowledgeBaseVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base/list/all"), body) as? PlusApiResultListPlusKnowledgeBaseVO
    }

    /** Get a knowledge base detail by ID */
    suspend fun getDetail(params: Map<String, Any>? = null): PlusApiResultPlusKnowledgeBaseVO? {
        return client.post(ApiPaths.backendPath("/knowledge_base/get_detail"), null, params) as? PlusApiResultPlusKnowledgeBaseVO
    }

    /** Get a knowledge base by ID */
    suspend fun getById(id: String): PlusApiResultPlusKnowledgeBaseVO? {
        return client.get(ApiPaths.backendPath("/knowledge_base/$id")) as? PlusApiResultPlusKnowledgeBaseVO
    }

    /** Delete a knowledge base */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/knowledge_base/$id")) as? PlusApiResultBoolean
    }
}
