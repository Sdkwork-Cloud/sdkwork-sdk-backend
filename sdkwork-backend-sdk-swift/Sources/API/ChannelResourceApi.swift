import Foundation

public class ChannelResourceApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing channel resource
    public func update(body: PlusChannelResourceForm) async throws -> PlusApiResultPlusChannelResourceVO? {
        let response = try await client.put(ApiPaths.backendPath("/channel/resource"), body: body)
        return response as? PlusApiResultPlusChannelResourceVO
    }

    /// Create a new channel resource
    public func create(body: PlusChannelResourceForm) async throws -> PlusApiResultPlusChannelResourceVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/resource"), body: body)
        return response as? PlusApiResultPlusChannelResourceVO
    }

    /// Get channel resources by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChannelResourceVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/resource/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChannelResourceVO
    }

    /// Get all channel resources
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusChannelResourceVO? {
        let response = try await client.post(ApiPaths.backendPath("/channel/resource/list/all"), body: body)
        return response as? PlusApiResultListPlusChannelResourceVO
    }

    /// Get a channel resource by ID
    public func getById(id: String) async throws -> PlusApiResultPlusChannelResourceVO? {
        let response = try await client.get(ApiPaths.backendPath("/channel/resource/\(id)"))
        return response as? PlusApiResultPlusChannelResourceVO
    }

    /// Delete a channel resource
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/channel/resource/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
