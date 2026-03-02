import Foundation

public class DatabaseTableApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing database table
    public func update(body: PlusTableForm) async throws -> PlusApiResultPlusTableVO? {
        let response = try await client.put(ApiPaths.backendPath("/table"), body: body)
        return response as? PlusApiResultPlusTableVO
    }

    /// Create a new database table
    public func create(body: PlusTableForm) async throws -> PlusApiResultPlusTableVO? {
        let response = try await client.post(ApiPaths.backendPath("/table"), body: body)
        return response as? PlusApiResultPlusTableVO
    }

    /// Get database tables by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusTableVO? {
        let response = try await client.post(ApiPaths.backendPath("/table/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusTableVO
    }

    /// Get all database tables
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusTableVO? {
        let response = try await client.post(ApiPaths.backendPath("/table/list/all"), body: body)
        return response as? PlusApiResultListPlusTableVO
    }

    /// Get a database table by ID
    public func getById(id: String) async throws -> PlusApiResultPlusTableVO? {
        let response = try await client.get(ApiPaths.backendPath("/table/\(id)"))
        return response as? PlusApiResultPlusTableVO
    }

    /// Delete a database table
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/table/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
