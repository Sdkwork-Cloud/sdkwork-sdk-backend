import '../http/client.dart';
import '../models.dart';

class AiGenerationApi {
  final HttpClient _client;
  
  AiGenerationApi(this._client);

  /// Update an existing AI generation record
  Future<PlusApiResultPlusAiGenerationVO?> update(PlusAiGenerationForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/generation'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiGenerationVO ? response : null;
  }

  /// Create a new AI generation record
  Future<PlusApiResultPlusAiGenerationVO?> create(PlusAiGenerationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiGenerationVO ? response : null;
  }

  /// Get AI generation records by page
  Future<PlusApiResultPagePlusAiGenerationVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiGenerationVO ? response : null;
  }

  /// Get all AI generation records
  Future<PlusApiResultListPlusAiGenerationVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiGenerationVO ? response : null;
  }

  /// Get an AI generation record by ID
  Future<PlusApiResultPlusAiGenerationVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/${id}'));
    return response is PlusApiResultPlusAiGenerationVO ? response : null;
  }

  /// Delete an AI generation record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/generation/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
