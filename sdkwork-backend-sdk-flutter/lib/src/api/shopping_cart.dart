import '../http/client.dart';
import '../models.dart';

class ShoppingCartApi {
  final HttpClient _client;
  
  ShoppingCartApi(this._client);

  /// Update shopping cart
  Future<PlusApiResultPlusShoppingCartVO?> update(PlusShoppingCartForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/shopping/cart'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShoppingCartVO ? response : null;
  }

  /// Create shopping cart
  Future<PlusApiResultPlusShoppingCartVO?> create(PlusShoppingCartForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShoppingCartVO ? response : null;
  }

  /// Get shopping carts by page
  Future<PlusApiResultPagePlusShoppingCartVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusShoppingCartVO ? response : null;
  }

  /// Get all shopping carts
  Future<PlusApiResultListPlusShoppingCartVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusShoppingCartVO ? response : null;
  }

  /// Get shopping cart by ID
  Future<PlusApiResultPlusShoppingCartVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/shopping/cart/${id}'));
    return response is PlusApiResultPlusShoppingCartVO ? response : null;
  }

  /// Delete shopping cart
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/shopping/cart/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
