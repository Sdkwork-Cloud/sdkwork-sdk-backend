import Foundation

public class ColumnApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update column
    public func update(body: PlusColumnForm) async throws -> PlusApiResultPlusColumnVO? {
        let response = try await client.put(ApiPaths.backendPath("/column"), body: body)
        return response as? PlusApiResultPlusColumnVO
    }

    /// Create column
    public func create(body: PlusColumnForm) async throws -> PlusApiResultPlusColumnVO? {
        let response = try await client.post(ApiPaths.backendPath("/column"), body: body)
        return response as? PlusApiResultPlusColumnVO
    }

    /// Get columns by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusColumnVO? {
        let response = try await client.post(ApiPaths.backendPath("/column/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusColumnVO
    }

    /// Get all columns
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusColumnVO? {
        let response = try await client.post(ApiPaths.backendPath("/column/list/all"), body: body)
        return response as? PlusApiResultListPlusColumnVO
    }

    /// Get column by ID
    public func getById(id: String) async throws -> PlusApiResultPlusColumnVO? {
        let response = try await client.get(ApiPaths.backendPath("/column/\(id)"))
        return response as? PlusApiResultPlusColumnVO
    }

    /// Delete column
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/column/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
