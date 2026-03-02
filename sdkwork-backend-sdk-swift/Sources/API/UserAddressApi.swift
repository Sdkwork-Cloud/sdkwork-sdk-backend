import Foundation

public class UserAddressApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing user address
    public func update(body: PlusUserAddressForm) async throws -> PlusApiResultPlusUserAddressVO? {
        let response = try await client.put(ApiPaths.backendPath("/user/address"), body: body)
        return response as? PlusApiResultPlusUserAddressVO
    }

    /// Create a new user address
    public func create(body: PlusUserAddressForm) async throws -> PlusApiResultPlusUserAddressVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/address"), body: body)
        return response as? PlusApiResultPlusUserAddressVO
    }

    /// Get addresses by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusUserAddressVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/address/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusUserAddressVO
    }

    /// Get all user addresses
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusUserAddressVO? {
        let response = try await client.post(ApiPaths.backendPath("/user/address/list/all"), body: body)
        return response as? PlusApiResultListPlusUserAddressVO
    }

    /// Get address by ID
    public func getById(id: String) async throws -> PlusApiResultPlusUserAddressVO? {
        let response = try await client.get(ApiPaths.backendPath("/user/address/\(id)"))
        return response as? PlusApiResultPlusUserAddressVO
    }

    /// Delete a user address
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/user/address/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
