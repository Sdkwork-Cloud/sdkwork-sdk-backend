import '../http/client.dart';
import '../models.dart';

class VipBenefitApi {
  final HttpClient _client;
  
  VipBenefitApi(this._client);

  /// Update an existing VIP benefit
  Future<PlusApiResultPlusVipBenefitVO?> update(PlusVipBenefitForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/benefit'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipBenefitVO ? response : null;
  }

  /// Create a new VIP benefit
  Future<PlusApiResultPlusVipBenefitVO?> create(PlusVipBenefitForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipBenefitVO ? response : null;
  }

  /// Get VIP benefits by page
  Future<PlusApiResultPagePlusVipBenefitVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipBenefitVO ? response : null;
  }

  /// Get all VIP benefits
  Future<PlusApiResultListPlusVipBenefitVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipBenefitVO ? response : null;
  }

  /// Get a VIP benefit by ID
  Future<PlusApiResultPlusVipBenefitVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/benefit/${id}'));
    return response is PlusApiResultPlusVipBenefitVO ? response : null;
  }

  /// Delete a VIP benefit
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/benefit/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
