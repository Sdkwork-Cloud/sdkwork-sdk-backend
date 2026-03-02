import '../http/client.dart';
import '../models.dart';

class InvitationCodeApi {
  final HttpClient _client;
  
  InvitationCodeApi(this._client);

  /// Update an existing invitation code
  Future<PlusApiResultInvitationCodeVO?> update(InvitationCodeForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/invitation/code'), body: body, contentType: 'application/json');
    return response is PlusApiResultInvitationCodeVO ? response : null;
  }

  /// Create a new invitation code
  Future<PlusApiResultInvitationCodeVO?> create(InvitationCodeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/code'), body: body, contentType: 'application/json');
    return response is PlusApiResultInvitationCodeVO ? response : null;
  }

  /// Get invitation codes by page
  Future<PlusApiResultPageInvitationCodeVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/code/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPageInvitationCodeVO ? response : null;
  }

  /// Get all invitation codes
  Future<PlusApiResultListInvitationCodeVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/code/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListInvitationCodeVO ? response : null;
  }

  /// Get an invitation code by ID
  Future<PlusApiResultInvitationCodeVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/invitation/code/${id}'));
    return response is PlusApiResultInvitationCodeVO ? response : null;
  }

  /// Delete an invitation code
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/invitation/code/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
