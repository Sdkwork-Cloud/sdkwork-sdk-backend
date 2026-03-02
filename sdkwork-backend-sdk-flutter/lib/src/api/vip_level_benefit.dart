import '../http/client.dart';
import '../models.dart';

class VipLevelBenefitApi {
  final HttpClient _client;
  
  VipLevelBenefitApi(this._client);

  /// Update an existing VIP level benefit
  Future<PlusApiResultPlusVipLevelBenefitVO?> update(PlusVipLevelBenefitForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/level/benefit'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipLevelBenefitVO ? response : null;
  }

  /// Create a new VIP level benefit
  Future<PlusApiResultPlusVipLevelBenefitVO?> create(PlusVipLevelBenefitForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/benefit'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipLevelBenefitVO ? response : null;
  }

  /// Get VIP level benefits by page
  Future<PlusApiResultPagePlusVipLevelBenefitVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/benefit/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipLevelBenefitVO ? response : null;
  }

  /// Get all VIP level benefits
  Future<PlusApiResultListPlusVipLevelBenefitVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/benefit/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipLevelBenefitVO ? response : null;
  }

  /// Get a VIP level benefit by ID
  Future<PlusApiResultPlusVipLevelBenefitVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/level/benefit/${id}'));
    return response is PlusApiResultPlusVipLevelBenefitVO ? response : null;
  }

  /// Delete a VIP level benefit
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/level/benefit/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
