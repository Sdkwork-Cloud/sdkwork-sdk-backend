import '../http/client.dart';
import '../models.dart';

class MessageApi {
  final HttpClient _client;
  
  MessageApi(this._client);

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
}
