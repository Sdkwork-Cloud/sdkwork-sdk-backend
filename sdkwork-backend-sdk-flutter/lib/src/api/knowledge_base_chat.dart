import '../http/client.dart';
import '../models.dart';

class KnowledgeBaseChatApi {
  final HttpClient _client;
  
  KnowledgeBaseChatApi(this._client);

  Future<PlusApiResultBoolean?> stop(Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/knowledge_base/chat/stop'), params: params, headers: headers);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Create a chat completion with Knowledge base
  Future<ChatCompletionChunk?> create(ChatCompletionCreateForm body, Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/knowledge_base/chat/completions'), body: body, params: params, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }
}
