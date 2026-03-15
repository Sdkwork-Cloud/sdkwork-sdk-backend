import Foundation

public class TradeApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update shopping cart
    public func update(body: PlusShoppingCartForm) async throws -> PlusApiResultPlusShoppingCartVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/shopping/cart"), body: body)
        return response as? PlusApiResultPlusShoppingCartVO
    }

    /// Create shopping cart
    public func create(body: PlusShoppingCartForm) async throws -> PlusApiResultPlusShoppingCartVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart"), body: body)
        return response as? PlusApiResultPlusShoppingCartVO
    }

    /// Update an existing shopping cart item
    public func updateItem(body: PlusShoppingCartItemForm) async throws -> PlusApiResultPlusShoppingCartItemVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/shopping/cart/item"), body: body)
        return response as? PlusApiResultPlusShoppingCartItemVO
    }

    /// Create a new shopping cart item
    public func createItem(body: PlusShoppingCartItemForm) async throws -> PlusApiResultPlusShoppingCartItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/item"), body: body)
        return response as? PlusApiResultPlusShoppingCartItemVO
    }

    /// Update an existing refund record
    public func updateRefund(body: PlusRefundForm) async throws -> PlusApiResultPlusRefundVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/refund"), body: body)
        return response as? PlusApiResultPlusRefundVO
    }

    /// Create a new refund record
    public func createRefund(body: PlusRefundForm) async throws -> PlusApiResultPlusRefundVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/refund"), body: body)
        return response as? PlusApiResultPlusRefundVO
    }

    /// Update an existing payment record
    public func updatePayment(body: PlusPaymentForm) async throws -> PlusApiResultPlusPaymentVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/payment"), body: body)
        return response as? PlusApiResultPlusPaymentVO
    }

    /// Create a new payment record
    public func createPayment(body: PlusPaymentForm) async throws -> PlusApiResultPlusPaymentVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment"), body: body)
        return response as? PlusApiResultPlusPaymentVO
    }

    /// Update an existing order
    public func updateOrder(body: PlusOrderForm) async throws -> PlusApiResultPlusOrderVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/order"), body: body)
        return response as? PlusApiResultPlusOrderVO
    }

    /// Create a new order
    public func createOrder(body: PlusOrderForm) async throws -> PlusApiResultPlusOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order"), body: body)
        return response as? PlusApiResultPlusOrderVO
    }

    /// Update worker dispatch profile
    public func updateWorkerDispatchProfile(body: PlusOrderWorkerDispatchProfileForm) async throws -> PlusApiResultPlusOrderWorkerDispatchProfileVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/order/worker-dispatch-profile"), body: body)
        return response as? PlusApiResultPlusOrderWorkerDispatchProfileVO
    }

    /// Create worker dispatch profile
    public func createWorkerDispatchProfile(body: PlusOrderWorkerDispatchProfileForm) async throws -> PlusApiResultPlusOrderWorkerDispatchProfileVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/worker-dispatch-profile"), body: body)
        return response as? PlusApiResultPlusOrderWorkerDispatchProfileVO
    }

    /// Update an existing order item
    public func updateItem2(body: PlusOrderItemForm) async throws -> PlusApiResultPlusOrderItemVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/order/item"), body: body)
        return response as? PlusApiResultPlusOrderItemVO
    }

    /// Create a new order item
    public func createItem2(body: PlusOrderItemForm) async throws -> PlusApiResultPlusOrderItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/item"), body: body)
        return response as? PlusApiResultPlusOrderItemVO
    }

    /// Update dispatch rule
    public func updateDispatchRule(body: PlusOrderDispatchRuleForm) async throws -> PlusApiResultPlusOrderDispatchRuleVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/order/dispatch-rule"), body: body)
        return response as? PlusApiResultPlusOrderDispatchRuleVO
    }

    /// Create dispatch rule
    public func createDispatchRule(body: PlusOrderDispatchRuleForm) async throws -> PlusApiResultPlusOrderDispatchRuleVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/dispatch-rule"), body: body)
        return response as? PlusApiResultPlusOrderDispatchRuleVO
    }

    /// Get shopping carts by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShoppingCartVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShoppingCartVO
    }

    /// Get all shopping carts
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShoppingCartVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/list/all"), body: body)
        return response as? PlusApiResultListPlusShoppingCartVO
    }

    /// Get shopping cart items by page
    public func createListByPageItem(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShoppingCartItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShoppingCartItemVO
    }

    /// Get all shopping cart items
    public func createListAllEntitiesItem(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShoppingCartItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/shopping/cart/item/list/all"), body: body)
        return response as? PlusApiResultListPlusShoppingCartItemVO
    }

    /// Get refund records by page
    public func createListByPageRefund(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusRefundVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/refund/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusRefundVO
    }

    /// Get all refund records
    public func createListAllEntitiesRefund(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusRefundVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/refund/list/all"), body: body)
        return response as? PlusApiResultListPlusRefundVO
    }

    /// Check payment status
    public func checkPaymentStatus(body: PlusPaymentStatusQueryForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/status"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Refund payment
    public func refundPayment(body: PlusRefundForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/refund"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Get payment records by page
    public func createListByPagePayment(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPaymentVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPaymentVO
    }

    /// Get all payment records
    public func createListAllEntitiesPayment(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPaymentVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/list/all"), body: body)
        return response as? PlusApiResultListPlusPaymentVO
    }

    /// Cancel payment
    public func cancelPayment(body: PlusPaymentCancelForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/cancel"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Ship an order
    public func shipOrder(id: String, body: String? = nil) async throws -> PlusApiResultOrderShipVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/ship"), body: body)
        return response as? PlusApiResultOrderShipVO
    }

    /// Start service order
    public func startServiceOrder(id: String, body: OrderDispatchActionForm? = nil) async throws -> PlusApiResultServiceOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/dispatch/start"), body: body)
        return response as? PlusApiResultServiceOrderVO
    }

    /// Release service order
    public func releaseServiceOrder(id: String, body: OrderDispatchActionForm? = nil) async throws -> PlusApiResultServiceOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/dispatch/release"), body: body)
        return response as? PlusApiResultServiceOrderVO
    }

    /// Complete service order
    public func completeServiceOrder(id: String, body: OrderDispatchActionForm? = nil) async throws -> PlusApiResultServiceOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/dispatch/complete"), body: body)
        return response as? PlusApiResultServiceOrderVO
    }

    /// Claim service order
    public func claimServiceOrder(id: String, body: OrderDispatchActionForm? = nil) async throws -> PlusApiResultServiceOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/dispatch/claim"), body: body)
        return response as? PlusApiResultServiceOrderVO
    }

    /// Assign service order
    public func assignServiceOrder(id: String, body: OrderDispatchAssignForm) async throws -> PlusApiResultServiceOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/dispatch/assign"), body: body)
        return response as? PlusApiResultServiceOrderVO
    }

    /// Confirm an order
    public func confirmOrder(id: String) async throws -> PlusApiResultOrderConfirmVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/confirm"), body: nil)
        return response as? PlusApiResultOrderConfirmVO
    }

    /// Complete an order
    public func completeOrder(id: String) async throws -> PlusApiResultOrderCompleteVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/complete"), body: nil)
        return response as? PlusApiResultOrderCompleteVO
    }

    /// Close an order
    public func closeOrder(id: String) async throws -> PlusApiResultOrderCloseVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/close"), body: nil)
        return response as? PlusApiResultOrderCloseVO
    }

    /// Cancel an order
    public func cancelOrder(id: String) async throws -> PlusApiResultOrderCancelVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/cancel"), body: nil)
        return response as? PlusApiResultOrderCancelVO
    }

    /// List worker dispatch profiles by page
    public func createListByPageWorkerDispatchProfile(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOrderWorkerDispatchProfileVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOrderWorkerDispatchProfileVO
    }

    /// List all worker dispatch profiles
    public func createListAllEntitiesWorkerDispatchProfile(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOrderWorkerDispatchProfileVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/list/all"), body: body)
        return response as? PlusApiResultListPlusOrderWorkerDispatchProfileVO
    }

    /// Create virtual order
    public func createVirtualOrder(body: CreateVirtualOrderForm) async throws -> PlusApiResultVirtualOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/virtual"), body: body)
        return response as? PlusApiResultVirtualOrderVO
    }

    /// Create VIP order
    public func createVipOrder(body: CreateVipOrderForm) async throws -> PlusApiResultVipOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/vip"), body: body)
        return response as? PlusApiResultVipOrderVO
    }

    /// Create service order
    public func createServiceOrder(body: CreateServiceOrderForm) async throws -> PlusApiResultServiceOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/service"), body: body)
        return response as? PlusApiResultServiceOrderVO
    }

    /// Create points order
    public func createPointsOrder(body: CreatePointsOrderForm) async throws -> PlusApiResultPointsOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/points"), body: body)
        return response as? PlusApiResultPointsOrderVO
    }

    /// Get orders by page
    public func createListByPageOrder(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOrderVO
    }

    /// Get all orders
    public func createListAllEntitiesOrder(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/list/all"), body: body)
        return response as? PlusApiResultListPlusOrderVO
    }

    /// Get order items by page
    public func createListByPageItem2(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOrderItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/item/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOrderItemVO
    }

    /// Get all order items
    public func createListAllEntitiesItem2(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOrderItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/item/list/all"), body: body)
        return response as? PlusApiResultListPlusOrderItemVO
    }

    /// Create IM group order
    public func createImGroupOrder(body: CreateImGroupOrderForm) async throws -> PlusApiResultImGroupOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/im_group"), body: body)
        return response as? PlusApiResultImGroupOrderVO
    }

    /// Create goods order
    public func createGoodsOrder(body: CreateGoodsOrderForm) async throws -> PlusApiResultGoodsOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/goods"), body: body)
        return response as? PlusApiResultGoodsOrderVO
    }

    /// List dispatch rules by page
    public func createListByPageDispatchRule(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOrderDispatchRuleVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/dispatch-rule/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOrderDispatchRuleVO
    }

    /// List all dispatch rules
    public func createListAllEntitiesDispatchRule(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOrderDispatchRuleVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/dispatch-rule/list/all"), body: body)
        return response as? PlusApiResultListPlusOrderDispatchRuleVO
    }

    /// Create booking order
    public func createBookingOrder(body: CreateBookingOrderForm) async throws -> PlusApiResultBookingOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/booking"), body: body)
        return response as? PlusApiResultBookingOrderVO
    }

    /// Get shopping cart by ID
    public func getById(id: String) async throws -> PlusApiResultPlusShoppingCartVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/shopping/cart/\(id)"))
        return response as? PlusApiResultPlusShoppingCartVO
    }

    /// Delete shopping cart
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/shopping/cart/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a shopping cart item by ID
    public func getByIdItem(id: String) async throws -> PlusApiResultPlusShoppingCartItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/shopping/cart/item/\(id)"))
        return response as? PlusApiResultPlusShoppingCartItemVO
    }

    /// Delete a shopping cart item
    public func deleteItem(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/shopping/cart/item/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a refund record by ID
    public func getByIdRefund(id: String) async throws -> PlusApiResultPlusRefundVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/refund/\(id)"))
        return response as? PlusApiResultPlusRefundVO
    }

    /// Delete a refund record
    public func deleteRefund(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/refund/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a payment record by ID
    public func getByIdPayment(id: String) async throws -> PlusApiResultPlusPaymentVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/payment/\(id)"))
        return response as? PlusApiResultPlusPaymentVO
    }

    /// Delete a payment record
    public func deletePayment(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/payment/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get an order by ID
    public func getByIdOrder(id: String) async throws -> PlusApiResultPlusOrderVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/order/\(id)"))
        return response as? PlusApiResultPlusOrderVO
    }

    /// Delete an order
    public func deleteOrder(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/order/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get worker dispatch profile by id
    public func getByIdWorkerDispatchProfile(id: String) async throws -> PlusApiResultPlusOrderWorkerDispatchProfileVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/\(id)"))
        return response as? PlusApiResultPlusOrderWorkerDispatchProfileVO
    }

    /// Delete worker dispatch profile
    public func deleteWorkerDispatchProfile(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/order/worker-dispatch-profile/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get an order item by ID
    public func getByIdItem2(id: String) async throws -> PlusApiResultPlusOrderItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/order/item/\(id)"))
        return response as? PlusApiResultPlusOrderItemVO
    }

    /// Delete an order item
    public func deleteItem2(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/order/item/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get dispatch rule by id
    public func getByIdDispatchRule(id: String) async throws -> PlusApiResultPlusOrderDispatchRuleVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/order/dispatch-rule/\(id)"))
        return response as? PlusApiResultPlusOrderDispatchRuleVO
    }

    /// Delete dispatch rule
    public func deleteDispatchRule(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/order/dispatch-rule/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
