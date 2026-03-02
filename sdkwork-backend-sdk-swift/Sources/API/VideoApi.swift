import Foundation

public class VideoApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing video
    public func update(body: PlusVideoForm) async throws -> PlusApiResultPlusVideoVO? {
        let response = try await client.put(ApiPaths.backendPath("/video"), body: body)
        return response as? PlusApiResultPlusVideoVO
    }

    /// Create a new video
    public func create(body: PlusVideoForm) async throws -> PlusApiResultPlusVideoVO? {
        let response = try await client.post(ApiPaths.backendPath("/video"), body: body)
        return response as? PlusApiResultPlusVideoVO
    }

    /// Get videos by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVideoVO? {
        let response = try await client.post(ApiPaths.backendPath("/video/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVideoVO
    }

    /// Get all videos
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusVideoVO? {
        let response = try await client.post(ApiPaths.backendPath("/video/list/all"), body: body)
        return response as? PlusApiResultListPlusVideoVO
    }

    /// Get a video by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVideoVO? {
        let response = try await client.get(ApiPaths.backendPath("/video/\(id)"))
        return response as? PlusApiResultPlusVideoVO
    }

    /// Delete a video
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/video/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
