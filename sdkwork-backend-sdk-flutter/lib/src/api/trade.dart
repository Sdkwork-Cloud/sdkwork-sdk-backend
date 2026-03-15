import '../http/client.dart';
import '../models.dart';

class TradeApi {
  final HttpClient _client;
  
  TradeApi(this._client);

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

  /// Update an existing shopping cart item
  Future<PlusApiResultPlusShoppingCartItemVO?> updateItem(PlusShoppingCartItemForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/shopping/cart/item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShoppingCartItemVO ? response : null;
  }

  /// Create a new shopping cart item
  Future<PlusApiResultPlusShoppingCartItemVO?> createItem(PlusShoppingCartItemForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShoppingCartItemVO ? response : null;
  }

  /// Update an existing refund record
  Future<PlusApiResultPlusRefundVO?> updateRefund(PlusRefundForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/refund'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRefundVO ? response : null;
  }

  /// Create a new refund record
  Future<PlusApiResultPlusRefundVO?> createRefund(PlusRefundForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/refund'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusRefundVO ? response : null;
  }

  /// Update an existing payment record
  Future<PlusApiResultPlusPaymentVO?> updatePayment(PlusPaymentForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/payment'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPaymentVO ? response : null;
  }

  /// Create a new payment record
  Future<PlusApiResultPlusPaymentVO?> createPayment(PlusPaymentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPaymentVO ? response : null;
  }

  /// Update an existing order
  Future<PlusApiResultPlusOrderVO?> updateOrder(PlusOrderForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/order'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderVO ? response : null;
  }

  /// Create a new order
  Future<PlusApiResultPlusOrderVO?> createOrder(PlusOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderVO ? response : null;
  }

  /// Update worker dispatch profile
  Future<PlusApiResultPlusOrderWorkerDispatchProfileVO?> updateWorkerDispatchProfile(PlusOrderWorkerDispatchProfileForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/order/worker-dispatch-profile'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderWorkerDispatchProfileVO ? response : null;
  }

  /// Create worker dispatch profile
  Future<PlusApiResultPlusOrderWorkerDispatchProfileVO?> createWorkerDispatchProfile(PlusOrderWorkerDispatchProfileForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/worker-dispatch-profile'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderWorkerDispatchProfileVO ? response : null;
  }

  /// Update an existing order item
  Future<PlusApiResultPlusOrderItemVO?> updateItem2(PlusOrderItemForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/order/item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderItemVO ? response : null;
  }

  /// Create a new order item
  Future<PlusApiResultPlusOrderItemVO?> createItem2(PlusOrderItemForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderItemVO ? response : null;
  }

  /// Update dispatch rule
  Future<PlusApiResultPlusOrderDispatchRuleVO?> updateDispatchRule(PlusOrderDispatchRuleForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/trade/order/dispatch-rule'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderDispatchRuleVO ? response : null;
  }

  /// Create dispatch rule
  Future<PlusApiResultPlusOrderDispatchRuleVO?> createDispatchRule(PlusOrderDispatchRuleForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/dispatch-rule'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrderDispatchRuleVO ? response : null;
  }

