import '../http/client.dart';
import '../models.dart';

class VipApi {
  final HttpClient _client;
  
  VipApi(this._client);

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

  /// Update an existing VIP recharge record
  Future<PlusApiResultPlusVipRechargeVO?> updateRecharge(PlusVipRechargeForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/recharge'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipRechargeVO ? response : null;
  }

  /// Create a new VIP recharge record
  Future<PlusApiResultPlusVipRechargeVO?> createRecharge(PlusVipRechargeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipRechargeVO ? response : null;
  }

  /// Update an existing VIP recharge package
  Future<PlusApiResultPlusVipRechargePackVO?> updatePack(PlusVipRechargePackForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/recharge/pack'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipRechargePackVO ? response : null;
  }

  /// Create a new VIP recharge package
  Future<PlusApiResultPlusVipRechargePackVO?> createPack(PlusVipRechargePackForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/pack'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipRechargePackVO ? response : null;
  }

  /// Update an existing VIP point change record
  Future<PlusApiResultPlusVipPointChangeVO?> updateChange(PlusVipPointChangeForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/point/change'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPointChangeVO ? response : null;
  }

  /// Create a new VIP point change record
  Future<PlusApiResultPlusVipPointChangeVO?> createChange(PlusVipPointChangeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/point/change'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPointChangeVO ? response : null;
  }

  /// Update an existing VIP package group
  Future<PlusApiResultPlusVipPackGroupVO?> updatePackGroup(PlusVipPackGroupForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/pack_group'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPackGroupVO ? response : null;
  }

  /// Create a new VIP package group
  Future<PlusApiResultPlusVipPackGroupVO?> createPackGroup(PlusVipPackGroupForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack_group'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPackGroupVO ? response : null;
  }

  /// Update VIP Package
  Future<PlusApiResultPlusVipPackVO?> updatePack2(PlusVipPackForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/pack'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPackVO ? response : null;
  }

  /// Create VIP Package
  Future<PlusApiResultPlusVipPackVO?> createPack2(PlusVipPackForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPackVO ? response : null;
  }

  /// Update an existing VIP level
  Future<PlusApiResultPlusVipLevelVO?> updateLevel(PlusVipLevelForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/level'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipLevelVO ? response : null;
  }

  /// Create a new VIP level
  Future<PlusApiResultPlusVipLevelVO?> createLevel(PlusVipLevelForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipLevelVO ? response : null;
  }

  /// Update an existing VIP level benefit
  Future<PlusApiResultPlusVipLevelBenefitVO?> updateBenefit(PlusVipLevelBenefitForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/level/benefit'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipLevelBenefitVO ? response : null;
  }

  /// Create a new VIP level benefit
  Future<PlusApiResultPlusVipLevelBenefitVO?> createBenefit(PlusVipLevelBenefitForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/benefit'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipLevelBenefitVO ? response : null;
  }

  /// Update an existing VIP benefit
  Future<PlusApiResultPlusVipBenefitVO?> updateBenefit2(PlusVipBenefitForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/benefit'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipBenefitVO ? response : null;
  }

  /// Create a new VIP benefit
  Future<PlusApiResultPlusVipBenefitVO?> createBenefit2(PlusVipBenefitForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipBenefitVO ? response : null;
  }

  /// Update an existing VIP benefit usage record
  Future<PlusApiResultPlusVipBenefitUsageVO?> updateUsage(PlusVipBenefitUsageForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/benefit/usage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipBenefitUsageVO ? response : null;
  }

  /// Create a new VIP benefit usage record
  Future<PlusApiResultPlusVipBenefitUsageVO?> createUsage(PlusVipBenefitUsageForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/usage'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipBenefitUsageVO ? response : null;
  }

