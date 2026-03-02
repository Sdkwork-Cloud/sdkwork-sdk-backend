import '../http/client.dart';
import '../models.dart';

class VipRechargePackageApi {
  final HttpClient _client;
  
  VipRechargePackageApi(this._client);

  /// Update an existing VIP recharge package
  Future<PlusApiResultPlusVipRechargePackVO?> update(PlusVipRechargePackForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/recharge/pack'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipRechargePackVO ? response : null;
  }

  /// Create a new VIP recharge package
  Future<PlusApiResultPlusVipRechargePackVO?> create(PlusVipRechargePackForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/pack'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipRechargePackVO ? response : null;
  }

  /// Get VIP recharge packages by page
  Future<PlusApiResultPagePlusVipRechargePackVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/pack/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipRechargePackVO ? response : null;
  }

  /// Get all VIP recharge packages
  Future<PlusApiResultListPlusVipRechargePackVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/pack/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipRechargePackVO ? response : null;
  }

  /// Get a VIP recharge package by ID
  Future<PlusApiResultPlusVipRechargePackVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/recharge/pack/${id}'));
    return response is PlusApiResultPlusVipRechargePackVO ? response : null;
  }

  /// Delete a VIP recharge package
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/recharge/pack/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
