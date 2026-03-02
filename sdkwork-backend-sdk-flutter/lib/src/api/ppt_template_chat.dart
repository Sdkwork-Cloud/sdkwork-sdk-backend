import '../http/client.dart';
import '../models.dart';

class PptTemplateChatApi {
  final HttpClient _client;
  
  PptTemplateChatApi(this._client);

  Future<PlusApiResultBoolean?> stop(Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/chat/stop'), headers: headers);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Create a chat completion with PPT template
  Future<ChatCompletionChunk?> create(ChatCompletionCreateForm body, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/chat/completions'), body: body, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }
}
