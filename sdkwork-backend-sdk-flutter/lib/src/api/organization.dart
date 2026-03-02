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

  /// Get organizations by page
  Future<PlusApiResultPagePlusOrganizationVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOrganizationVO ? response : null;
  }

  /// Get all organizations
  Future<PlusApiResultListPlusOrganizationVO?> listAllEntities(QueryListForm? body) async {
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
}
