import Foundation

public class VipBenefitApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP benefit
    public func update(body: PlusVipBenefitForm) async throws -> PlusApiResultPlusVipBenefitVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/benefit"), body: body)
        return response as? PlusApiResultPlusVipBenefitVO
    }

    /// Create a new VIP benefit
    public func create(body: PlusVipBenefitForm) async throws -> PlusApiResultPlusVipBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit"), body: body)
        return response as? PlusApiResultPlusVipBenefitVO
    }

    /// Get VIP benefits by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipBenefitVO
    }

    /// Get all VIP benefits
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/list/all"), body: body)
        return response as? PlusApiResultListPlusVipBenefitVO
    }

    /// Get a VIP benefit by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipBenefitVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/benefit/\(id)"))
        return response as? PlusApiResultPlusVipBenefitVO
    }

    /// Delete a VIP benefit
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/benefit/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
