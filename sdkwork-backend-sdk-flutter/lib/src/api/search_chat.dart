import '../http/client.dart';
import '../models.dart';

class SearchChatApi {
  final HttpClient _client;
  
  SearchChatApi(this._client);

  Future<PlusApiResultBoolean?> stop(Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/search/chat/stop'), headers: headers);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Create a chat completion with Search
  Future<ChatCompletionChunk?> create(ChatCompletionCreateForm body, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/search/chat/completions'), body: body, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }
}
