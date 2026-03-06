import '../http/client.dart';
import '../models.dart';

class ToolApi {
  final HttpClient _client;
  
  ToolApi(this._client);

  /// Update an existing AI tool
  Future<PlusApiResultPlusAiToolVO?> update(PlusAiToolForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/tool'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiToolVO ? response : null;
  }

  /// Create a new AI tool
  Future<PlusApiResultPlusAiToolVO?> create(PlusAiToolForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/tool'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiToolVO ? response : null;
  }

  /// Get AI tools by page
  Future<PlusApiResultPagePlusAiToolVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/tool/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiToolVO ? response : null;
  }

  /// Get all AI tools
  Future<PlusApiResultListPlusAiToolVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/tool/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiToolVO ? response : null;
  }

  /// Get an AI tool by ID
  Future<PlusApiResultPlusAiToolVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/tool/${id}'));
    return response is PlusApiResultPlusAiToolVO ? response : null;
  }

  /// Delete an AI tool
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/tool/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
