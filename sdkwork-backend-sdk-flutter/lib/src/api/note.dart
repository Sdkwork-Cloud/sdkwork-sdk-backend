import '../http/client.dart';
import '../models.dart';

class NoteApi {
  final HttpClient _client;
  
  NoteApi(this._client);

  /// Update a note
  Future<PlusApiResultPlusNotesVO?> update(PlusNotesForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/notes'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusNotesVO ? response : null;
  }

  /// Create a note
  Future<PlusApiResultPlusNotesVO?> create(PlusNotesForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/notes'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusNotesVO ? response : null;
  }

  /// Publish notes directly
  Future<PlusApiResultPlusMediaPublishResultDTO?> publishNotesToMedia(PlusNotesMediaDraftForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/notes/media/publish'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMediaPublishResultDTO ? response : null;
  }

  /// Query publish status
  Future<PlusApiResultPlusMediaPublishResultDTO?> queryMediaPublishStatus(PlusNotesMediaPublishStatusForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/notes/media/publish/status'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMediaPublishResultDTO ? response : null;
  }

  /// Query published article
  Future<PlusApiResultPlusMediaPublishResultDTO?> queryPublishedArticle(PlusNotesMediaPublishedArticleForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/notes/media/publish/article'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMediaPublishResultDTO ? response : null;
  }

  /// Create media draft
  Future<PlusApiResultPlusMediaPublishResultDTO?> createMediaDraft(PlusNotesMediaDraftForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/notes/media/drafts'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMediaPublishResultDTO ? response : null;
  }

  /// Publish media draft
  Future<PlusApiResultPlusMediaPublishResultDTO?> publishMediaDraft(PlusNotesMediaPublishDraftForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/notes/media/drafts/publish'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMediaPublishResultDTO ? response : null;
  }

  /// Preview media draft
  Future<PlusApiResultPlusMediaPublishResultDTO?> previewMediaDraft(PlusNotesMediaPreviewForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/notes/media/drafts/preview'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMediaPublishResultDTO ? response : null;
  }

  /// Get note by UUID
  Future<PlusApiResultPlusNotesVO?> getByUuid(String uuid) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/${uuid}'));
    return response is PlusApiResultPlusNotesVO ? response : null;
  }

  /// Search notes
  Future<PlusApiResultPagePlusNotesVO?> search(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/search'), params: params);
    return response is PlusApiResultPagePlusNotesVO ? response : null;
  }

  /// Get paginated notes by user
  Future<PlusApiResultPagePlusNotesVO?> pageByUser(String userId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/page_by_user/${userId}'), params: params);
    return response is PlusApiResultPagePlusNotesVO ? response : null;
  }

  /// Get paginated notes by tag
  Future<PlusApiResultPagePlusNotesVO?> pageByTag(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/page_by_tag'), params: params);
    return response is PlusApiResultPagePlusNotesVO ? response : null;
  }

  /// Get paginated notes by category
  Future<PlusApiResultPagePlusNotesVO?> pageByCategory(String categoryId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/page_by_category/${categoryId}'), params: params);
    return response is PlusApiResultPagePlusNotesVO ? response : null;
  }

  /// Get paginated notes
  Future<PlusApiResultPagePlusNotesVO?> listByPage(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/page'), params: params);
    return response is PlusApiResultPagePlusNotesVO ? response : null;
  }

  /// List media publish records
  Future<PlusApiResultPagePlusMediaPublishRecordDTO?> listMediaPublishRecords(String noteId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/media/records/${noteId}'), params: params);
    return response is PlusApiResultPagePlusMediaPublishRecordDTO ? response : null;
  }

  /// List notes by user
  Future<PlusApiResultListPlusNotesVO?> listByUserId(String userId) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/list_by_user/${userId}'));
    return response is PlusApiResultListPlusNotesVO ? response : null;
  }

  /// List notes by tag
  Future<PlusApiResultListPlusNotesVO?> listByTag(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/list_by_tag'), params: params);
    return response is PlusApiResultListPlusNotesVO ? response : null;
  }

  /// List notes by category
  Future<PlusApiResultListPlusNotesVO?> listByCategoryId(String categoryId) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/list_by_category/${categoryId}'));
    return response is PlusApiResultListPlusNotesVO ? response : null;
  }

  /// Get note by ID
  Future<PlusApiResultPlusNotesVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/notes/id/${id}'));
    return response is PlusApiResultPlusNotesVO ? response : null;
  }

  /// List all notes
  Future<PlusApiResultListPlusNotesVO?> listAll() async {
    final response = await _client.get(ApiPaths.backendPath('/notes/all'));
    return response is PlusApiResultListPlusNotesVO ? response : null;
  }

  /// Delete a note
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/notes/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
