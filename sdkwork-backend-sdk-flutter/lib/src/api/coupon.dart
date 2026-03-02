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

  /// Get coupon templates by page
  Future<PlusApiResultPagePlusCouponVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCouponVO ? response : null;
  }

  /// Get all coupon templates
  Future<PlusApiResultListPlusCouponVO?> listAllEntities(QueryListForm? body) async {
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
}
