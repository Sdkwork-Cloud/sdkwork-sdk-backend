import '../http/client.dart';
import '../models.dart';

class ChatMessageApi {
  final HttpClient _client;
  
  ChatMessageApi(this._client);

  /// Update an existing chat message
  Future<PlusApiResultPlusChatMessageContentVO?> update(PlusChatMessageContentForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/message'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChatMessageContentVO ? response : null;
  }

  /// Create a new chat message
  Future<PlusApiResultPlusChatMessageContentVO?> create(PlusChatMessageContentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/message'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChatMessageContentVO ? response : null;
  }

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

  /// Get chat messages by page
  Future<PlusApiResultPagePlusChatMessageContentVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/message/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChatMessageContentVO ? response : null;
  }

  /// Get all chat messages
  Future<PlusApiResultListPlusChatMessageContentVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/message/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChatMessageContentVO ? response : null;
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

  /// Get chat message by ID
  Future<PlusApiResultPlusChatMessageContentVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/message/${id}'));
    return response is PlusApiResultPlusChatMessageContentVO ? response : null;
  }

  /// Delete a chat message
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/message/${id}'));
    return response is PlusApiResultBoolean ? response : null;
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
