import Foundation

public class PaymentApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing payment record
    public func update(body: PlusPaymentForm) async throws -> PlusApiResultPlusPaymentVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/payment"), body: body)
        return response as? PlusApiResultPlusPaymentVO
    }

    /// Create a new payment record
    public func create(body: PlusPaymentForm) async throws -> PlusApiResultPlusPaymentVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment"), body: body)
        return response as? PlusApiResultPlusPaymentVO
    }

    /// Check payment status
    public func checkPaymentStatus(body: PlusPaymentStatusQueryForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/status"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Refund payment
    public func refund(body: PlusRefundForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/refund"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Get payment records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPaymentVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPaymentVO
    }

    /// Get all payment records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPaymentVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/list/all"), body: body)
        return response as? PlusApiResultListPlusPaymentVO
    }

    /// Cancel payment
    public func cancel(body: PlusPaymentCancelForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/trade/payment/cancel"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Get a payment record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusPaymentVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/payment/\(id)"))
        return response as? PlusApiResultPlusPaymentVO
    }

    /// Delete a payment record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/payment/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
