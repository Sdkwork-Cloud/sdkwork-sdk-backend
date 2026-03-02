import Foundation

public class VipBenefitUsageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP benefit usage record
    public func update(body: PlusVipBenefitUsageForm) async throws -> PlusApiResultPlusVipBenefitUsageVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/benefit/usage"), body: body)
        return response as? PlusApiResultPlusVipBenefitUsageVO
    }

    /// Create a new VIP benefit usage record
    public func create(body: PlusVipBenefitUsageForm) async throws -> PlusApiResultPlusVipBenefitUsageVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/usage"), body: body)
        return response as? PlusApiResultPlusVipBenefitUsageVO
    }

    /// Get VIP benefit usage records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipBenefitUsageVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/usage/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipBenefitUsageVO
    }

    /// Get all VIP benefit usage records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipBenefitUsageVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/usage/list/all"), body: body)
        return response as? PlusApiResultListPlusVipBenefitUsageVO
    }

    /// Get a VIP benefit usage record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipBenefitUsageVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/benefit/usage/\(id)"))
        return response as? PlusApiResultPlusVipBenefitUsageVO
    }

    /// Delete a VIP benefit usage record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/benefit/usage/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
