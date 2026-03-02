import Foundation

public class WorkspaceApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing workspace
    public func update(body: PlusWorkspaceForm) async throws -> PlusApiResultPlusWorkspaceVO? {
        let response = try await client.put(ApiPaths.backendPath("/workspace"), body: body)
        return response as? PlusApiResultPlusWorkspaceVO
    }

    /// Create a new workspace
    public func create(body: PlusWorkspaceForm) async throws -> PlusApiResultPlusWorkspaceVO? {
        let response = try await client.post(ApiPaths.backendPath("/workspace"), body: body)
        return response as? PlusApiResultPlusWorkspaceVO
    }

    /// Get workspaces by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusWorkspaceVO? {
        let response = try await client.post(ApiPaths.backendPath("/workspace/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusWorkspaceVO
    }

    /// Get all workspaces
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusWorkspaceVO? {
        let response = try await client.post(ApiPaths.backendPath("/workspace/list/all"), body: body)
        return response as? PlusApiResultListPlusWorkspaceVO
    }

    /// Get a workspace by ID
    public func getById(id: String) async throws -> PlusApiResultPlusWorkspaceVO? {
        let response = try await client.get(ApiPaths.backendPath("/workspace/\(id)"))
        return response as? PlusApiResultPlusWorkspaceVO
    }

    /// Delete a workspace
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/workspace/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
