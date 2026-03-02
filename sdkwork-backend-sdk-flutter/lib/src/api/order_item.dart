import '../http/client.dart';
import '../models.dart';

class OrderItemApi {
  final HttpClient _client;
  
  OrderItemApi(this._client);

  /// Update an existing order item
  Future<PlusApiResultPlusOrderItemVO?> update(PlusOrderItemForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/order/item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderItemVO ? response : null;
  }

  /// Create a new order item
  Future<PlusApiResultPlusOrderItemVO?> create(PlusOrderItemForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderItemVO ? response : null;
  }

  /// Get order items by page
  Future<PlusApiResultPagePlusOrderItemVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/item/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOrderItemVO ? response : null;
  }

  /// Get all order items
  Future<PlusApiResultListPlusOrderItemVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/item/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOrderItemVO ? response : null;
  }

  /// Get an order item by ID
  Future<PlusApiResultPlusOrderItemVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/order/item/${id}'));
    return response is PlusApiResultPlusOrderItemVO ? response : null;
  }

  /// Delete an order item
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/order/item/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
