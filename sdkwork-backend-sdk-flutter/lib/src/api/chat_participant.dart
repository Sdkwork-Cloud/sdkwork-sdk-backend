import '../http/client.dart';
import '../models.dart';

class ChatParticipantApi {
  final HttpClient _client;
  
  ChatParticipantApi(this._client);

  /// Update an existing chat participant
  Future<PlusApiResultPlusParticipantVO?> update(PlusParticipantForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/participant'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusParticipantVO ? response : null;
  }

  /// Create a new chat participant
  Future<PlusApiResultPlusParticipantVO?> create(PlusParticipantForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/participant'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusParticipantVO ? response : null;
  }

  /// Get chat participants by page
  Future<PlusApiResultPagePlusParticipantVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/participant/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusParticipantVO ? response : null;
  }

  /// Get all chat participants
  Future<PlusApiResultListPlusParticipantVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/participant/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusParticipantVO ? response : null;
  }

  /// Get a chat participant by ID
  Future<PlusApiResultPlusParticipantVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/participant/${id}'));
    return response is PlusApiResultPlusParticipantVO ? response : null;
  }

  /// Delete a chat participant
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/participant/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
