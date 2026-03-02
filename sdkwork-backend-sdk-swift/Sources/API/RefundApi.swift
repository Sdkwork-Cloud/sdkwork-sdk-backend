import Foundation

public class RefundApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing refund record
    public func update(body: PlusRefundForm) async throws -> PlusApiResultPlusRefundVO? {
        let response = try await client.put(ApiPaths.backendPath("/trade/refund"), body: body)
        return response as? PlusApiResultPlusRefundVO
    }

    /// Create a new refund record
    public func create(body: PlusRefundForm) async throws -> PlusApiResultPlusRefundVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/refund"), body: body)
        return response as? PlusApiResultPlusRefundVO
    }

    /// Get refund records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusRefundVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/refund/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusRefundVO
    }

    /// Get all refund records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusRefundVO? {
        let response = try await client.post(ApiPaths.backendPath("/trade/refund/list/all"), body: body)
        return response as? PlusApiResultListPlusRefundVO
    }

    /// Get a refund record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusRefundVO? {
        let response = try await client.get(ApiPaths.backendPath("/trade/refund/\(id)"))
        return response as? PlusApiResultPlusRefundVO
    }

    /// Delete a refund record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/trade/refund/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
