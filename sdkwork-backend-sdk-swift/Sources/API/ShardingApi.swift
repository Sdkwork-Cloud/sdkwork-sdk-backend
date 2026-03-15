import Foundation

public class ShardingApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update Sharding Key
    public func update(body: PlusShardingKeyForm) async throws -> PlusApiResultPlusShardingKeyVO? {
        let response = try await client.put(ApiPaths.backendPath("/sharding/key"), body: body)
        return response as? PlusApiResultPlusShardingKeyVO
    }

    /// Create Sharding Key
    public func create(body: PlusShardingKeyForm) async throws -> PlusApiResultPlusShardingKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/sharding/key"), body: body)
        return response as? PlusApiResultPlusShardingKeyVO
    }

    /// List Sharding Keys by Page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusShardingKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/sharding/key/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusShardingKeyVO
    }

    /// List All Sharding Keys
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusShardingKeyVO? {
        let response = try await client.post(ApiPaths.backendPath("/sharding/key/list/all"), body: body)
        return response as? PlusApiResultListPlusShardingKeyVO
    }

    /// Get Sharding Key by ID
    public func getById(id: String) async throws -> PlusApiResultPlusShardingKeyVO? {
        let response = try await client.get(ApiPaths.backendPath("/sharding/key/\(id)"))
        return response as? PlusApiResultPlusShardingKeyVO
    }

    /// Delete Sharding Key
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/sharding/key/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
