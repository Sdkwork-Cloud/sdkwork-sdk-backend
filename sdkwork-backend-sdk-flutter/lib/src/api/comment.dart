import '../http/client.dart';
import '../models.dart';

class CommentApi {
  final HttpClient _client;
  
  CommentApi(this._client);

  /// Update an existing comment
  Future<PlusApiResultPlusCommentsVO?> update(PlusCommentsForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/comments'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCommentsVO ? response : null;
  }

  /// Create a new comment
  Future<PlusApiResultPlusCommentsVO?> create(PlusCommentsForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/comments'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCommentsVO ? response : null;
  }

  /// Unlike a comment
  Future<PlusApiResultPlusCommentsVO?> unlike(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/comments/${id}/unlike'));
    return response is PlusApiResultPlusCommentsVO ? response : null;
  }

  /// Reply to a comment
  Future<PlusApiResultPlusCommentsVO?> reply(String id, PlusCommentsReplyForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/comments/${id}/reply'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCommentsVO ? response : null;
  }

  /// Like a comment
  Future<PlusApiResultPlusCommentsVO?> like(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/comments/${id}/like'));
    return response is PlusApiResultPlusCommentsVO ? response : null;
  }

  /// Get comments by page
  Future<PlusApiResultPagePlusCommentsVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/comments/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCommentsVO ? response : null;
  }

  /// Get all comments
  Future<PlusApiResultListPlusCommentsVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/comments/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCommentsVO ? response : null;
  }

  /// Get a comment by ID
  Future<PlusApiResultPlusCommentsVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/comments/${id}'));
    return response is PlusApiResultPlusCommentsVO ? response : null;
  }

  /// Delete a comment
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/comments/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
