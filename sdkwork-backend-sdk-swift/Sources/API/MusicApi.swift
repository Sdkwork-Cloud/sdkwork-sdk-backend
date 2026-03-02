import Foundation

public class MusicApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update music
    public func update(body: PlusMusicForm) async throws -> PlusApiResultPlusMusicVO? {
        let response = try await client.put(ApiPaths.backendPath("/music"), body: body)
        return response as? PlusApiResultPlusMusicVO
    }

    /// Create new music
    public func create(body: PlusMusicForm) async throws -> PlusApiResultPlusMusicVO? {
        let response = try await client.post(ApiPaths.backendPath("/music"), body: body)
        return response as? PlusApiResultPlusMusicVO
    }

    /// Get music records by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMusicVO? {
        let response = try await client.post(ApiPaths.backendPath("/music/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMusicVO
    }

    /// Get all music records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusMusicVO? {
        let response = try await client.post(ApiPaths.backendPath("/music/list/all"), body: body)
        return response as? PlusApiResultListPlusMusicVO
    }

    /// Get music by ID
    public func getById(id: String) async throws -> PlusApiResultPlusMusicVO? {
        let response = try await client.get(ApiPaths.backendPath("/music/\(id)"))
        return response as? PlusApiResultPlusMusicVO
    }

    /// Delete music
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/music/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
