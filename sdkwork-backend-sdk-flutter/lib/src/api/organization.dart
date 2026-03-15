import '../http/client.dart';
import '../models.dart';

class OrganizationApi {
  final HttpClient _client;
  
  OrganizationApi(this._client);

  /// Update an existing organization
  Future<PlusApiResultPlusOrganizationVO?> update(PlusOrganizationForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/organization'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrganizationVO ? response : null;
  }

  /// Create a new organization
  Future<PlusApiResultPlusOrganizationVO?> create(PlusOrganizationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrganizationVO ? response : null;
  }

  /// Update an existing position
  Future<PlusApiResultPlusPositionVO?> updatePosition(PlusPositionForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/organization/position'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPositionVO ? response : null;
  }

  /// Create a new position
  Future<PlusApiResultPlusPositionVO?> createPosition(PlusPositionForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/position'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPositionVO ? response : null;
  }

  /// Update member relation
  Future<PlusApiResultPlusMemberRelationsVO?> updateMemberRelations(PlusMemberRelationsForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/organization/member-relations'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberRelationsVO ? response : null;
  }

  /// Create member relation
  Future<PlusApiResultPlusMemberRelationsVO?> createMemberRelations(PlusMemberRelationsForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/member-relations'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberRelationsVO ? response : null;
  }

  /// Uninstall app from organization
  Future<PlusApiResultPlusOrganizationVO?> uninstall(String id, PlusOrganizationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/${id}/uninstall'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrganizationVO ? response : null;
  }

  /// Install app for organization
  Future<PlusApiResultPlusOrganizationVO?> install(String id, PlusOrganizationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/${id}/install'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrganizationVO ? response : null;
  }

  /// Get positions by page
  Future<PlusApiResultPagePlusPositionVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/position/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPositionVO ? response : null;
  }

  /// Get all positions
  Future<PlusApiResultListPlusPositionVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/position/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPositionVO ? response : null;
  }

  /// Get member relations by page
  Future<PlusApiResultPagePlusMemberRelationsVO?> createListByPageMemberRelations(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/member-relations/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusMemberRelationsVO ? response : null;
  }

  /// Get all member relations
  Future<PlusApiResultListPlusMemberRelationsVO?> createListAllEntitiesMemberRelations(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/member-relations/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusMemberRelationsVO ? response : null;
  }

  /// Get organizations by page
  Future<PlusApiResultPagePlusOrganizationVO?> createListByPageOrganization(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOrganizationVO ? response : null;
  }

  /// Get all organizations
  Future<PlusApiResultListPlusOrganizationVO?> createListAllEntitiesOrganization(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOrganizationVO ? response : null;
  }

  /// Get access tokens
  Future<PlusApiResultListTokenResult?> getAccessTokens(GetAccessTokenForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/get_access_tokens'), body: body, contentType: 'application/json');
    return response is PlusApiResultListTokenResult ? response : null;
  }

  /// Get an organization by ID
  Future<PlusApiResultPlusOrganizationVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization/${id}'));
    return response is PlusApiResultPlusOrganizationVO ? response : null;
  }

  /// Delete an organization
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/organization/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get child organizations
  Future<PlusApiResultListPlusOrganizationVO?> getChildren(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization/${id}/children'));
    return response is PlusApiResultListPlusOrganizationVO ? response : null;
  }

  /// Get a position by ID
  Future<PlusApiResultPlusPositionVO?> getByIdPosition(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization/position/${id}'));
    return response is PlusApiResultPlusPositionVO ? response : null;
  }

  /// Delete a position
  Future<PlusApiResultBoolean?> deletePosition(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/organization/position/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get member relation by ID
  Future<PlusApiResultPlusMemberRelationsVO?> getByIdMemberRelations(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization/member-relations/${id}'));
    return response is PlusApiResultPlusMemberRelationsVO ? response : null;
  }

  /// Delete member relation
  Future<PlusApiResultBoolean?> deleteMemberRelations(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/organization/member-relations/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
