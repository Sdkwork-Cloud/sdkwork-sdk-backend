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

  /// Update an existing agent-tool relationship
  Future<PlusApiResultPlusAiAgentToolVO?> updateTool(PlusAiAgentToolForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/agent/tool'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiAgentToolVO ? response : null;
  }

  /// Create a new agent-tool relationship
  Future<PlusApiResultPlusAiAgentToolVO?> createTool(PlusAiAgentToolForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/tool'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiAgentToolVO ? response : null;
  }

  /// Get agent-tool relationships by page
  Future<PlusApiResultPagePlusAiAgentToolVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/tool/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiAgentToolVO ? response : null;
  }

  /// Get all agent-tool relationships
  Future<PlusApiResultListPlusAiAgentToolVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/tool/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiAgentToolVO ? response : null;
  }

  /// Get public AI agents by page
  Future<PlusApiResultPagePlusAiAgentVO?> listPublic(PlusAiAgentQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/list_public'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiAgentVO ? response : null;
  }

  /// Get AI agents by page
  Future<PlusApiResultPagePlusAiAgentVO?> createListByPageAgent(PlusAiAgentQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiAgentVO ? response : null;
  }

  /// Get all AI agents
  Future<PlusApiResultListPlusAiAgentVO?> createListAllEntitiesAgent(PlusAiAgentQueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiAgentVO ? response : null;
  }

  /// Create a chat completion with agent
  Future<ChatCompletionChunk?> withContext(ChatCompletionCreateForm body, Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/chat/with_context'), body: body, params: params, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }

  /// Stop a chat completion stream
  Future<PlusApiResult?> stop(Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/chat/stop'), params: params, headers: headers);
    return response is PlusApiResult ? response : null;
  }

  /// Create a chat completion with agent
  Future<ChatCompletionChunk?> resumeStream(ChatCompletionCreateForm body, Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/chat/resume_stream'), body: body, params: params, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }

  /// Create a chat completion with agent
  Future<ChatCompletionChunk?> createCompletions(ChatCompletionCreateForm body, Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/chat/completions'), body: body, params: params, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
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

  /// Get an agent-tool relationship by ID
  Future<PlusApiResultPlusAiAgentToolVO?> getByIdTool(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/agent/tool/${id}'));
    return response is PlusApiResultPlusAiAgentToolVO ? response : null;
  }

  /// Delete an agent-tool relationship
  Future<PlusApiResultBoolean?> deleteTool(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/agent/tool/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
