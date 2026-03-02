import '../http/client.dart';
import '../models.dart';

class ShoppingCartItemApi {
  final HttpClient _client;
  
  ShoppingCartItemApi(this._client);

  /// Update an existing shopping cart item
  Future<PlusApiResultPlusShoppingCartItemVO?> update(PlusShoppingCartItemForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/shopping/cart/item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShoppingCartItemVO ? response : null;
  }

  /// Create a new shopping cart item
  Future<PlusApiResultPlusShoppingCartItemVO?> create(PlusShoppingCartItemForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShoppingCartItemVO ? response : null;
  }

  /// Get shopping cart items by page
  Future<PlusApiResultPagePlusShoppingCartItemVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/item/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusShoppingCartItemVO ? response : null;
  }

  /// Get all shopping cart items
  Future<PlusApiResultListPlusShoppingCartItemVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/item/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusShoppingCartItemVO ? response : null;
  }

  /// Get a shopping cart item by ID
  Future<PlusApiResultPlusShoppingCartItemVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/shopping/cart/item/${id}'));
    return response is PlusApiResultPlusShoppingCartItemVO ? response : null;
  }

  /// Delete a shopping cart item
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/shopping/cart/item/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
