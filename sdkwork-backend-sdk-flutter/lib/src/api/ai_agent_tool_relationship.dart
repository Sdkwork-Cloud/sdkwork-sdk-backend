import '../http/client.dart';
import '../models.dart';

class AiAgentToolRelationshipApi {
  final HttpClient _client;
  
  AiAgentToolRelationshipApi(this._client);

  /// Update an existing agent-tool relationship
  Future<PlusApiResultPlusAiAgentToolVO?> update(PlusAiAgentToolForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/agent/tool'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiAgentToolVO ? response : null;
  }

  /// Create a new agent-tool relationship
  Future<PlusApiResultPlusAiAgentToolVO?> create(PlusAiAgentToolForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/tool'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiAgentToolVO ? response : null;
  }

  /// Get agent-tool relationships by page
  Future<PlusApiResultPagePlusAiAgentToolVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/tool/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiAgentToolVO ? response : null;
  }

  /// Get all agent-tool relationships
  Future<PlusApiResultListPlusAiAgentToolVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/tool/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiAgentToolVO ? response : null;
  }

  /// Get an agent-tool relationship by ID
  Future<PlusApiResultPlusAiAgentToolVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/agent/tool/${id}'));
    return response is PlusApiResultPlusAiAgentToolVO ? response : null;
  }

  /// Delete an agent-tool relationship
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/agent/tool/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
