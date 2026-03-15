import '../http/client.dart';
import '../models.dart';

class PermissionApi {
  final HttpClient _client;
  
  PermissionApi(this._client);

  Future<PlusApiResultPlusPermissionVO?> update(PlusPermissionForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/permission'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPermissionVO ? response : null;
  }

  Future<PlusApiResultPlusPermissionVO?> create(PlusPermissionForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/permission'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPermissionVO ? response : null;
  }

  /// List permissions by page
  Future<PlusApiResultPagePlusPermissionVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/permission/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPermissionVO ? response : null;
  }

  /// List all permissions
  Future<PlusApiResultListPlusPermissionVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/permission/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPermissionVO ? response : null;
  }

  Future<PlusApiResultPlusPermissionVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/permission/${id}'));
    return response is PlusApiResultPlusPermissionVO ? response : null;
  }

  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/permission/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
