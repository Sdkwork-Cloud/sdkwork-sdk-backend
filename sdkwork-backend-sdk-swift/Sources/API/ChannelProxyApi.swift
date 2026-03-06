import Foundation

public class ChannelProxyApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update channel proxy
    public func update(body: PlusChannelProxyForm) async throws -> PlusApiResultPlusChannelProxyVO? {
        let response = try await client.put(ApiPaths.backendPath("/channel/proxy"), body: body)
        return response as? PlusApiResultPlusChannelProxyVO
    }

    /// Create channel proxy
    public func create(body: PlusChannelProxyForm) async throws -> PlusApiResultPlusChannelProxyVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/proxy"), body: body)
        return response as? PlusApiResultPlusChannelProxyVO
    }

    /// List channel proxies by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChannelProxyVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/proxy/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChannelProxyVO
    }

    /// List all channel proxies
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusChannelProxyVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/proxy/list/all"), body: body)
        return response as? PlusApiResultListPlusChannelProxyVO
    }

    /// Get channel proxy by ID
    public func getById(id: String) async throws -> PlusApiResultPlusChannelProxyVO? {
        let response = try await client.get(ApiPaths.backendPath("/channel/proxy/\(id)"))
        return response as? PlusApiResultPlusChannelProxyVO
    }

    /// Delete channel proxy
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/channel/proxy/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
