import '../http/client.dart';
import '../models.dart';

class ApikeyApi {
  final HttpClient _client;
  
  ApikeyApi(this._client);

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

  /// Get API key detail for current user
  Future<PlusApiResultPlusApiKeyVO?> getMyApiKey(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/apikey/my/${id}'));
    return response is PlusApiResultPlusApiKeyVO ? response : null;
  }

  /// Update API key for current user
  Future<PlusApiResultPlusApiKeyVO?> updateMyApiKey(String id, PlusApiKeySelfUpdateForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/apikey/my/${id}'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusApiKeyVO ? response : null;
  }

  /// Delete API key for current user
  Future<PlusApiResultBoolean?> deleteMyApiKey(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/apikey/my/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Create API key for current user
  Future<PlusApiResultPlusApiKeyVO?> createMyApiKey(PlusApiKeySelfCreateForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/apikey/my'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusApiKeyVO ? response : null;
  }

  /// Rotate API key for current user
  Future<PlusApiResultPlusApiKeyVO?> rotateMyApiKey(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/apikey/my/${id}/rotate'));
    return response is PlusApiResultPlusApiKeyVO ? response : null;
  }

  /// Enable API key for current user
  Future<PlusApiResultPlusApiKeyVO?> enableMyApiKey(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/apikey/my/${id}/enable'));
    return response is PlusApiResultPlusApiKeyVO ? response : null;
  }

  /// Disable API key for current user
  Future<PlusApiResultPlusApiKeyVO?> disableMyApiKey(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/apikey/my/${id}/disable'));
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

  /// List API keys for current user
  Future<PlusApiResultListPlusApiKeyVO?> listMyApiKeys() async {
    final response = await _client.get(ApiPaths.backendPath('/apikey/my/list'));
    return response is PlusApiResultListPlusApiKeyVO ? response : null;
  }
}
