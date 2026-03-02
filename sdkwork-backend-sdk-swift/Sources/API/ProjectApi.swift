import Foundation

public class ProjectApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing project
    public func update(body: PlusProjectForm) async throws -> PlusApiResultPlusProjectVO? {
        let response = try await client.put(ApiPaths.backendPath("/project"), body: body)
        return response as? PlusApiResultPlusProjectVO
    }

    /// Create a new project
    public func create(body: PlusProjectForm) async throws -> PlusApiResultPlusProjectVO? {
        let response = try await client.post(ApiPaths.backendPath("/project"), body: body)
        return response as? PlusApiResultPlusProjectVO
    }

    /// Get projects by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusProjectVO? {
        let response = try await client.post(ApiPaths.backendPath("/project/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusProjectVO
    }

    /// Get all projects
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusProjectVO? {
        let response = try await client.post(ApiPaths.backendPath("/project/list/all"), body: body)
        return response as? PlusApiResultListPlusProjectVO
    }

    /// Get a project by ID
    public func getById(id: String) async throws -> PlusApiResultPlusProjectVO? {
        let response = try await client.get(ApiPaths.backendPath("/project/\(id)"))
        return response as? PlusApiResultPlusProjectVO
    }

    /// Delete a project
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/project/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
