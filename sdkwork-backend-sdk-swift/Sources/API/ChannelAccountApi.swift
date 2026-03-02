import Foundation

public class ChannelAccountApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update channel account
    public func update(body: PlusChannelAccountForm) async throws -> PlusApiResultPlusChannelAccountVO? {
        let response = try await client.put(ApiPaths.backendPath("/channel/account"), body: body)
        return response as? PlusApiResultPlusChannelAccountVO
    }

    /// Create channel account
    public func create(body: PlusChannelAccountForm) async throws -> PlusApiResultPlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account"), body: body)
        return response as? PlusApiResultPlusChannelAccountVO
    }

    /// Get SMS channel accounts
    public func listSms(body: PlusChannelAccountQueryForm? = nil) async throws -> PlusApiResultListPlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account/list_sms"), body: body)
        return response as? PlusApiResultListPlusChannelAccountVO
    }

    /// Get payment channel accounts
    public func listPayment(body: PlusChannelAccountQueryForm? = nil) async throws -> PlusApiResultListPlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account/list_payment"), body: body)
        return response as? PlusApiResultListPlusChannelAccountVO
    }

    /// Get OSS channel accounts
    public func listOss(body: PlusChannelAccountQueryForm? = nil) async throws -> PlusApiResultListPlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account/list_oss"), body: body)
        return response as? PlusApiResultListPlusChannelAccountVO
    }

    /// Get official account channel accounts
    public func listOfficialAccount(body: PlusChannelAccountQueryForm? = nil) async throws -> PlusApiResultListPlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account/list_official_account"), body: body)
        return response as? PlusApiResultListPlusChannelAccountVO
    }

    /// Get mini program channel accounts
    public func listMiniProgram(body: PlusChannelAccountQueryForm? = nil) async throws -> PlusApiResultListPlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account/list_mini_program"), body: body)
        return response as? PlusApiResultListPlusChannelAccountVO
    }

    /// Get channel accounts by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChannelAccountVO
    }

    /// Get all channel accounts
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account/list/all"), body: body)
        return response as? PlusApiResultListPlusChannelAccountVO
    }

    /// Get channel account by ID
    public func getById(id: String) async throws -> PlusApiResultPlusChannelAccountVO? {
        let response = try await client.get(ApiPaths.backendPath("/channel/account/\(id)"))
        return response as? PlusApiResultPlusChannelAccountVO
    }

    /// Delete channel account
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/channel/account/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
