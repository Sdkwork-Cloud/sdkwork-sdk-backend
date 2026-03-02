import '../http/client.dart';
import '../models.dart';

class ApiKeyApi {
  final HttpClient _client;
  
  ApiKeyApi(this._client);

  /// Update an existing API key
  Future<PlusApiResultPlusApiKeyVO?> update(PlusApiKeyForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/apikey'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusApiKeyVO ? response : null;
  }

  /// Create a new API key
  Future<PlusApiResultPlusApiKeyVO?> create(PlusApiKeyForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/apikey'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusApiKeyVO ? response : null;
  }

  /// Get API keys by page
  Future<PlusApiResultPagePlusApiKeyVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/apikey/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusApiKeyVO ? response : null;
  }

  /// Get all API keys
  Future<PlusApiResultListPlusApiKeyVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/apikey/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusApiKeyVO ? response : null;
  }

  /// Get an API key by ID
  Future<PlusApiResultPlusApiKeyVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/apikey/${id}'));
    return response is PlusApiResultPlusApiKeyVO ? response : null;
  }

  /// Delete an API key
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/apikey/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
