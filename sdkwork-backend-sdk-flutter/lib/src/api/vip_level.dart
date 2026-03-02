import '../http/client.dart';
import '../models.dart';

class VipLevelApi {
  final HttpClient _client;
  
  VipLevelApi(this._client);

  /// Update an existing VIP level
  Future<PlusApiResultPlusVipLevelVO?> update(PlusVipLevelForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/level'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipLevelVO ? response : null;
  }

  /// Create a new VIP level
  Future<PlusApiResultPlusVipLevelVO?> create(PlusVipLevelForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipLevelVO ? response : null;
  }

  /// Get VIP levels by page
  Future<PlusApiResultPagePlusVipLevelVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipLevelVO ? response : null;
  }

  /// Get all VIP levels
  Future<PlusApiResultListPlusVipLevelVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipLevelVO ? response : null;
  }

  /// Get a VIP level by ID
  Future<PlusApiResultPlusVipLevelVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/level/${id}'));
    return response is PlusApiResultPlusVipLevelVO ? response : null;
  }

  /// Delete a VIP level
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/level/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
