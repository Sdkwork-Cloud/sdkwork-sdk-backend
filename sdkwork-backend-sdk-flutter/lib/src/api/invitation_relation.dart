import '../http/client.dart';
import '../models.dart';

class InvitationRelationApi {
  final HttpClient _client;
  
  InvitationRelationApi(this._client);

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

  /// Get invitation relations by page
  Future<PlusApiResultPageInvitationRelationVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/relation/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPageInvitationRelationVO ? response : null;
  }

  /// Get all invitation relations
  Future<PlusApiResultListInvitationRelationVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/invitation/relation/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListInvitationRelationVO ? response : null;
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
}
