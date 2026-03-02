import '../http/client.dart';
import '../models.dart';

class AiChatApi {
  final HttpClient _client;
  
  AiChatApi(this._client);

  /// Stop a chat completion stream
  Future<PlusApiResult?> stop(Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/stop'), headers: headers);
    return response is PlusApiResult ? response : null;
  }

  /// Create a chat completion
  Future<ChatCompletionChunk?> create(ChatCompletionCreateForm body, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/completions'), body: body, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }
}
