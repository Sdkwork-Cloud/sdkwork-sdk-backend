package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class NotesApi {
    private final HttpClient client;
    
    public NotesApi(HttpClient client) {
        this.client = client;
    }

    /** Update a note */
    public PlusApiResultPlusNotesVO update(PlusNotesForm body) throws Exception {
        return (PlusApiResultPlusNotesVO) client.put(ApiPaths.backendPath("/notes"), body);
    }

    /** Create a note */
    public PlusApiResultPlusNotesVO create(PlusNotesForm body) throws Exception {
        return (PlusApiResultPlusNotesVO) client.post(ApiPaths.backendPath("/notes"), body);
    }

    /** Publish notes directly */
    public PlusApiResultPlusMediaPublishResultDTO publishNotesToMedia(PlusNotesMediaDraftForm body) throws Exception {
        return (PlusApiResultPlusMediaPublishResultDTO) client.post(ApiPaths.backendPath("/notes/media/publish"), body);
    }

    /** Create media draft */
    public PlusApiResultPlusMediaPublishResultDTO createMediaDraft(PlusNotesMediaDraftForm body) throws Exception {
        return (PlusApiResultPlusMediaPublishResultDTO) client.post(ApiPaths.backendPath("/notes/media/drafts"), body);
    }

    /** Publish media draft */
    public PlusApiResultPlusMediaPublishResultDTO publishMediaDraft(PlusNotesMediaPublishDraftForm body) throws Exception {
        return (PlusApiResultPlusMediaPublishResultDTO) client.post(ApiPaths.backendPath("/notes/media/drafts/publish"), body);
    }

    /** Preview media draft */
    public PlusApiResultPlusMediaPublishResultDTO previewMediaDraft(PlusNotesMediaPreviewForm body) throws Exception {
        return (PlusApiResultPlusMediaPublishResultDTO) client.post(ApiPaths.backendPath("/notes/media/drafts/preview"), body);
    }

    /** Get note by UUID */
    public PlusApiResultPlusNotesVO getByUuid(String uuid) throws Exception {
        return (PlusApiResultPlusNotesVO) client.get(ApiPaths.backendPath("/notes/" + uuid + ""));
    }

    /** Search notes */
    public PlusApiResultPagePlusNotesVO search(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusNotesVO) client.get(ApiPaths.backendPath("/notes/search"), params);
    }

    /** Get paginated notes by user */
    public PlusApiResultPagePlusNotesVO pageByUser(String userId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusNotesVO) client.get(ApiPaths.backendPath("/notes/page_by_user/" + userId + ""), params);
    }

    /** Get paginated notes by tag */
    public PlusApiResultPagePlusNotesVO pageByTag(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusNotesVO) client.get(ApiPaths.backendPath("/notes/page_by_tag"), params);
    }

    /** Get paginated notes by category */
    public PlusApiResultPagePlusNotesVO pageByCategory(String categoryId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusNotesVO) client.get(ApiPaths.backendPath("/notes/page_by_category/" + categoryId + ""), params);
    }

    /** Get paginated notes */
    public PlusApiResultPagePlusNotesVO listByPage(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusNotesVO) client.get(ApiPaths.backendPath("/notes/page"), params);
    }

    /** List media publish records */
    public PlusApiResultPagePlusMediaPublishRecordDTO listMediaPublishRecords(String noteId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusMediaPublishRecordDTO) client.get(ApiPaths.backendPath("/notes/media/records/" + noteId + ""), params);
    }

    /** List notes by user */
    public PlusApiResultListPlusNotesVO listByUserId(String userId) throws Exception {
        return (PlusApiResultListPlusNotesVO) client.get(ApiPaths.backendPath("/notes/list_by_user/" + userId + ""));
    }

    /** List notes by tag */
    public PlusApiResultListPlusNotesVO listByTag(Map<String, Object> params) throws Exception {
        return (PlusApiResultListPlusNotesVO) client.get(ApiPaths.backendPath("/notes/list_by_tag"), params);
    }

    /** List notes by category */
    public PlusApiResultListPlusNotesVO listByCategoryId(String categoryId) throws Exception {
        return (PlusApiResultListPlusNotesVO) client.get(ApiPaths.backendPath("/notes/list_by_category/" + categoryId + ""));
    }

    /** Get note by ID */
    public PlusApiResultPlusNotesVO getById(String id) throws Exception {
        return (PlusApiResultPlusNotesVO) client.get(ApiPaths.backendPath("/notes/id/" + id + ""));
    }

    /** List all notes */
    public PlusApiResultListPlusNotesVO listAll() throws Exception {
        return (PlusApiResultListPlusNotesVO) client.get(ApiPaths.backendPath("/notes/all"));
    }

    /** Delete a note */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/notes/" + id + ""));
    }
}
