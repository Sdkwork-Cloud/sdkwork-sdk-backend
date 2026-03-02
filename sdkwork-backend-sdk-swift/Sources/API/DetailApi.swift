import Foundation

public class DetailApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update existing detail content
    public func update(body: PlusDetailForm) async throws -> PlusApiResultPlusDetailVO? {
        let response = try await client.put(ApiPaths.backendPath("/detail"), body: body)
        return response as? PlusApiResultPlusDetailVO
    }

    /// Create new detail content
    public func create(body: PlusDetailForm) async throws -> PlusApiResultPlusDetailVO? {
        let response = try await client.post(ApiPaths.backendPath("/detail"), body: body)
        return response as? PlusApiResultPlusDetailVO
    }

    /// Get detail contents by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusDetailVO? {
        let response = try await client.post(ApiPaths.backendPath("/detail/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusDetailVO
    }

    /// Get all detail contents
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusDetailVO? {
        let response = try await client.post(ApiPaths.backendPath("/detail/list/all"), body: body)
        return response as? PlusApiResultListPlusDetailVO
    }

    /// Get detail content by ID
    public func getById(id: String) async throws -> PlusApiResultPlusDetailVO? {
        let response = try await client.get(ApiPaths.backendPath("/detail/\(id)"))
        return response as? PlusApiResultPlusDetailVO
    }

    /// Delete detail content
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/detail/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
