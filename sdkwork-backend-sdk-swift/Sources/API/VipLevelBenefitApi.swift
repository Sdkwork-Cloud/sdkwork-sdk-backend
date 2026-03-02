import Foundation

public class VipLevelBenefitApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP level benefit
    public func update(body: PlusVipLevelBenefitForm) async throws -> PlusApiResultPlusVipLevelBenefitVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/level/benefit"), body: body)
        return response as? PlusApiResultPlusVipLevelBenefitVO
    }

    /// Create a new VIP level benefit
    public func create(body: PlusVipLevelBenefitForm) async throws -> PlusApiResultPlusVipLevelBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/benefit"), body: body)
        return response as? PlusApiResultPlusVipLevelBenefitVO
    }

    /// Get VIP level benefits by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipLevelBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/benefit/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipLevelBenefitVO
    }

    /// Get all VIP level benefits
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipLevelBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/benefit/list/all"), body: body)
        return response as? PlusApiResultListPlusVipLevelBenefitVO
    }

    /// Get a VIP level benefit by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipLevelBenefitVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/level/benefit/\(id)"))
        return response as? PlusApiResultPlusVipLevelBenefitVO
    }

    /// Delete a VIP level benefit
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/level/benefit/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
