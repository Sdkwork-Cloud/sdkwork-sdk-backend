import Foundation

public class DepartmentApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing department
    public func update(body: PlusDepartmentForm) async throws -> PlusApiResultPlusDepartmentVO? {
        let response = try await client.put(ApiPaths.backendPath("/department"), body: body)
        return response as? PlusApiResultPlusDepartmentVO
    }

    /// Create a new department
    public func create(body: PlusDepartmentForm) async throws -> PlusApiResultPlusDepartmentVO? {
        let response = try await client.post(ApiPaths.backendPath("/department"), body: body)
        return response as? PlusApiResultPlusDepartmentVO
    }

    /// Get departments by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusDepartmentVO? {
        let response = try await client.post(ApiPaths.backendPath("/department/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusDepartmentVO
    }

    /// Get all departments
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusDepartmentVO? {
        let response = try await client.post(ApiPaths.backendPath("/department/list/all"), body: body)
        return response as? PlusApiResultListPlusDepartmentVO
    }

    /// Get a department by ID
    public func getById(id: String) async throws -> PlusApiResultPlusDepartmentVO? {
        let response = try await client.get(ApiPaths.backendPath("/department/\(id)"))
        return response as? PlusApiResultPlusDepartmentVO
    }

    /// Delete a department
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/department/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
