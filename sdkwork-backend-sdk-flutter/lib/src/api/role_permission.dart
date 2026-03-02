import '../http/client.dart';
import '../models.dart';

class RolePermissionApi {
  final HttpClient _client;
  
  RolePermissionApi(this._client);

  /// Update role-permission association
  Future<PlusApiResultPlusRolePermissionVO?> update(PlusRolePermissionForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/role/permission'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRolePermissionVO ? response : null;
  }

  /// Create role-permission association
  Future<PlusApiResultPlusRolePermissionVO?> create(PlusRolePermissionForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/role/permission'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRolePermissionVO ? response : null;
  }

  /// Get role-permission associations by page
  Future<PlusApiResultPagePlusRolePermissionVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/role/permission/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusRolePermissionVO ? response : null;
  }

  /// Get all role-permission associations
  Future<PlusApiResultListPlusRolePermissionVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/role/permission/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusRolePermissionVO ? response : null;
  }

  /// Get role-permission association by ID
  Future<PlusApiResultPlusRolePermissionVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/role/permission/${id}'));
    return response is PlusApiResultPlusRolePermissionVO ? response : null;
  }

  /// Delete role-permission association
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/role/permission/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
