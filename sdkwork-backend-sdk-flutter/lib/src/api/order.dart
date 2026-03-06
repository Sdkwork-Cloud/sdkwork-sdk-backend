import '../http/client.dart';
import '../models.dart';

class OrderApi {
  final HttpClient _client;
  
  OrderApi(this._client);

  /// Update an existing order
  Future<PlusApiResultPlusOrderVO?> update(PlusOrderForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/order'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderVO ? response : null;
  }

  /// Create a new order
  Future<PlusApiResultPlusOrderVO?> create(PlusOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderVO ? response : null;
  }

  /// Ship an order
  Future<PlusApiResultOrderShipVO?> ship(String id, String? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/ship'), body: body, contentType: 'application/json');
    return response is PlusApiResultOrderShipVO ? response : null;
  }

  /// Confirm an order
  Future<PlusApiResultOrderConfirmVO?> confirm(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/confirm'));
    return response is PlusApiResultOrderConfirmVO ? response : null;
  }

  /// Complete an order
  Future<PlusApiResultOrderCompleteVO?> complete(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/complete'));
    return response is PlusApiResultOrderCompleteVO ? response : null;
  }

  /// Close an order
  Future<PlusApiResultOrderCloseVO?> close(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/close'));
    return response is PlusApiResultOrderCloseVO ? response : null;
  }

  /// Cancel an order
  Future<PlusApiResultOrderCancelVO?> cancel(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/cancel'));
    return response is PlusApiResultOrderCancelVO ? response : null;
  }

  /// Create virtual order
  Future<PlusApiResultVirtualOrderVO?> createVirtual(CreateVirtualOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/virtual'), body: body, contentType: 'application/json');
    return response is PlusApiResultVirtualOrderVO ? response : null;
  }

  /// Create VIP order
  Future<PlusApiResultVipOrderVO?> createVip(CreateVipOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/vip'), body: body, contentType: 'application/json');
    return response is PlusApiResultVipOrderVO ? response : null;
  }

  /// Create points order
  Future<PlusApiResultPointsOrderVO?> createPoints(CreatePointsOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/points'), body: body, contentType: 'application/json');
    return response is PlusApiResultPointsOrderVO ? response : null;
  }

  /// Get orders by page
  Future<PlusApiResultPagePlusOrderVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOrderVO ? response : null;
  }

  /// Get all orders
  Future<PlusApiResultListPlusOrderVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOrderVO ? response : null;
  }

  /// Create IM group order
  Future<PlusApiResultImGroupOrderVO?> createImGroup(CreateImGroupOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/im_group'), body: body, contentType: 'application/json');
    return response is PlusApiResultImGroupOrderVO ? response : null;
  }

  /// Create goods order
  Future<PlusApiResultGoodsOrderVO?> createGoods(CreateGoodsOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/goods'), body: body, contentType: 'application/json');
    return response is PlusApiResultGoodsOrderVO ? response : null;
  }

  /// Create booking order
  Future<PlusApiResultBookingOrderVO?> createBooking(CreateBookingOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/booking'), body: body, contentType: 'application/json');
    return response is PlusApiResultBookingOrderVO ? response : null;
  }

  /// Get an order by ID
  Future<PlusApiResultPlusOrderVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/order/${id}'));
    return response is PlusApiResultPlusOrderVO ? response : null;
  }

  /// Delete an order
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/order/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
