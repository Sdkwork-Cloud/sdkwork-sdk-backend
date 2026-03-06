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

    /// List channels by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChannelVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChannelVO
    }

    /// List all channels
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusChannelVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/list/all"), body: body)
        return response as? PlusApiResultListPlusChannelVO
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
}
