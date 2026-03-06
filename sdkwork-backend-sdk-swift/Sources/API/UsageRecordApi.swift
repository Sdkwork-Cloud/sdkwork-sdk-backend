import Foundation

public class UsageRecordApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing usage record
    public func update(body: UsageRecordForm) async throws -> PlusApiResultUsageRecordVO? {
        let response = try await client.put(ApiPaths.backendPath("/usage/record"), body: body)
        return response as? PlusApiResultUsageRecordVO
    }

    /// Create a new usage record
    public func create(body: UsageRecordForm) async throws -> PlusApiResultUsageRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/usage/record"), body: body)
        return response as? PlusApiResultUsageRecordVO
    }

    /// Get usage records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPageUsageRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/usage/record/list"), body: body, params: params)
        return response as? PlusApiResultPageUsageRecordVO
    }

    /// Get all usage records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListUsageRecordVO? {
        let response = try await client.post(ApiPaths.backendPath("/usage/record/list/all"), body: body)
        return response as? PlusApiResultListUsageRecordVO
    }

    /// Get a usage record by ID
    public func getById(id: String) async throws -> PlusApiResultUsageRecordVO? {
        let response = try await client.get(ApiPaths.backendPath("/usage/record/\(id)"))
        return response as? PlusApiResultUsageRecordVO
    }

    /// Delete a usage record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/usage/record/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
