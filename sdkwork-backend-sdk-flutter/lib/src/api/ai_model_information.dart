import '../http/client.dart';
import '../models.dart';

class AiModelInformationApi {
  final HttpClient _client;
  
  AiModelInformationApi(this._client);

  /// Update existing AI model information
  Future<PlusApiResultPlusAiModelInfoVO?> update(PlusAiModelInfoForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/model'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiModelInfoVO ? response : null;
  }

  /// Create a new AI model information
  Future<PlusApiResultPlusAiModelInfoVO?> create(PlusAiModelInfoForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/model'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiModelInfoVO ? response : null;
  }

  /// Get AI model information by page
  Future<PlusApiResultPagePlusAiModelInfoVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/model/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiModelInfoVO ? response : null;
  }

  /// Get all AI model information
  Future<PlusApiResultListPlusAiModelInfoVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/model/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiModelInfoVO ? response : null;
  }

  /// Get AI model information by ID
  Future<PlusApiResultPlusAiModelInfoVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/model/${id}'));
    return response is PlusApiResultPlusAiModelInfoVO ? response : null;
  }

  /// Delete AI model information
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/model/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
