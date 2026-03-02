import '../http/client.dart';
import '../models.dart';

class CouponTemplateApi {
  final HttpClient _client;
  
  CouponTemplateApi(this._client);

  /// Update an existing coupon template
  Future<PlusApiResultPlusCouponTemplateVO?> update(PlusCouponTemplateForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/coupon/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCouponTemplateVO ? response : null;
  }

  /// Create a new coupon template
  Future<PlusApiResultPlusCouponTemplateVO?> create(PlusCouponTemplateForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCouponTemplateVO ? response : null;
  }

  /// Get coupon templates by page
  Future<PlusApiResultPagePlusCouponTemplateVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/template/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCouponTemplateVO ? response : null;
  }

  /// Get all coupon templates
  Future<PlusApiResultListPlusCouponTemplateVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/coupon/template/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCouponTemplateVO ? response : null;
  }

  /// Get a coupon template by ID
  Future<PlusApiResultPlusCouponTemplateVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/coupon/template/${id}'));
    return response is PlusApiResultPlusCouponTemplateVO ? response : null;
  }

  /// Delete a coupon template
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/coupon/template/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
