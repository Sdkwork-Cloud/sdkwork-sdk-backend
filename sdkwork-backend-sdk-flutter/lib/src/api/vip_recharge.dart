import '../http/client.dart';
import '../models.dart';

class VipRechargeApi {
  final HttpClient _client;
  
  VipRechargeApi(this._client);

  /// Update an existing VIP recharge record
  Future<PlusApiResultPlusVipRechargeVO?> update(PlusVipRechargeForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/recharge'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipRechargeVO ? response : null;
  }

  /// Create a new VIP recharge record
  Future<PlusApiResultPlusVipRechargeVO?> create(PlusVipRechargeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipRechargeVO ? response : null;
  }

  /// Get VIP recharge records by page
  Future<PlusApiResultPagePlusVipRechargeVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipRechargeVO ? response : null;
  }

  /// Get all VIP recharge records
  Future<PlusApiResultListPlusVipRechargeVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipRechargeVO ? response : null;
  }

  /// Get a VIP recharge record by ID
  Future<PlusApiResultPlusVipRechargeVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/recharge/${id}'));
    return response is PlusApiResultPlusVipRechargeVO ? response : null;
  }

  /// Delete a VIP recharge record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/recharge/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