  /// Get VIP users by page
  Future<PlusApiResultPagePlusVipUserVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/user/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipUserVO ? response : null;
  }

  /// Get all VIP users
  Future<PlusApiResultListPlusVipUserVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/user/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipUserVO ? response : null;
  }

  /// Get a VIP user by ID
  Future<PlusApiResultPlusVipUserVO?> getCurrentUser() async {
    final response = await _client.post(ApiPaths.backendPath('/vip/user/get_current_user'));
    return response is PlusApiResultPlusVipUserVO ? response : null;
  }

  /// Get VIP recharge packages by page
  Future<PlusApiResultPagePlusVipRechargePackVO?> createListByPagePack(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/pack/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipRechargePackVO ? response : null;
  }

  /// Get all VIP recharge packages
  Future<PlusApiResultListPlusVipRechargePackVO?> createListAllEntitiesPack(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/pack/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipRechargePackVO ? response : null;
  }

  /// Get VIP recharge records by page
  Future<PlusApiResultPagePlusVipRechargeVO?> createListByPageRecharge(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipRechargeVO ? response : null;
  }

  /// Get all VIP recharge records
  Future<PlusApiResultListPlusVipRechargeVO?> createListAllEntitiesRecharge(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/recharge/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipRechargeVO ? response : null;
  }

  /// Get VIP point change records by page
  Future<PlusApiResultPagePlusVipPointChangeVO?> createListByPageChange(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/point/change/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipPointChangeVO ? response : null;
  }

  /// Get all VIP point change records
  Future<PlusApiResultListPlusVipPointChangeVO?> createListAllEntitiesChange(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/point/change/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipPointChangeVO ? response : null;
  }

  /// List public
  Future<PlusApiResultPagePlusVipPackGroupVO?> listPublic(PlusVipPackGroupQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack_group/list_public'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipPackGroupVO ? response : null;
  }

  /// Get VIP package groups by page
  Future<PlusApiResultPagePlusVipPackGroupVO?> createListByPagePackGroup(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack_group/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipPackGroupVO ? response : null;
  }

  /// Get all VIP package groups
  Future<PlusApiResultListPlusVipPackGroupVO?> createListAllEntitiesPackGroup(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack_group/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipPackGroupVO ? response : null;
  }

  /// Get VIP Packages by Page
  Future<PlusApiResultPagePlusVipPackVO?> createListByPagePack2(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipPackVO ? response : null;
  }

  /// Get All VIP Packages
  Future<PlusApiResultListPlusVipPackVO?> createListAllEntitiesPack2(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipPackVO ? response : null;
  }

  /// Get VIP levels by page
  Future<PlusApiResultPagePlusVipLevelVO?> createListByPageLevel(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipLevelVO ? response : null;
  }

  /// Get all VIP levels
  Future<PlusApiResultListPlusVipLevelVO?> createListAllEntitiesLevel(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipLevelVO ? response : null;
  }

  /// Get VIP level benefits by page
  Future<PlusApiResultPagePlusVipLevelBenefitVO?> createListByPageBenefit(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/benefit/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipLevelBenefitVO ? response : null;
  }

  /// Get all VIP level benefits
  Future<PlusApiResultListPlusVipLevelBenefitVO?> createListAllEntitiesBenefit(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/level/benefit/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipLevelBenefitVO ? response : null;
  }

  /// Get VIP benefit usage records by page
  Future<PlusApiResultPagePlusVipBenefitUsageVO?> createListByPageUsage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/usage/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipBenefitUsageVO ? response : null;
  }

  /// Get all VIP benefit usage records
  Future<PlusApiResultListPlusVipBenefitUsageVO?> createListAllEntitiesUsage(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/usage/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipBenefitUsageVO ? response : null;
  }

  /// Get VIP benefits by page
  Future<PlusApiResultPagePlusVipBenefitVO?> createListByPageBenefit2(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipBenefitVO ? response : null;
  }

  /// Get all VIP benefits
  Future<PlusApiResultListPlusVipBenefitVO?> createListAllEntitiesBenefit2(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/benefit/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipBenefitVO ? response : null;
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

  /// Get a VIP recharge record by ID
  Future<PlusApiResultPlusVipRechargeVO?> getByIdRecharge(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/recharge/${id}'));
    return response is PlusApiResultPlusVipRechargeVO ? response : null;
  }

  /// Delete a VIP recharge record
  Future<PlusApiResultBoolean?> deleteRecharge(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/recharge/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a VIP recharge package by ID
  Future<PlusApiResultPlusVipRechargePackVO?> getByIdPack(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/recharge/pack/${id}'));
    return response is PlusApiResultPlusVipRechargePackVO ? response : null;
  }

  /// Delete a VIP recharge package
  Future<PlusApiResultBoolean?> deletePack(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/recharge/pack/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a VIP point change record by ID
  Future<PlusApiResultPlusVipPointChangeVO?> getByIdChange(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/point/change/${id}'));
    return response is PlusApiResultPlusVipPointChangeVO ? response : null;
  }

  /// Delete a VIP point change record
  Future<PlusApiResultBoolean?> deleteChange(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/point/change/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a VIP package group by ID
  Future<PlusApiResultPlusVipPackGroupVO?> getByIdPackGroup(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/pack_group/${id}'));
    return response is PlusApiResultPlusVipPackGroupVO ? response : null;
  }

  /// Delete a VIP package group
  Future<PlusApiResultBoolean?> deletePackGroup(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/pack_group/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get VIP Package by ID
  Future<PlusApiResultPlusVipPackVO?> getByIdPack2(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/pack/${id}'));
    return response is PlusApiResultPlusVipPackVO ? response : null;
  }

  /// Delete VIP Package
  Future<PlusApiResultBoolean?> deletePack2(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/pack/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a VIP level by ID
  Future<PlusApiResultPlusVipLevelVO?> getByIdLevel(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/level/${id}'));
    return response is PlusApiResultPlusVipLevelVO ? response : null;
  }

  /// Delete a VIP level
  Future<PlusApiResultBoolean?> deleteLevel(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/level/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a VIP level benefit by ID
  Future<PlusApiResultPlusVipLevelBenefitVO?> getByIdBenefit(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/level/benefit/${id}'));
    return response is PlusApiResultPlusVipLevelBenefitVO ? response : null;
  }

  /// Delete a VIP level benefit
  Future<PlusApiResultBoolean?> deleteBenefit(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/level/benefit/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a VIP benefit by ID
  Future<PlusApiResultPlusVipBenefitVO?> getByIdBenefit2(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/benefit/${id}'));
    return response is PlusApiResultPlusVipBenefitVO ? response : null;
  }

  /// Delete a VIP benefit
  Future<PlusApiResultBoolean?> deleteBenefit2(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/benefit/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a VIP benefit usage record by ID
  Future<PlusApiResultPlusVipBenefitUsageVO?> getByIdUsage(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/benefit/usage/${id}'));
    return response is PlusApiResultPlusVipBenefitUsageVO ? response : null;
  }

  /// Delete a VIP benefit usage record
  Future<PlusApiResultBoolean?> deleteUsage(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/benefit/usage/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
