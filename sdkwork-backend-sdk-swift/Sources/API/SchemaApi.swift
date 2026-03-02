import Foundation

public class SchemaApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing database schema
    public func update(body: PlusSchemaForm) async throws -> PlusApiResultPlusSchemaVO? {
        let response = try await client.put(ApiPaths.backendPath("/schema"), body: body)
        return response as? PlusApiResultPlusSchemaVO
    }

    /// Create a new database schema
    public func create(body: PlusSchemaForm) async throws -> PlusApiResultPlusSchemaVO? {
        let response = try await client.post(ApiPaths.backendPath("/schema"), body: body)
        return response as? PlusApiResultPlusSchemaVO
    }

    /// Get database schemas by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusSchemaVO? {
        let response = try await client.post(ApiPaths.backendPath("/schema/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusSchemaVO
    }

    /// Get all database schemas
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusSchemaVO? {
        let response = try await client.post(ApiPaths.backendPath("/schema/list/all"), body: body)
        return response as? PlusApiResultListPlusSchemaVO
    }

    /// Get a database schema by ID
    public func getById(id: String) async throws -> PlusApiResultPlusSchemaVO? {
        let response = try await client.get(ApiPaths.backendPath("/schema/\(id)"))
        return response as? PlusApiResultPlusSchemaVO
    }

    /// Delete a database schema
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/schema/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
