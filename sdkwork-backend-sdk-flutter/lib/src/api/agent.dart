import '../http/client.dart';
import '../models.dart';

class AgentApi {
  final HttpClient _client;
  
  AgentApi(this._client);

  /// Update an existing AI agent
  Future<PlusApiResultPlusAiAgentVO?> update(PlusAiAgentForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/agent'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiAgentVO ? response : null;
  }

  /// Create a new AI agent
  Future<PlusApiResultPlusAiAgentVO?> create(PlusAiAgentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/agent'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiAgentVO ? response : null;
  }

  /// Get public AI agents by page
  Future<PlusApiResultPagePlusAiAgentVO?> listPublic(PlusAiAgentQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/list_public'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiAgentVO ? response : null;
  }

  /// Get AI agents by page
  Future<PlusApiResultPagePlusAiAgentVO?> listByPage(PlusAiAgentQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiAgentVO ? response : null;
  }

  /// Get all AI agents
  Future<PlusApiResultListPlusAiAgentVO?> listAllEntities(PlusAiAgentQueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiAgentVO ? response : null;
  }

  /// Get an AI agent by ID
  Future<PlusApiResultPlusAiAgentVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/agent/${id}'));
    return response is PlusApiResultPlusAiAgentVO ? response : null;
  }

  /// Delete an AI agent
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/agent/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
