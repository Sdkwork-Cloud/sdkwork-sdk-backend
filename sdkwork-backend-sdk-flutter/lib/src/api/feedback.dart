import '../http/client.dart';
import '../models.dart';

class FeedbackApi {
  final HttpClient _client;
  
  FeedbackApi(this._client);

  /// Update feedback
  Future<PlusApiResultPlusFeedbackVO?> update(PlusFeedbackForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/feedback'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFeedbackVO ? response : null;
  }

  /// Create new feedback
  Future<PlusApiResultPlusFeedbackVO?> create(PlusFeedbackForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/feedback'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFeedbackVO ? response : null;
  }

  /// Get feedback by page
  Future<PlusApiResultPagePlusFeedbackVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/feedback/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusFeedbackVO ? response : null;
  }

  /// Get all feedback records
  Future<PlusApiResultListPlusFeedbackVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/feedback/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusFeedbackVO ? response : null;
  }

  /// Get feedback by ID
  Future<PlusApiResultPlusFeedbackVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/feedback/${id}'));
    return response is PlusApiResultPlusFeedbackVO ? response : null;
  }

  /// Delete feedback
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/feedback/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
