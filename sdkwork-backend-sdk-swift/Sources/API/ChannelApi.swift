import Foundation

public class ChannelApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update channel
    public func update(body: PlusChannelForm) async throws -> PlusApiResultPlusChannelVO? {
        let response = try await client.put(ApiPaths.backendPath("/channel"), body: body)
        return response as? PlusApiResultPlusChannelVO
    }

    /// Create channel
    public func create(body: PlusChannelForm) async throws -> PlusApiResultPlusChannelVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel"), body: body)
        return response as? PlusApiResultPlusChannelVO
    }

    /// Update an existing channel resource
    public func updateResource(body: PlusChannelResourceForm) async throws -> PlusApiResultPlusChannelResourceVO? {
        let response = try await client.put(ApiPaths.backendPath("/channel/resource"), body: body)
        return response as? PlusApiResultPlusChannelResourceVO
    }

    /// Create a new channel resource
    public func createResource(body: PlusChannelResourceForm) async throws -> PlusApiResultPlusChannelResourceVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/resource"), body: body)
        return response as? PlusApiResultPlusChannelResourceVO
    }

    /// Update channel proxy
    public func updateProxy(body: PlusChannelProxyForm) async throws -> PlusApiResultPlusChannelProxyVO? {
        let response = try await client.put(ApiPaths.backendPath("/channel/proxy"), body: body)
        return response as? PlusApiResultPlusChannelProxyVO
    }

    /// Create channel proxy
    public func createProxy(body: PlusChannelProxyForm) async throws -> PlusApiResultPlusChannelProxyVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/proxy"), body: body)
        return response as? PlusApiResultPlusChannelProxyVO
    }

    /// Update channel account
    public func updateAccount(body: PlusChannelAccountForm) async throws -> PlusApiResultPlusChannelAccountVO? {
        let response = try await client.put(ApiPaths.backendPath("/channel/account"), body: body)
        return response as? PlusApiResultPlusChannelAccountVO
    }

    /// Create channel account
    public func createAccount(body: PlusChannelAccountForm) async throws -> PlusApiResultPlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account"), body: body)
        return response as? PlusApiResultPlusChannelAccountVO
    }

    /// Get channel resources by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChannelResourceVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/resource/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChannelResourceVO
    }

    /// Get all channel resources
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusChannelResourceVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/resource/list/all"), body: body)
        return response as? PlusApiResultListPlusChannelResourceVO
    }

    /// List channel proxies by page
    public func createListByPageProxy(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChannelProxyVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/proxy/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChannelProxyVO
    }

    /// List all channel proxies
    public func createListAllEntitiesProxy(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusChannelProxyVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/proxy/list/all"), body: body)
        return response as? PlusApiResultListPlusChannelProxyVO
    }

    /// List channels by page
    public func createListByPageChannel(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChannelVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChannelVO
    }

    /// List all channels
    public func createListAllEntitiesChannel(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusChannelVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/list/all"), body: body)
        return response as? PlusApiResultListPlusChannelVO
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
    public func createListByPageAccount(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChannelAccountVO
    }

    /// Get all channel accounts
    public func createListAllEntitiesAccount(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusChannelAccountVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/account/list/all"), body: body)
        return response as? PlusApiResultListPlusChannelAccountVO
    }

    /// Get channel by ID
    public func getById(id: String) async throws -> PlusApiResultPlusChannelVO? {
        let response = try await client.get(ApiPaths.backendPath("/channel/\(id)"))
        return response as? PlusApiResultPlusChannelVO
    }

    /// Delete channel
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/channel/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a channel resource by ID
    public func getByIdResource(id: String) async throws -> PlusApiResultPlusChannelResourceVO? {
        let response = try await client.get(ApiPaths.backendPath("/channel/resource/\(id)"))
        return response as? PlusApiResultPlusChannelResourceVO
    }

    /// Delete a channel resource
    public func deleteResource(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/channel/resource/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get channel proxy by ID
    public func getByIdProxy(id: String) async throws -> PlusApiResultPlusChannelProxyVO? {
        let response = try await client.get(ApiPaths.backendPath("/channel/proxy/\(id)"))
        return response as? PlusApiResultPlusChannelProxyVO
    }

    /// Delete channel proxy
    public func deleteProxy(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/channel/proxy/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get channel account by ID
    public func getByIdAccount(id: String) async throws -> PlusApiResultPlusChannelAccountVO? {
        let response = try await client.get(ApiPaths.backendPath("/channel/account/\(id)"))
        return response as? PlusApiResultPlusChannelAccountVO
    }

    /// Delete channel account
    public func deleteAccount(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/channel/account/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
