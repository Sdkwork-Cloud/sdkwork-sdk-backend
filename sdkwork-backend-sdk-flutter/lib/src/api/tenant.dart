import '../http/client.dart';
import '../models.dart';

class TenantApi {
  final HttpClient _client;
  
  TenantApi(this._client);

  /// Update an existing tenant
  Future<PlusApiResultPlusTenantVO?> update(PlusTenantForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/tenant'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusTenantVO ? response : null;
  }

  /// Create a new tenant
  Future<PlusApiResultPlusTenantVO?> create(PlusTenantForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/tenant'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusTenantVO ? response : null;
  }

  /// Uninstall app from tenant
  Future<PlusApiResultPlusTenantVO?> uninstall(String id, PlusTenantForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/tenant/${id}/uninstall'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusTenantVO ? response : null;
  }

  /// Install app for tenant
  Future<PlusApiResultPlusTenantVO?> install(String id, PlusTenantForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/tenant/${id}/install'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusTenantVO ? response : null;
  }

  /// Get tenants by page
  Future<PlusApiResultPagePlusTenantVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/tenant/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusTenantVO ? response : null;
  }

  /// Get all tenants
  Future<PlusApiResultListPlusTenantVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/tenant/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusTenantVO ? response : null;
  }

  /// Get access tokens
  Future<PlusApiResultListTokenResult?> getAccessTokens(GetAccessTokenForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/tenant/get_access_tokens'), body: body, contentType: 'application/json');
    return response is PlusApiResultListTokenResult ? response : null;
  }

  /// Get a tenant by ID
  Future<PlusApiResultPlusTenantVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/tenant/${id}'));
    return response is PlusApiResultPlusTenantVO ? response : null;
  }

  /// Delete a tenant
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/tenant/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
