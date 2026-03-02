import '../http/client.dart';
import '../models.dart';

class RbacRoleApi {
  final HttpClient _client;
  
  RbacRoleApi(this._client);

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

  /// Get system roles by page
  Future<PlusApiResultPagePlusRoleVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/role/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusRoleVO ? response : null;
  }

  /// Get all system roles
  Future<PlusApiResultListPlusRoleVO?> listAllEntities(QueryListForm? body) async {
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
}
