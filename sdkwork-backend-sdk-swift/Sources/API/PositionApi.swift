import Foundation

public class PositionApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing position
    public func update(body: PlusPositionForm) async throws -> PlusApiResultPlusPositionVO? {
        let response = try await client.put(ApiPaths.backendPath("/organization/position"), body: body)
        return response as? PlusApiResultPlusPositionVO
    }

    /// Create a new position
    public func create(body: PlusPositionForm) async throws -> PlusApiResultPlusPositionVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/position"), body: body)
        return response as? PlusApiResultPlusPositionVO
    }

    /// Get positions by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPositionVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/position/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPositionVO
    }

    /// Get all positions
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPositionVO? {
        let response = try await client.post(ApiPaths.backendPath("/organization/position/list/all"), body: body)
        return response as? PlusApiResultListPlusPositionVO
    }

    /// Get a position by ID
    public func getById(id: String) async throws -> PlusApiResultPlusPositionVO? {
        let response = try await client.get(ApiPaths.backendPath("/organization/position/\(id)"))
        return response as? PlusApiResultPlusPositionVO
    }

    /// Delete a position
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/organization/position/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
