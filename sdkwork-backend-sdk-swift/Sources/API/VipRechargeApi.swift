import Foundation

public class VipRechargeApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP recharge record
    public func update(body: PlusVipRechargeForm) async throws -> PlusApiResultPlusVipRechargeVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/recharge"), body: body)
        return response as? PlusApiResultPlusVipRechargeVO
    }

    /// Create a new VIP recharge record
    public func create(body: PlusVipRechargeForm) async throws -> PlusApiResultPlusVipRechargeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge"), body: body)
        return response as? PlusApiResultPlusVipRechargeVO
    }

    /// Get VIP recharge records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipRechargeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipRechargeVO
    }

    /// Get all VIP recharge records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipRechargeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/list/all"), body: body)
        return response as? PlusApiResultListPlusVipRechargeVO
    }

    /// Get a VIP recharge record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipRechargeVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/recharge/\(id)"))
        return response as? PlusApiResultPlusVipRechargeVO
    }

    /// Delete a VIP recharge record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/recharge/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
