import '../http/client.dart';
import '../models.dart';

class AuthorizationApi {
  final HttpClient _client;
  
  AuthorizationApi(this._client);

  /// 检查用户角色
  Future<PlusApiResultBoolean?> hasRole(RoleCheckForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authorization/has_role'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// 检查用户权限
  Future<PlusApiResultBoolean?> hasPermission(PermissionCheckForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authorization/has_permission'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// 获取用户角色列表
  Future<PlusApiResultListString?> getRoles() async {
    final response = await _client.get(ApiPaths.backendPath('/auth/authorization/roles'));
    return response is PlusApiResultListString ? response : null;
  }

  /// 获取用户权限列表
  Future<PlusApiResultListString?> getPermissions() async {
    final response = await _client.get(ApiPaths.backendPath('/auth/authorization/permissions'));
    return response is PlusApiResultListString ? response : null;
  }
}
