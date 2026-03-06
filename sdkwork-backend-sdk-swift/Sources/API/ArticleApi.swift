import Foundation

public class ArticleApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing AI article
    public func update(body: PlusArticleForm) async throws -> PlusApiResultPlusArticleVO? {
        let response = try await client.put(ApiPaths.backendPath("/article"), body: body)
        return response as? PlusApiResultPlusArticleVO
    }

    /// Create a new AI article
    public func create(body: PlusArticleForm) async throws -> PlusApiResultPlusArticleVO? {
        let response = try await client.post(ApiPaths.backendPath("/article"), body: body)
        return response as? PlusApiResultPlusArticleVO
    }

    /// Get AI articles by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusArticleVO? {
        let response = try await client.post(ApiPaths.backendPath("/article/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusArticleVO
    }

    /// Get all AI articles
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusArticleVO? {
        let response = try await client.post(ApiPaths.backendPath("/article/list/all"), body: body)
        return response as? PlusApiResultListPlusArticleVO
    }

    /// Get an AI article by ID
    public func getById(id: String) async throws -> PlusApiResultPlusArticleVO? {
        let response = try await client.get(ApiPaths.backendPath("/article/\(id)"))
        return response as? PlusApiResultPlusArticleVO
    }

    /// Delete an AI article
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/article/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
