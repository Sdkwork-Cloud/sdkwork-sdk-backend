import '../http/client.dart';
import '../models.dart';

class AgentChatApi {
  final HttpClient _client;
  
  AgentChatApi(this._client);

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
  Future<ChatCompletionChunk?> create(ChatCompletionCreateForm body, Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/agent/chat/completions'), body: body, params: params, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }
}
