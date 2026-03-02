import '../http/client.dart';
import '../models.dart';

class VipPackageApi {
  final HttpClient _client;
  
  VipPackageApi(this._client);

  /// Update VIP Package
  Future<PlusApiResultPlusVipPackVO?> update(PlusVipPackForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/pack'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPackVO ? response : null;
  }

  /// Create VIP Package
  Future<PlusApiResultPlusVipPackVO?> create(PlusVipPackForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPackVO ? response : null;
  }

  /// Get VIP Packages by Page
  Future<PlusApiResultPagePlusVipPackVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipPackVO ? response : null;
  }

  /// Get All VIP Packages
  Future<PlusApiResultListPlusVipPackVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipPackVO ? response : null;
  }

  /// Get VIP Package by ID
  Future<PlusApiResultPlusVipPackVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/pack/${id}'));
    return response is PlusApiResultPlusVipPackVO ? response : null;
  }

  /// Delete VIP Package
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/pack/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
