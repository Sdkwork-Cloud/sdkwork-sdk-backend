import Foundation

public class VipRechargePackageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP recharge package
    public func update(body: PlusVipRechargePackForm) async throws -> PlusApiResultPlusVipRechargePackVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/recharge/pack"), body: body)
        return response as? PlusApiResultPlusVipRechargePackVO
    }

    /// Create a new VIP recharge package
    public func create(body: PlusVipRechargePackForm) async throws -> PlusApiResultPlusVipRechargePackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/pack"), body: body)
        return response as? PlusApiResultPlusVipRechargePackVO
    }

    /// Get VIP recharge packages by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipRechargePackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/pack/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipRechargePackVO
    }

    /// Get all VIP recharge packages
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipRechargePackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/pack/list/all"), body: body)
        return response as? PlusApiResultListPlusVipRechargePackVO
    }

    /// Get a VIP recharge package by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipRechargePackVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/recharge/pack/\(id)"))
        return response as? PlusApiResultPlusVipRechargePackVO
    }

    /// Delete a VIP recharge package
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/recharge/pack/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
