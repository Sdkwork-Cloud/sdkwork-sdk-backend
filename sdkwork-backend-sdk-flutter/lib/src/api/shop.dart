import '../http/client.dart';
import '../models.dart';

class ShopApi {
  final HttpClient _client;
  
  ShopApi(this._client);

  /// Update an existing shop
  Future<PlusApiResultPlusShopVO?> update(PlusShopForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/shop'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShopVO ? response : null;
  }

  /// Create a new shop
  Future<PlusApiResultPlusShopVO?> create(PlusShopForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/shop'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShopVO ? response : null;
  }

  /// Get shops by page
  Future<PlusApiResultPagePlusShopVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/shop/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusShopVO ? response : null;
  }

  /// Get all shops
  Future<PlusApiResultListPlusShopVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/shop/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusShopVO ? response : null;
  }

  /// Get a shop by ID
  Future<PlusApiResultPlusShopVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/shop/${id}'));
    return response is PlusApiResultPlusShopVO ? response : null;
  }

  /// Delete a shop
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/shop/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
