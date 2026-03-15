import '../http/client.dart';
import '../models.dart';

class ChatApi {
  final HttpClient _client;
  
  ChatApi(this._client);

  /// Update an existing chat message
  Future<PlusApiResultPlusChatMessageVO?> updateMessage(PlusChatMessageForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/chat/message'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChatMessageVO ? response : null;
  }

  /// Create a new chat message
  Future<PlusApiResultPlusChatMessageVO?> createMessage(PlusChatMessageForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/message'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChatMessageVO ? response : null;
  }

  /// Stop a chat completion stream
  Future<PlusApiResult?> stop(Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/stop'), params: params, headers: headers);
    return response is PlusApiResult ? response : null;
  }

  /// Get chat messages by page
  Future<PlusApiResultPagePlusChatMessageVO?> loadMore(ChatMessageQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/message/load_more'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChatMessageVO ? response : null;
  }

  /// Get chat messages by page
  Future<PlusApiResultPagePlusChatMessageVO?> createListByPage(ChatMessageQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/message/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChatMessageVO ? response : null;
  }

  /// Get all chat messages
  Future<PlusApiResultListPlusChatMessageVO?> createListAllEntities(ChatMessageQueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/message/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChatMessageVO ? response : null;
  }

  /// Create a chat completion
  Future<ChatCompletionChunk?> create(ChatCompletionCreateForm body, Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/chat/completions'), body: body, params: params, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
  }

  /// Get a chat message by ID
  Future<PlusApiResultPlusChatMessageVO?> getByIdMessage(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/chat/message/${id}'));
    return response is PlusApiResultPlusChatMessageVO ? response : null;
  }

  /// Delete a chat message
  Future<PlusApiResultBoolean?> deleteMessage(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/chat/message/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
