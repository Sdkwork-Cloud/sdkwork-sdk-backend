import Foundation

public class VipLevelApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP level
    public func update(body: PlusVipLevelForm) async throws -> PlusApiResultPlusVipLevelVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/level"), body: body)
        return response as? PlusApiResultPlusVipLevelVO
    }

    /// Create a new VIP level
    public func create(body: PlusVipLevelForm) async throws -> PlusApiResultPlusVipLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level"), body: body)
        return response as? PlusApiResultPlusVipLevelVO
    }

    /// Get VIP levels by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipLevelVO
    }

    /// Get all VIP levels
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/list/all"), body: body)
        return response as? PlusApiResultListPlusVipLevelVO
    }

    /// Get a VIP level by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipLevelVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/level/\(id)"))
        return response as? PlusApiResultPlusVipLevelVO
    }

    /// Delete a VIP level
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/level/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
