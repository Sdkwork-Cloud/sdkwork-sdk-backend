import '../http/client.dart';
import '../models.dart';

class VipBenefitUsageApi {
  final HttpClient _client;
  
  VipBenefitUsageApi(this._client);

  /// Update an existing VIP benefit usage record
  Future<PlusApiResultPlusVipBenefitUsageVO?> update(PlusVipBenefitUsageForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/benefit/usage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipBenefitUsageVO ? response : null;
  }

  /// Create a new VIP benefit usage record
  Future<PlusApiResultPlusVipBenefitUsageVO?> create(PlusVipBenefitUsageForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/usage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipBenefitUsageVO ? response : null;
  }

  /// Get VIP benefit usage records by page
  Future<PlusApiResultPagePlusVipBenefitUsageVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/usage/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipBenefitUsageVO ? response : null;
  }

  /// Get all VIP benefit usage records
  Future<PlusApiResultListPlusVipBenefitUsageVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/usage/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipBenefitUsageVO ? response : null;
  }

  /// Get a VIP benefit usage record by ID
  Future<PlusApiResultPlusVipBenefitUsageVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/benefit/usage/${id}'));
    return response is PlusApiResultPlusVipBenefitUsageVO ? response : null;
  }

  /// Delete a VIP benefit usage record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/benefit/usage/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
