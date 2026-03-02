import Foundation

public class UserApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing user
    public func update(body: PlusUserForm) async throws -> PlusApiResultPlusUserVO? {
        let response = try await client.put(ApiPaths.backendPath("/user"), body: body)
        return response as? PlusApiResultPlusUserVO
    }

    /// Create a new user
    public func create(body: PlusUserForm) async throws -> PlusApiResultPlusUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/user"), body: body)
        return response as? PlusApiResultPlusUserVO
    }

    /// Get users by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserVO
    }

    /// Get all users
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/list/all"), body: body)
        return response as? PlusApiResultListPlusUserVO
    }

    /// Get a user by ID
    public func getById(id: String) async throws -> PlusApiResultPlusUserVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/\(id)"))
        return response as? PlusApiResultPlusUserVO
    }

    /// Delete a user
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get current user profile
    public func getProfile() async throws -> PlusApiResultPlusUserProfileVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/profile"))
        return response as? PlusApiResultPlusUserProfileVO
    }
}
