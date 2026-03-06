import '../http/client.dart';
import '../models.dart';

class ChatApi {
  final HttpClient _client;
  
  ChatApi(this._client);

  /// Stop a chat completion stream
  Future<PlusApiResult?> stop(Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/stop'), params: params, headers: headers);
    return response is PlusApiResult ? response : null;
  }

  /// Create a chat completion
  Future<ChatCompletionChunk?> create(ChatCompletionCreateForm body, Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/completions'), body: body, params: params, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }
}
