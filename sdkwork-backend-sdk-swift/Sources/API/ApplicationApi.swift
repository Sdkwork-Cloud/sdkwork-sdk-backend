import Foundation

public class ApplicationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update application
    public func update(body: PlusAppForm) async throws -> PlusApiResultPlusAppVO? {
        let response = try await client.put(ApiPaths.backendPath("/app"), body: body)
        return response as? PlusApiResultPlusAppVO
    }

    /// Create application
    public func create(body: PlusAppForm) async throws -> PlusApiResultPlusAppVO? {
        let response = try await client.post(ApiPaths.backendPath("/app"), body: body)
        return response as? PlusApiResultPlusAppVO
    }

    /// Get applications by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAppVO? {
        let response = try await client.post(ApiPaths.backendPath("/app/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAppVO
    }

    /// Get all applications
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAppVO? {
        let response = try await client.post(ApiPaths.backendPath("/app/list/all"), body: body)
        return response as? PlusApiResultListPlusAppVO
    }

    /// Get application by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAppVO? {
        let response = try await client.get(ApiPaths.backendPath("/app/\(id)"))
        return response as? PlusApiResultPlusAppVO
    }

    /// Delete application
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/app/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
