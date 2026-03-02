import '../http/client.dart';
import '../models.dart';

class UserCouponApi {
  final HttpClient _client;
  
  UserCouponApi(this._client);

  /// Update an existing user coupon
  Future<PlusApiResultPlusUserCouponVO?> update(PlusUserCouponForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user/coupon'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCouponVO ? response : null;
  }

  /// Create a new user coupon
  Future<PlusApiResultPlusUserCouponVO?> create(PlusUserCouponForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/coupon'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCouponVO ? response : null;
  }

  /// Get user coupons by page
  Future<PlusApiResultPagePlusUserCouponVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/coupon/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserCouponVO ? response : null;
  }

  /// Get all user coupons
  Future<PlusApiResultListPlusUserCouponVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/coupon/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserCouponVO ? response : null;
  }

  /// Get a user coupon by ID
  Future<PlusApiResultPlusUserCouponVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/coupon/${id}'));
    return response is PlusApiResultPlusUserCouponVO ? response : null;
  }

  /// Delete a user coupon
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/coupon/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
