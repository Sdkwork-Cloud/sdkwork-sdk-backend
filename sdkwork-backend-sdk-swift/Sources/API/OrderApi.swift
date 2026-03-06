import Foundation

public class OrderApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing order
    public func update(body: PlusOrderForm) async throws -> PlusApiResultPlusOrderVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/order"), body: body)
        return response as? PlusApiResultPlusOrderVO
    }

    /// Create a new order
    public func create(body: PlusOrderForm) async throws -> PlusApiResultPlusOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order"), body: body)
        return response as? PlusApiResultPlusOrderVO
    }

    /// Ship an order
    public func ship(id: String, body: String? = nil) async throws -> PlusApiResultOrderShipVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/ship"), body: body)
        return response as? PlusApiResultOrderShipVO
    }

    /// Confirm an order
    public func confirm(id: String) async throws -> PlusApiResultOrderConfirmVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/confirm"), body: nil)
        return response as? PlusApiResultOrderConfirmVO
    }

    /// Complete an order
    public func complete(id: String) async throws -> PlusApiResultOrderCompleteVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/complete"), body: nil)
        return response as? PlusApiResultOrderCompleteVO
    }

    /// Close an order
    public func close(id: String) async throws -> PlusApiResultOrderCloseVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/close"), body: nil)
        return response as? PlusApiResultOrderCloseVO
    }

    /// Cancel an order
    public func cancel(id: String) async throws -> PlusApiResultOrderCancelVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/\(id)/cancel"), body: nil)
        return response as? PlusApiResultOrderCancelVO
    }

    /// Create virtual order
    public func createVirtual(body: CreateVirtualOrderForm) async throws -> PlusApiResultVirtualOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/virtual"), body: body)
        return response as? PlusApiResultVirtualOrderVO
    }

    /// Create VIP order
    public func createVip(body: CreateVipOrderForm) async throws -> PlusApiResultVipOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/vip"), body: body)
        return response as? PlusApiResultVipOrderVO
    }

    /// Create points order
    public func createPoints(body: CreatePointsOrderForm) async throws -> PlusApiResultPointsOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/points"), body: body)
        return response as? PlusApiResultPointsOrderVO
    }

    /// Get orders by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOrderVO
    }

    /// Get all orders
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/list/all"), body: body)
        return response as? PlusApiResultListPlusOrderVO
    }

    /// Create IM group order
    public func createImGroup(body: CreateImGroupOrderForm) async throws -> PlusApiResultImGroupOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/im_group"), body: body)
        return response as? PlusApiResultImGroupOrderVO
    }

    /// Create goods order
    public func createGoods(body: CreateGoodsOrderForm) async throws -> PlusApiResultGoodsOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/goods"), body: body)
        return response as? PlusApiResultGoodsOrderVO
    }

    /// Create booking order
    public func createBooking(body: CreateBookingOrderForm) async throws -> PlusApiResultBookingOrderVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/order/booking"), body: body)
        return response as? PlusApiResultBookingOrderVO
    }

    /// Get an order by ID
    public func getById(id: String) async throws -> PlusApiResultPlusOrderVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/order/\(id)"))
        return response as? PlusApiResultPlusOrderVO
    }

    /// Delete an order
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/order/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
