import '../http/client.dart';
import '../models.dart';

class ChatGroupApi {
  final HttpClient _client;
  
  ChatGroupApi(this._client);

  /// Update an existing chat group
  Future<PlusApiResultPlusImGroupVO?> update(PlusImGroupForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/im/group'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusImGroupVO ? response : null;
  }

  /// Create a new chat group
  Future<PlusApiResultPlusImGroupVO?> create(PlusImGroupForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/im/group'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusImGroupVO ? response : null;
  }

  /// Get chat groups by page
  Future<PlusApiResultPagePlusImGroupVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/im/group/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusImGroupVO ? response : null;
  }

  /// Get all chat groups
  Future<PlusApiResultListPlusImGroupVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/im/group/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusImGroupVO ? response : null;
  }

  /// Get a chat group by ID
  Future<PlusApiResultPlusImGroupVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/im/group/${id}'));
    return response is PlusApiResultPlusImGroupVO ? response : null;
  }

  /// Delete a chat group
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/im/group/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
