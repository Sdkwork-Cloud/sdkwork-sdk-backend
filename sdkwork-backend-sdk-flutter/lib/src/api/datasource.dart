import '../http/client.dart';
import '../models.dart';

class DatasourceApi {
  final HttpClient _client;
  
  DatasourceApi(this._client);

  /// Update an existing data source
  Future<PlusApiResultPlusDatasourceVO?> update(PlusDatasourceForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/datasource'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDatasourceVO ? response : null;
  }

  /// Create a new data source
  Future<PlusApiResultPlusDatasourceVO?> create(PlusDatasourceForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/datasource'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDatasourceVO ? response : null;
  }

  Future<PlusApiResultBoolean?> stop(Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/datasource/stop'), headers: headers);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get data sources by page
  Future<PlusApiResultPagePlusDatasourceVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/datasource/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusDatasourceVO ? response : null;
  }

  /// Get all data sources
  Future<PlusApiResultListPlusDatasourceVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/datasource/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusDatasourceVO ? response : null;
  }

  /// Create a chat completion with Datasource
  Future<ChatCompletionChunk?> createCompletions(ChatCompletionCreateForm body, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/datasource/chat/completions'), body: body, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }

  /// Get a data source by ID
  Future<PlusApiResultPlusDatasourceVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/datasource/${id}'));
    return response is PlusApiResultPlusDatasourceVO ? response : null;
  }

  /// Delete a data source
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/datasource/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
