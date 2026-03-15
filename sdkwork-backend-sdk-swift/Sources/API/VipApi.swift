import Foundation

public class VipApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing VIP user
    public func update(body: PlusVipUserForm) async throws -> PlusApiResultPlusVipUserVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/user"), body: body)
        return response as? PlusApiResultPlusVipUserVO
    }

    /// Create a new VIP user
    public func create(body: PlusVipUserForm) async throws -> PlusApiResultPlusVipUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/user"), body: body)
        return response as? PlusApiResultPlusVipUserVO
    }

    /// Update an existing VIP recharge record
    public func updateRecharge(body: PlusVipRechargeForm) async throws -> PlusApiResultPlusVipRechargeVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/recharge"), body: body)
        return response as? PlusApiResultPlusVipRechargeVO
    }

    /// Create a new VIP recharge record
    public func createRecharge(body: PlusVipRechargeForm) async throws -> PlusApiResultPlusVipRechargeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge"), body: body)
        return response as? PlusApiResultPlusVipRechargeVO
    }

    /// Update an existing VIP recharge package
    public func updatePack(body: PlusVipRechargePackForm) async throws -> PlusApiResultPlusVipRechargePackVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/recharge/pack"), body: body)
        return response as? PlusApiResultPlusVipRechargePackVO
    }

    /// Create a new VIP recharge package
    public func createPack(body: PlusVipRechargePackForm) async throws -> PlusApiResultPlusVipRechargePackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/pack"), body: body)
        return response as? PlusApiResultPlusVipRechargePackVO
    }

    /// Update an existing VIP point change record
    public func updateChange(body: PlusVipPointChangeForm) async throws -> PlusApiResultPlusVipPointChangeVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/point/change"), body: body)
        return response as? PlusApiResultPlusVipPointChangeVO
    }

    /// Create a new VIP point change record
    public func createChange(body: PlusVipPointChangeForm) async throws -> PlusApiResultPlusVipPointChangeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/point/change"), body: body)
        return response as? PlusApiResultPlusVipPointChangeVO
    }

    /// Update an existing VIP package group
    public func updatePackGroup(body: PlusVipPackGroupForm) async throws -> PlusApiResultPlusVipPackGroupVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/pack_group"), body: body)
        return response as? PlusApiResultPlusVipPackGroupVO
    }

    /// Create a new VIP package group
    public func createPackGroup(body: PlusVipPackGroupForm) async throws -> PlusApiResultPlusVipPackGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack_group"), body: body)
        return response as? PlusApiResultPlusVipPackGroupVO
    }

    /// Update VIP Package
    public func updatePack2(body: PlusVipPackForm) async throws -> PlusApiResultPlusVipPackVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/pack"), body: body)
        return response as? PlusApiResultPlusVipPackVO
    }

    /// Create VIP Package
    public func createPack2(body: PlusVipPackForm) async throws -> PlusApiResultPlusVipPackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack"), body: body)
        return response as? PlusApiResultPlusVipPackVO
    }

    /// Update an existing VIP level
    public func updateLevel(body: PlusVipLevelForm) async throws -> PlusApiResultPlusVipLevelVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/level"), body: body)
        return response as? PlusApiResultPlusVipLevelVO
    }

    /// Create a new VIP level
    public func createLevel(body: PlusVipLevelForm) async throws -> PlusApiResultPlusVipLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level"), body: body)
        return response as? PlusApiResultPlusVipLevelVO
    }

    /// Update an existing VIP level benefit
    public func updateBenefit(body: PlusVipLevelBenefitForm) async throws -> PlusApiResultPlusVipLevelBenefitVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/level/benefit"), body: body)
        return response as? PlusApiResultPlusVipLevelBenefitVO
    }

    /// Create a new VIP level benefit
    public func createBenefit(body: PlusVipLevelBenefitForm) async throws -> PlusApiResultPlusVipLevelBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/benefit"), body: body)
        return response as? PlusApiResultPlusVipLevelBenefitVO
    }

    /// Update an existing VIP benefit
    public func updateBenefit2(body: PlusVipBenefitForm) async throws -> PlusApiResultPlusVipBenefitVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/benefit"), body: body)
        return response as? PlusApiResultPlusVipBenefitVO
    }

    /// Create a new VIP benefit
    public func createBenefit2(body: PlusVipBenefitForm) async throws -> PlusApiResultPlusVipBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit"), body: body)
        return response as? PlusApiResultPlusVipBenefitVO
    }

    /// Update an existing VIP benefit usage record
    public func updateUsage(body: PlusVipBenefitUsageForm) async throws -> PlusApiResultPlusVipBenefitUsageVO? {
        let response = try await client.put(ApiPaths.backendPath("/vip/benefit/usage"), body: body)
        return response as? PlusApiResultPlusVipBenefitUsageVO
    }

    /// Create a new VIP benefit usage record
    public func createUsage(body: PlusVipBenefitUsageForm) async throws -> PlusApiResultPlusVipBenefitUsageVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/usage"), body: body)
        return response as? PlusApiResultPlusVipBenefitUsageVO
    }

    /// Get VIP users by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/user/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipUserVO
    }

    /// Get all VIP users
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/user/list/all"), body: body)
        return response as? PlusApiResultListPlusVipUserVO
    }

    /// Get a VIP user by ID
    public func getCurrentUser() async throws -> PlusApiResultPlusVipUserVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/user/get_current_user"), body: nil)
        return response as? PlusApiResultPlusVipUserVO
    }

    /// Get VIP recharge packages by page
    public func createListByPagePack(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipRechargePackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/pack/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipRechargePackVO
    }

    /// Get all VIP recharge packages
    public func createListAllEntitiesPack(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipRechargePackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/pack/list/all"), body: body)
        return response as? PlusApiResultListPlusVipRechargePackVO
    }

    /// Get VIP recharge records by page
    public func createListByPageRecharge(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipRechargeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipRechargeVO
    }

    /// Get all VIP recharge records
    public func createListAllEntitiesRecharge(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipRechargeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/recharge/list/all"), body: body)
        return response as? PlusApiResultListPlusVipRechargeVO
    }

    /// Get VIP point change records by page
    public func createListByPageChange(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipPointChangeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/point/change/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipPointChangeVO
    }

    /// Get all VIP point change records
    public func createListAllEntitiesChange(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipPointChangeVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/point/change/list/all"), body: body)
        return response as? PlusApiResultListPlusVipPointChangeVO
    }

    /// List public
    public func listPublic(body: PlusVipPackGroupQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipPackGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack_group/list_public"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipPackGroupVO
    }

    /// Get VIP package groups by page
    public func createListByPagePackGroup(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipPackGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack_group/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipPackGroupVO
    }

    /// Get all VIP package groups
    public func createListAllEntitiesPackGroup(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipPackGroupVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack_group/list/all"), body: body)
        return response as? PlusApiResultListPlusVipPackGroupVO
    }

    /// Get VIP Packages by Page
    public func createListByPagePack2(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipPackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipPackVO
    }

    /// Get All VIP Packages
    public func createListAllEntitiesPack2(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipPackVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/pack/list/all"), body: body)
        return response as? PlusApiResultListPlusVipPackVO
    }

    /// Get VIP levels by page
    public func createListByPageLevel(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipLevelVO
    }

    /// Get all VIP levels
    public func createListAllEntitiesLevel(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipLevelVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/list/all"), body: body)
        return response as? PlusApiResultListPlusVipLevelVO
    }

    /// Get VIP level benefits by page
    public func createListByPageBenefit(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipLevelBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/benefit/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipLevelBenefitVO
    }

    /// Get all VIP level benefits
    public func createListAllEntitiesBenefit(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipLevelBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/level/benefit/list/all"), body: body)
        return response as? PlusApiResultListPlusVipLevelBenefitVO
    }

    /// Get VIP benefit usage records by page
    public func createListByPageUsage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipBenefitUsageVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/usage/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipBenefitUsageVO
    }

    /// Get all VIP benefit usage records
    public func createListAllEntitiesUsage(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipBenefitUsageVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/usage/list/all"), body: body)
        return response as? PlusApiResultListPlusVipBenefitUsageVO
    }

    /// Get VIP benefits by page
    public func createListByPageBenefit2(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVipBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVipBenefitVO
    }

    /// Get all VIP benefits
    public func createListAllEntitiesBenefit2(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVipBenefitVO? {
        let response = try await client.post(ApiPaths.backendPath("/vip/benefit/list/all"), body: body)
        return response as? PlusApiResultListPlusVipBenefitVO
    }

    /// Get a VIP user by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVipUserVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/user/\(id)"))
        return response as? PlusApiResultPlusVipUserVO
    }

    /// Delete a VIP user
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/user/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a VIP recharge record by ID
    public func getByIdRecharge(id: String) async throws -> PlusApiResultPlusVipRechargeVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/recharge/\(id)"))
        return response as? PlusApiResultPlusVipRechargeVO
    }

    /// Delete a VIP recharge record
    public func deleteRecharge(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/recharge/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a VIP recharge package by ID
    public func getByIdPack(id: String) async throws -> PlusApiResultPlusVipRechargePackVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/recharge/pack/\(id)"))
        return response as? PlusApiResultPlusVipRechargePackVO
    }

    /// Delete a VIP recharge package
    public func deletePack(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/recharge/pack/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a VIP point change record by ID
    public func getByIdChange(id: String) async throws -> PlusApiResultPlusVipPointChangeVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/point/change/\(id)"))
        return response as? PlusApiResultPlusVipPointChangeVO
    }

    /// Delete a VIP point change record
    public func deleteChange(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/point/change/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a VIP package group by ID
    public func getByIdPackGroup(id: String) async throws -> PlusApiResultPlusVipPackGroupVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/pack_group/\(id)"))
        return response as? PlusApiResultPlusVipPackGroupVO
    }

    /// Delete a VIP package group
    public func deletePackGroup(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/pack_group/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get VIP Package by ID
    public func getByIdPack2(id: String) async throws -> PlusApiResultPlusVipPackVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/pack/\(id)"))
        return response as? PlusApiResultPlusVipPackVO
    }

    /// Delete VIP Package
    public func deletePack2(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/pack/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a VIP level by ID
    public func getByIdLevel(id: String) async throws -> PlusApiResultPlusVipLevelVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/level/\(id)"))
        return response as? PlusApiResultPlusVipLevelVO
    }

    /// Delete a VIP level
    public func deleteLevel(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/level/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a VIP level benefit by ID
    public func getByIdBenefit(id: String) async throws -> PlusApiResultPlusVipLevelBenefitVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/level/benefit/\(id)"))
        return response as? PlusApiResultPlusVipLevelBenefitVO
    }

    /// Delete a VIP level benefit
    public func deleteBenefit(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/level/benefit/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a VIP benefit by ID
    public func getByIdBenefit2(id: String) async throws -> PlusApiResultPlusVipBenefitVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/benefit/\(id)"))
        return response as? PlusApiResultPlusVipBenefitVO
    }

    /// Delete a VIP benefit
    public func deleteBenefit2(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/benefit/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a VIP benefit usage record by ID
    public func getByIdUsage(id: String) async throws -> PlusApiResultPlusVipBenefitUsageVO? {
        let response = try await client.get(ApiPaths.backendPath("/vip/benefit/usage/\(id)"))
        return response as? PlusApiResultPlusVipBenefitUsageVO
    }

    /// Delete a VIP benefit usage record
    public func deleteUsage(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vip/benefit/usage/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
