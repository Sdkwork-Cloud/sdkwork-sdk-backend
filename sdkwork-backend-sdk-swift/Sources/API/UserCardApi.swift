import Foundation

public class UserCardApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update user-card binding
    public func update(body: PlusUserCardForm) async throws -> PlusApiResultPlusUserCardVO? {
        let response = try await client.put(ApiPaths.backendPath("/user/card"), body: body)
        return response as? PlusApiResultPlusUserCardVO
    }

    /// Create user-card binding
    public func create(body: PlusUserCardForm) async throws -> PlusApiResultPlusUserCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/card"), body: body)
        return response as? PlusApiResultPlusUserCardVO
    }

    /// Get user-card bindings by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/card/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserCardVO
    }

    /// Get all user-card bindings
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/card/list/all"), body: body)
        return response as? PlusApiResultListPlusUserCardVO
    }

    /// Get user-card binding by ID
    public func getById(id: String) async throws -> PlusApiResultPlusUserCardVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/card/\(id)"))
        return response as? PlusApiResultPlusUserCardVO
    }

    /// Delete user-card binding
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/card/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
