import '../http/client.dart';
import '../models.dart';

class RoleApi {
  final HttpClient _client;
  
  RoleApi(this._client);

  /// Update an existing system role
  Future<PlusApiResultPlusRoleVO?> update(PlusRoleForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/role'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRoleVO ? response : null;
  }

  /// Create a new system role
  Future<PlusApiResultPlusRoleVO?> create(PlusRoleForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/role'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRoleVO ? response : null;
  }

  /// Update role-permission association
  Future<PlusApiResultPlusRolePermissionVO?> updatePermission(PlusRolePermissionForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/role/permission'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRolePermissionVO ? response : null;
  }

  /// Create role-permission association
  Future<PlusApiResultPlusRolePermissionVO?> createPermission(PlusRolePermissionForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/role/permission'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRolePermissionVO ? response : null;
  }

  /// Get role-permission associations by page
  Future<PlusApiResultPagePlusRolePermissionVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/role/permission/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusRolePermissionVO ? response : null;
  }

  /// Get all role-permission associations
  Future<PlusApiResultListPlusRolePermissionVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/role/permission/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusRolePermissionVO ? response : null;
  }

  /// Get system roles by page
  Future<PlusApiResultPagePlusRoleVO?> createListByPageRole(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/role/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusRoleVO ? response : null;
  }

  /// Get all system roles
  Future<PlusApiResultListPlusRoleVO?> createListAllEntitiesRole(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/role/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusRoleVO ? response : null;
  }

  /// Get a system role by ID
  Future<PlusApiResultPlusRoleVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/role/${id}'));
    return response is PlusApiResultPlusRoleVO ? response : null;
  }

  /// Delete a system role
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/role/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get role-permission association by ID
  Future<PlusApiResultPlusRolePermissionVO?> getByIdPermission(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/role/permission/${id}'));
    return response is PlusApiResultPlusRolePermissionVO ? response : null;
  }

  /// Delete role-permission association
  Future<PlusApiResultBoolean?> deletePermission(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/role/permission/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