  /// Get shopping carts by page
  Future<PlusApiResultPagePlusShoppingCartVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusShoppingCartVO ? response : null;
  }

  /// Get all shopping carts
  Future<PlusApiResultListPlusShoppingCartVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusShoppingCartVO ? response : null;
  }

  /// Get shopping cart items by page
  Future<PlusApiResultPagePlusShoppingCartItemVO?> createListByPageItem(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/item/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusShoppingCartItemVO ? response : null;
  }

  /// Get all shopping cart items
  Future<PlusApiResultListPlusShoppingCartItemVO?> createListAllEntitiesItem(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/shopping/cart/item/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusShoppingCartItemVO ? response : null;
  }

  /// Get refund records by page
  Future<PlusApiResultPagePlusRefundVO?> createListByPageRefund(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/refund/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusRefundVO ? response : null;
  }

  /// Get all refund records
  Future<PlusApiResultListPlusRefundVO?> createListAllEntitiesRefund(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/refund/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusRefundVO ? response : null;
  }

  /// Check payment status
  Future<PlusApiResultBoolean?> checkPaymentStatus(PlusPaymentStatusQueryForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/status'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Refund payment
  Future<PlusApiResultBoolean?> refundPayment(PlusRefundForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/refund'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get payment records by page
  Future<PlusApiResultPagePlusPaymentVO?> createListByPagePayment(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPaymentVO ? response : null;
  }

  /// Get all payment records
  Future<PlusApiResultListPlusPaymentVO?> createListAllEntitiesPayment(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPaymentVO ? response : null;
  }

  /// Cancel payment
  Future<PlusApiResultBoolean?> cancelPayment(PlusPaymentCancelForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/payment/cancel'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Ship an order
  Future<PlusApiResultOrderShipVO?> shipOrder(String id, String? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/ship'), body: body, contentType: 'application/json');
    return response is PlusApiResultOrderShipVO ? response : null;
  }

  /// Start service order
  Future<PlusApiResultServiceOrderVO?> startServiceOrder(String id, OrderDispatchActionForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/dispatch/start'), body: body, contentType: 'application/json');
    return response is PlusApiResultServiceOrderVO ? response : null;
  }

  /// Release service order
  Future<PlusApiResultServiceOrderVO?> releaseServiceOrder(String id, OrderDispatchActionForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/dispatch/release'), body: body, contentType: 'application/json');
    return response is PlusApiResultServiceOrderVO ? response : null;
  }

  /// Complete service order
  Future<PlusApiResultServiceOrderVO?> completeServiceOrder(String id, OrderDispatchActionForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/dispatch/complete'), body: body, contentType: 'application/json');
    return response is PlusApiResultServiceOrderVO ? response : null;
  }

  /// Claim service order
  Future<PlusApiResultServiceOrderVO?> claimServiceOrder(String id, OrderDispatchActionForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/dispatch/claim'), body: body, contentType: 'application/json');
    return response is PlusApiResultServiceOrderVO ? response : null;
  }

  /// Assign service order
  Future<PlusApiResultServiceOrderVO?> assignServiceOrder(String id, OrderDispatchAssignForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/dispatch/assign'), body: body, contentType: 'application/json');
    return response is PlusApiResultServiceOrderVO ? response : null;
  }

  /// Confirm an order
  Future<PlusApiResultOrderConfirmVO?> confirmOrder(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/confirm'));
    return response is PlusApiResultOrderConfirmVO ? response : null;
  }

  /// Complete an order
  Future<PlusApiResultOrderCompleteVO?> completeOrder(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/complete'));
    return response is PlusApiResultOrderCompleteVO ? response : null;
  }

  /// Close an order
  Future<PlusApiResultOrderCloseVO?> closeOrder(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/close'));
    return response is PlusApiResultOrderCloseVO ? response : null;
  }

  /// Cancel an order
  Future<PlusApiResultOrderCancelVO?> cancelOrder(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/${id}/cancel'));
    return response is PlusApiResultOrderCancelVO ? response : null;
  }

  /// List worker dispatch profiles by page
  Future<PlusApiResultPagePlusOrderWorkerDispatchProfileVO?> createListByPageWorkerDispatchProfile(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/worker-dispatch-profile/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOrderWorkerDispatchProfileVO ? response : null;
  }

  /// List all worker dispatch profiles
  Future<PlusApiResultListPlusOrderWorkerDispatchProfileVO?> createListAllEntitiesWorkerDispatchProfile(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/worker-dispatch-profile/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOrderWorkerDispatchProfileVO ? response : null;
  }

  /// Create virtual order
  Future<PlusApiResultVirtualOrderVO?> createVirtualOrder(CreateVirtualOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/virtual'), body: body, contentType: 'application/json');
    return response is PlusApiResultVirtualOrderVO ? response : null;
  }

  /// Create VIP order
  Future<PlusApiResultVipOrderVO?> createVipOrder(CreateVipOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/vip'), body: body, contentType: 'application/json');
    return response is PlusApiResultVipOrderVO ? response : null;
  }

  /// Create service order
  Future<PlusApiResultServiceOrderVO?> createServiceOrder(CreateServiceOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/service'), body: body, contentType: 'application/json');
    return response is PlusApiResultServiceOrderVO ? response : null;
  }

  /// Create points order
  Future<PlusApiResultPointsOrderVO?> createPointsOrder(CreatePointsOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/points'), body: body, contentType: 'application/json');
    return response is PlusApiResultPointsOrderVO ? response : null;
  }

  /// Get orders by page
  Future<PlusApiResultPagePlusOrderVO?> createListByPageOrder(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOrderVO ? response : null;
  }

  /// Get all orders
  Future<PlusApiResultListPlusOrderVO?> createListAllEntitiesOrder(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOrderVO ? response : null;
  }

  /// Get order items by page
  Future<PlusApiResultPagePlusOrderItemVO?> createListByPageItem2(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/item/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOrderItemVO ? response : null;
  }

  /// Get all order items
  Future<PlusApiResultListPlusOrderItemVO?> createListAllEntitiesItem2(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/item/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOrderItemVO ? response : null;
  }

  /// Create IM group order
  Future<PlusApiResultImGroupOrderVO?> createImGroupOrder(CreateImGroupOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/im_group'), body: body, contentType: 'application/json');
    return response is PlusApiResultImGroupOrderVO ? response : null;
  }

  /// Create goods order
  Future<PlusApiResultGoodsOrderVO?> createGoodsOrder(CreateGoodsOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/goods'), body: body, contentType: 'application/json');
    return response is PlusApiResultGoodsOrderVO ? response : null;
  }

  /// List dispatch rules by page
  Future<PlusApiResultPagePlusOrderDispatchRuleVO?> createListByPageDispatchRule(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/dispatch-rule/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOrderDispatchRuleVO ? response : null;
  }

  /// List all dispatch rules
  Future<PlusApiResultListPlusOrderDispatchRuleVO?> createListAllEntitiesDispatchRule(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/dispatch-rule/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOrderDispatchRuleVO ? response : null;
  }

  /// Create booking order
  Future<PlusApiResultBookingOrderVO?> createBookingOrder(CreateBookingOrderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/trade/order/booking'), body: body, contentType: 'application/json');
    return response is PlusApiResultBookingOrderVO ? response : null;
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

  /// Get a shopping cart item by ID
  Future<PlusApiResultPlusShoppingCartItemVO?> getByIdItem(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/shopping/cart/item/${id}'));
    return response is PlusApiResultPlusShoppingCartItemVO ? response : null;
  }

  /// Delete a shopping cart item
  Future<PlusApiResultBoolean?> deleteItem(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/shopping/cart/item/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a refund record by ID
  Future<PlusApiResultPlusRefundVO?> getByIdRefund(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/refund/${id}'));
    return response is PlusApiResultPlusRefundVO ? response : null;
  }

  /// Delete a refund record
  Future<PlusApiResultBoolean?> deleteRefund(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/refund/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a payment record by ID
  Future<PlusApiResultPlusPaymentVO?> getByIdPayment(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/payment/${id}'));
    return response is PlusApiResultPlusPaymentVO ? response : null;
  }

  /// Delete a payment record
  Future<PlusApiResultBoolean?> deletePayment(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/payment/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get an order by ID
  Future<PlusApiResultPlusOrderVO?> getByIdOrder(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/order/${id}'));
    return response is PlusApiResultPlusOrderVO ? response : null;
  }

  /// Delete an order
  Future<PlusApiResultBoolean?> deleteOrder(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/order/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get worker dispatch profile by id
  Future<PlusApiResultPlusOrderWorkerDispatchProfileVO?> getByIdWorkerDispatchProfile(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/order/worker-dispatch-profile/${id}'));
    return response is PlusApiResultPlusOrderWorkerDispatchProfileVO ? response : null;
  }

  /// Delete worker dispatch profile
  Future<PlusApiResultBoolean?> deleteWorkerDispatchProfile(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/order/worker-dispatch-profile/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get an order item by ID
  Future<PlusApiResultPlusOrderItemVO?> getByIdItem2(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/order/item/${id}'));
    return response is PlusApiResultPlusOrderItemVO ? response : null;
  }

  /// Delete an order item
  Future<PlusApiResultBoolean?> deleteItem2(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/order/item/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get dispatch rule by id
  Future<PlusApiResultPlusOrderDispatchRuleVO?> getByIdDispatchRule(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/trade/order/dispatch-rule/${id}'));
    return response is PlusApiResultPlusOrderDispatchRuleVO ? response : null;
  }

  /// Delete dispatch rule
  Future<PlusApiResultBoolean?> deleteDispatchRule(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/trade/order/dispatch-rule/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
