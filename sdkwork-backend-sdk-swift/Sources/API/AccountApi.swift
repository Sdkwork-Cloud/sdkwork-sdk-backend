import Foundation

public class AccountApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing account
    public func update(body: PlusAccountForm) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.put(ApiPaths.backendPath("/account"), body: body)
        return response as? PlusApiResultPlusAccountVO
    }

    /// Create a new account
    public func create(body: PlusAccountForm) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account"), body: body)
        return response as? PlusApiResultPlusAccountVO
    }

    /// Get accounts by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAccountVO
    }

    /// Get all accounts
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/list/all"), body: body)
        return response as? PlusApiResultListPlusAccountVO
    }

    /// Get points account
    public func getPoints(body: PlusGetAccountForm) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/get_points"), body: body)
        return response as? PlusApiResultPlusAccountVO
    }

    /// Get cash account
    public func getCash(body: PlusGetAccountForm) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/account/get_cash"), body: body)
        return response as? PlusApiResultPlusAccountVO
    }

    /// Get an account by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAccountVO? {
        let response = try await client.get(ApiPaths.backendPath("/account/\(id)"))
        return response as? PlusApiResultPlusAccountVO
    }

    /// Delete an account
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/account/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
