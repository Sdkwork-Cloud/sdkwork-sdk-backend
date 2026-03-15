import '../http/client.dart';
import '../models.dart';

class CouponApi {
  final HttpClient _client;
  
  CouponApi(this._client);

  /// Update an existing coupon template
  Future<PlusApiResultPlusCouponVO?> update(PlusCouponForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/coupon'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCouponVO ? response : null;
  }

  /// Create a new coupon template
  Future<PlusApiResultPlusCouponVO?> create(PlusCouponForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCouponVO ? response : null;
  }

  /// Update an existing coupon template
  Future<PlusApiResultPlusCouponTemplateVO?> updateTemplate(PlusCouponTemplateForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/coupon/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCouponTemplateVO ? response : null;
  }

  /// Create a new coupon template
  Future<PlusApiResultPlusCouponTemplateVO?> createTemplate(PlusCouponTemplateForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCouponTemplateVO ? response : null;
  }

  /// Exchange coupon by points
  Future<PlusApiResultPlusUserCouponVO?> exchangeByPoints(String couponId, CouponPointsExchangeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/${couponId}/exchange/points'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCouponVO ? response : null;
  }

  /// Get coupon templates by page
  Future<PlusApiResultPagePlusCouponTemplateVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/template/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCouponTemplateVO ? response : null;
  }

  /// Get all coupon templates
  Future<PlusApiResultListPlusCouponTemplateVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/template/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCouponTemplateVO ? response : null;
  }

  /// Redeem coupon
  Future<PlusApiResultPlusUserCouponVO?> redeem(CouponRedeemForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/redeem'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCouponVO ? response : null;
  }

  /// Rollback points exchange coupon
  Future<PlusApiResultPlusUserCouponVO?> rollbackPointsExchange(String userCouponId, CouponRollbackForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/my/${userCouponId}/rollback'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCouponVO ? response : null;
  }

  /// Get coupon templates by page
  Future<PlusApiResultPagePlusCouponVO?> createListByPageCoupon(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCouponVO ? response : null;
  }

  /// Get all coupon templates
  Future<PlusApiResultListPlusCouponVO?> createListAllEntitiesCoupon(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCouponVO ? response : null;
  }

  /// Get a coupon template by ID
  Future<PlusApiResultPlusCouponVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/coupon/${id}'));
    return response is PlusApiResultPlusCouponVO ? response : null;
  }

  /// Delete a coupon template
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/coupon/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a coupon template by ID
  Future<PlusApiResultPlusCouponTemplateVO?> getByIdTemplate(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/coupon/template/${id}'));
    return response is PlusApiResultPlusCouponTemplateVO ? response : null;
  }

  /// Delete a coupon template
  Future<PlusApiResultBoolean?> deleteTemplate(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/coupon/template/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
