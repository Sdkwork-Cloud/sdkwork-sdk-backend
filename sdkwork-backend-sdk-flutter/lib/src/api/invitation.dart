import '../http/client.dart';
import '../models.dart';

class InvitationApi {
  final HttpClient _client;
  
  InvitationApi(this._client);

  /// Update an invitation relation
  Future<PlusApiResultInvitationRelationVO?> update(InvitationRelationForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/invitation/relation'), body: body, contentType: 'application/json');
    return response is PlusApiResultInvitationRelationVO ? response : null;
  }

  /// Create a new invitation relation
  Future<PlusApiResultInvitationRelationVO?> create(InvitationRelationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/relation'), body: body, contentType: 'application/json');
    return response is PlusApiResultInvitationRelationVO ? response : null;
  }

  /// Update an existing invitation code
  Future<PlusApiResultInvitationCodeVO?> updateCode(InvitationCodeForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/invitation/code'), body: body, contentType: 'application/json');
    return response is PlusApiResultInvitationCodeVO ? response : null;
  }

  /// Create a new invitation code
  Future<PlusApiResultInvitationCodeVO?> createCode(InvitationCodeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/code'), body: body, contentType: 'application/json');
    return response is PlusApiResultInvitationCodeVO ? response : null;
  }

  /// Get invitation relations by page
  Future<PlusApiResultPageInvitationRelationVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/relation/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPageInvitationRelationVO ? response : null;
  }

  /// Get all invitation relations
  Future<PlusApiResultListInvitationRelationVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/relation/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListInvitationRelationVO ? response : null;
  }

  /// Get invitation codes by page
  Future<PlusApiResultPageInvitationCodeVO?> createListByPageCode(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/code/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPageInvitationCodeVO ? response : null;
  }

  /// Get all invitation codes
  Future<PlusApiResultListInvitationCodeVO?> createListAllEntitiesCode(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/code/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListInvitationCodeVO ? response : null;
  }

  /// Get an invitation relation by ID
  Future<PlusApiResultInvitationRelationVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/invitation/relation/${id}'));
    return response is PlusApiResultInvitationRelationVO ? response : null;
  }

  /// Delete an invitation relation
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/invitation/relation/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get an invitation code by ID
  Future<PlusApiResultInvitationCodeVO?> getByIdCode(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/invitation/code/${id}'));
    return response is PlusApiResultInvitationCodeVO ? response : null;
  }

  /// Delete an invitation code
  Future<PlusApiResultBoolean?> deleteCode(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/invitation/code/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
