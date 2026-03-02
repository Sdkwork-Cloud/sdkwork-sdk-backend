import Foundation

public class VipPackageGroupApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP package group
    public func update(body: PlusVipPackGroupForm) async throws -> PlusApiResultPlusVipPackGroupVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/pack_group"), body: body)
        return response as? PlusApiResultPlusVipPackGroupVO
    }

    /// Create a new VIP package group
    public func create(body: PlusVipPackGroupForm) async throws -> PlusApiResultPlusVipPackGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack_group"), body: body)
        return response as? PlusApiResultPlusVipPackGroupVO
    }

    /// List public
    public func listPublic(body: PlusVipPackGroupQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipPackGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack_group/list_public"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipPackGroupVO
    }

    /// Get VIP package groups by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipPackGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack_group/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipPackGroupVO
    }

    /// Get all VIP package groups
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipPackGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack_group/list/all"), body: body)
        return response as? PlusApiResultListPlusVipPackGroupVO
    }

    /// Get a VIP package group by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipPackGroupVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/pack_group/\(id)"))
        return response as? PlusApiResultPlusVipPackGroupVO
    }

    /// Delete a VIP package group
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/pack_group/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
