import '../http/client.dart';
import '../models.dart';

class VipUserApi {
  final HttpClient _client;
  
  VipUserApi(this._client);

  /// Update an existing VIP user
  Future<PlusApiResultPlusVipUserVO?> update(PlusVipUserForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/user'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipUserVO ? response : null;
  }

  /// Create a new VIP user
  Future<PlusApiResultPlusVipUserVO?> create(PlusVipUserForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/user'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipUserVO ? response : null;
  }

  /// Get VIP users by page
  Future<PlusApiResultPagePlusVipUserVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/user/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipUserVO ? response : null;
  }

  /// Get all VIP users
  Future<PlusApiResultListPlusVipUserVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/user/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipUserVO ? response : null;
  }

  /// Get a VIP user by ID
  Future<PlusApiResultPlusVipUserVO?> getCurrentUser() async {
    final response = await _client.post(ApiPaths.backendPath('/vip/user/get_current_user'));
    return response is PlusApiResultPlusVipUserVO ? response : null;
  }

  /// Get a VIP user by ID
  Future<PlusApiResultPlusVipUserVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/user/${id}'));
    return response is PlusApiResultPlusVipUserVO ? response : null;
  }

  /// Delete a VIP user
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/user/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
