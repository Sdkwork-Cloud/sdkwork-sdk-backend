package com.sdkwork.backend.api

import com.sdkwork.backend.*
import com.sdkwork.backend.http.HttpClient

class NoteApi(private val client: HttpClient) {

    /** Update a note */
    suspend fun update(body: PlusNotesForm): PlusApiResultPlusNotesVO? {
        return client.put(ApiPaths.backendPath("/notes"), body) as? PlusApiResultPlusNotesVO
    }

    /** Create a note */
    suspend fun create(body: PlusNotesForm): PlusApiResultPlusNotesVO? {
        return client.post(ApiPaths.backendPath("/notes"), body) as? PlusApiResultPlusNotesVO
    }

    /** Publish notes directly */
    suspend fun publishNotesToMedia(body: PlusNotesMediaDraftForm): PlusApiResultPlusMediaPublishResultDTO? {
        return client.post(ApiPaths.backendPath("/notes/media/publish"), body) as? PlusApiResultPlusMediaPublishResultDTO
    }

    /** Query publish status */
    suspend fun queryMediaPublishStatus(body: PlusNotesMediaPublishStatusForm): PlusApiResultPlusMediaPublishResultDTO? {
        return client.post(ApiPaths.backendPath("/notes/media/publish/status"), body) as? PlusApiResultPlusMediaPublishResultDTO
    }

    /** Query published article */
    suspend fun queryPublishedArticle(body: PlusNotesMediaPublishedArticleForm): PlusApiResultPlusMediaPublishResultDTO? {
        return client.post(ApiPaths.backendPath("/notes/media/publish/article"), body) as? PlusApiResultPlusMediaPublishResultDTO
    }

    /** Create media draft */
    suspend fun createMediaDraft(body: PlusNotesMediaDraftForm): PlusApiResultPlusMediaPublishResultDTO? {
        return client.post(ApiPaths.backendPath("/notes/media/drafts"), body) as? PlusApiResultPlusMediaPublishResultDTO
    }

    /** Publish media draft */
    suspend fun publishMediaDraft(body: PlusNotesMediaPublishDraftForm): PlusApiResultPlusMediaPublishResultDTO? {
        return client.post(ApiPaths.backendPath("/notes/media/drafts/publish"), body) as? PlusApiResultPlusMediaPublishResultDTO
    }

    /** Preview media draft */
    suspend fun previewMediaDraft(body: PlusNotesMediaPreviewForm): PlusApiResultPlusMediaPublishResultDTO? {
        return client.post(ApiPaths.backendPath("/notes/media/drafts/preview"), body) as? PlusApiResultPlusMediaPublishResultDTO
    }

    /** Get note by UUID */
    suspend fun getByUuid(uuid: String): PlusApiResultPlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/$uuid")) as? PlusApiResultPlusNotesVO
    }

    /** Search notes */
    suspend fun search(params: Map<String, Any>? = null): PlusApiResultPagePlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/search"), params) as? PlusApiResultPagePlusNotesVO
    }

    /** Get paginated notes by user */
    suspend fun pageByUser(userId: String, params: Map<String, Any>? = null): PlusApiResultPagePlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/page_by_user/$userId"), params) as? PlusApiResultPagePlusNotesVO
    }

    /** Get paginated notes by tag */
    suspend fun pageByTag(params: Map<String, Any>? = null): PlusApiResultPagePlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/page_by_tag"), params) as? PlusApiResultPagePlusNotesVO
    }

    /** Get paginated notes by category */
    suspend fun pageByCategory(categoryId: String, params: Map<String, Any>? = null): PlusApiResultPagePlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/page_by_category/$categoryId"), params) as? PlusApiResultPagePlusNotesVO
    }

    /** Get paginated notes */
    suspend fun listByPage(params: Map<String, Any>? = null): PlusApiResultPagePlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/page"), params) as? PlusApiResultPagePlusNotesVO
    }

    /** List media publish records */
    suspend fun listMediaPublishRecords(noteId: String, params: Map<String, Any>? = null): PlusApiResultPagePlusMediaPublishRecordDTO? {
        return client.get(ApiPaths.backendPath("/notes/media/records/$noteId"), params) as? PlusApiResultPagePlusMediaPublishRecordDTO
    }

    /** List notes by user */
    suspend fun listByUserId(userId: String): PlusApiResultListPlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/list_by_user/$userId")) as? PlusApiResultListPlusNotesVO
    }

    /** List notes by tag */
    suspend fun listByTag(params: Map<String, Any>? = null): PlusApiResultListPlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/list_by_tag"), params) as? PlusApiResultListPlusNotesVO
    }

    /** List notes by category */
    suspend fun listByCategoryId(categoryId: String): PlusApiResultListPlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/list_by_category/$categoryId")) as? PlusApiResultListPlusNotesVO
    }

    /** Get note by ID */
    suspend fun getById(id: String): PlusApiResultPlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/id/$id")) as? PlusApiResultPlusNotesVO
    }

    /** List all notes */
    suspend fun listAll(): PlusApiResultListPlusNotesVO? {
        return client.get(ApiPaths.backendPath("/notes/all")) as? PlusApiResultListPlusNotesVO
    }

    /** Delete a note */
    suspend fun delete(id: String): PlusApiResultBoolean? {
        return client.delete(ApiPaths.backendPath("/notes/$id")) as? PlusApiResultBoolean
    }
}
