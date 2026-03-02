import Foundation

public class VipPackageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update VIP Package
    public func update(body: PlusVipPackForm) async throws -> PlusApiResultPlusVipPackVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/pack"), body: body)
        return response as? PlusApiResultPlusVipPackVO
    }

    /// Create VIP Package
    public func create(body: PlusVipPackForm) async throws -> PlusApiResultPlusVipPackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack"), body: body)
        return response as? PlusApiResultPlusVipPackVO
    }

    /// Get VIP Packages by Page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipPackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipPackVO
    }

    /// Get All VIP Packages
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipPackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack/list/all"), body: body)
        return response as? PlusApiResultListPlusVipPackVO
    }

    /// Get VIP Package by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipPackVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/pack/\(id)"))
        return response as? PlusApiResultPlusVipPackVO
    }

    /// Delete VIP Package
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/pack/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
