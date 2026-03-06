import '../http/client.dart';
import '../models.dart';

class PromptApi {
  final HttpClient _client;
  
  PromptApi(this._client);

  /// Update an existing AI prompt
  Future<PlusApiResultPlusAiPromptVO?> update(PlusAiPromptForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/prompt'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiPromptVO ? response : null;
  }

  /// Create a new AI prompt
  Future<PlusApiResultPlusAiPromptVO?> create(PlusAiPromptForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/prompt'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiPromptVO ? response : null;
  }

  /// Get AI prompts by page
  Future<PlusApiResultPagePlusAiPromptVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/prompt/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiPromptVO ? response : null;
  }

  /// Get all AI prompts
  Future<PlusApiResultListPlusAiPromptVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/prompt/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiPromptVO ? response : null;
  }

  /// Get an AI prompt by ID
  Future<PlusApiResultPlusAiPromptVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/prompt/${id}'));
    return response is PlusApiResultPlusAiPromptVO ? response : null;
  }

  /// Delete an AI prompt
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/prompt/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
