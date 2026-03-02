import '../http/client.dart';
import '../models.dart';

class DetailApi {
  final HttpClient _client;
  
  DetailApi(this._client);

  /// Update existing detail content
  Future<PlusApiResultPlusDetailVO?> update(PlusDetailForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/detail'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDetailVO ? response : null;
  }

  /// Create new detail content
  Future<PlusApiResultPlusDetailVO?> create(PlusDetailForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/detail'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDetailVO ? response : null;
  }

  /// Get detail contents by page
  Future<PlusApiResultPagePlusDetailVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/detail/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusDetailVO ? response : null;
  }

  /// Get all detail contents
  Future<PlusApiResultListPlusDetailVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/detail/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusDetailVO ? response : null;
  }

  /// Get detail content by ID
  Future<PlusApiResultPlusDetailVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/detail/${id}'));
    return response is PlusApiResultPlusDetailVO ? response : null;
  }

  /// Delete detail content
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/detail/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
