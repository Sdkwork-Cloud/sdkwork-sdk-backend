import '../http/client.dart';
import '../models.dart';

class SkuApi {
  final HttpClient _client;
  
  SkuApi(this._client);

  /// Update an existing SKU
  Future<PlusApiResultPlusSkuVO?> update(PlusSkuForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/sku'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusSkuVO ? response : null;
  }

  /// Create a new SKU
  Future<PlusApiResultPlusSkuVO?> create(PlusSkuForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/sku'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusSkuVO ? response : null;
  }

  /// Get SKUs by page
  Future<PlusApiResultPagePlusSkuVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/sku/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusSkuVO ? response : null;
  }

  /// Get all SKUs
  Future<PlusApiResultListPlusSkuVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/sku/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusSkuVO ? response : null;
  }

  /// Get an SKU by ID
  Future<PlusApiResultPlusSkuVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/sku/${id}'));
    return response is PlusApiResultPlusSkuVO ? response : null;
  }

  /// Delete an SKU
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/sku/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
