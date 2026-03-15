import '../http/client.dart';
import '../models.dart';

class FeedApi {
  final HttpClient _client;
  
  FeedApi(this._client);

  /// Update an existing feeds entry
  Future<PlusApiResultPlusFeedsVO?> update(PlusFeedsForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/feeds'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFeedsVO ? response : null;
  }

  /// Create a new feeds entry
  Future<PlusApiResultPlusFeedsVO?> create(PlusFeedsForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/feeds'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFeedsVO ? response : null;
  }

  /// Get feeds entries by page
  Future<PlusApiResultPagePlusFeedsVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/feeds/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusFeedsVO ? response : null;
  }

  /// Get all feeds entries
  Future<PlusApiResultListPlusFeedsVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/feeds/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusFeedsVO ? response : null;
  }

  /// Get a feeds entry by ID
  Future<PlusApiResultPlusFeedsVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/feeds/${id}'));
    return response is PlusApiResultPlusFeedsVO ? response : null;
  }

  /// Delete a feeds entry
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/feeds/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
