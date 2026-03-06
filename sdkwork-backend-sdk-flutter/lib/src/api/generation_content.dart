import '../http/client.dart';
import '../models.dart';

class GenerationContentApi {
  final HttpClient _client;
  
  GenerationContentApi(this._client);

  /// Update AI generated content
  Future<PlusApiResultPlusAiGenerationContentVO?> update(PlusAiGenerationContentForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/generation/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiGenerationContentVO ? response : null;
  }

  /// Create new AI generated content
  Future<PlusApiResultPlusAiGenerationContentVO?> create(PlusAiGenerationContentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiGenerationContentVO ? response : null;
  }

  /// Get AI generated content by page
  Future<PlusApiResultPagePlusAiGenerationContentVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/content/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiGenerationContentVO ? response : null;
  }

  /// Get all AI generated content
  Future<PlusApiResultListPlusAiGenerationContentVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/content/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiGenerationContentVO ? response : null;
  }

  /// Get AI generated content by ID
  Future<PlusApiResultPlusAiGenerationContentVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/content/${id}'));
    return response is PlusApiResultPlusAiGenerationContentVO ? response : null;
  }

  /// Delete AI generated content
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/generation/content/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
