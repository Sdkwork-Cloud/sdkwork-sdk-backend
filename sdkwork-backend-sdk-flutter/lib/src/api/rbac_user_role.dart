import '../http/client.dart';
import '../models.dart';

class RbacUserRoleApi {
  final HttpClient _client;
  
  RbacUserRoleApi(this._client);

  /// Update user-role relationship
  Future<PlusApiResultPlusUserRoleVO?> update(PlusUserRoleForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/rbac/user/role'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserRoleVO ? response : null;
  }

  /// Create user-role relationship
  Future<PlusApiResultPlusUserRoleVO?> create(PlusUserRoleForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/rbac/user/role'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserRoleVO ? response : null;
  }

  /// Get user-role relationships by page
  Future<PlusApiResultPagePlusUserRoleVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/rbac/user/role/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserRoleVO ? response : null;
  }

  /// Get all user-role relationships
  Future<PlusApiResultListPlusUserRoleVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/rbac/user/role/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserRoleVO ? response : null;
  }

  /// Get user-role relationship by ID
  Future<PlusApiResultPlusUserRoleVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/rbac/user/role/${id}'));
    return response is PlusApiResultPlusUserRoleVO ? response : null;
  }

  /// Delete user-role relationship
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/rbac/user/role/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
