import Foundation

public class NewsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing news
    public func update(body: PlusNewsForm) async throws -> PlusApiResultPlusNewsVO? {
        let response = try await client.put(ApiPaths.backendPath("/news"), body: body)
        return response as? PlusApiResultPlusNewsVO
    }

    /// Create a new news
    public func create(body: PlusNewsForm) async throws -> PlusApiResultPlusNewsVO? {
        let response = try await client.post(ApiPaths.backendPath("/news"), body: body)
        return response as? PlusApiResultPlusNewsVO
    }

    /// Get news by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusNewsVO? {
        let response = try await client.post(ApiPaths.backendPath("/news/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusNewsVO
    }

    /// Get all news
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusNewsVO? {
        let response = try await client.post(ApiPaths.backendPath("/news/list/all"), body: body)
        return response as? PlusApiResultListPlusNewsVO
    }

    /// Get a news by ID
    public func getById(id: String) async throws -> PlusApiResultPlusNewsVO? {
        let response = try await client.get(ApiPaths.backendPath("/news/\(id)"))
        return response as? PlusApiResultPlusNewsVO
    }

    /// Delete a news
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/news/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
