import Foundation

public class CommentApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing comment
    public func update(body: PlusCommentsForm) async throws -> PlusApiResultPlusCommentsVO? {
        let response = try await client.put(ApiPaths.backendPath("/comments"), body: body)
        return response as? PlusApiResultPlusCommentsVO
    }

    /// Create a new comment
    public func create(body: PlusCommentsForm) async throws -> PlusApiResultPlusCommentsVO? {
        let response = try await client.post(ApiPaths.backendPath("/comments"), body: body)
        return response as? PlusApiResultPlusCommentsVO
    }

    /// Unlike a comment
    public func unlike(id: String) async throws -> PlusApiResultPlusCommentsVO? {
        let response = try await client.post(ApiPaths.backendPath("/comments/\(id)/unlike"), body: nil)
        return response as? PlusApiResultPlusCommentsVO
    }

    /// Reply to a comment
    public func reply(id: String, body: PlusCommentsReplyForm) async throws -> PlusApiResultPlusCommentsVO? {
        let response = try await client.post(ApiPaths.backendPath("/comments/\(id)/reply"), body: body)
        return response as? PlusApiResultPlusCommentsVO
    }

    /// Like a comment
    public func like(id: String) async throws -> PlusApiResultPlusCommentsVO? {
        let response = try await client.post(ApiPaths.backendPath("/comments/\(id)/like"), body: nil)
        return response as? PlusApiResultPlusCommentsVO
    }

    /// Get comments by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCommentsVO? {
        let response = try await client.post(ApiPaths.backendPath("/comments/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCommentsVO
    }

    /// Get all comments
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCommentsVO? {
        let response = try await client.post(ApiPaths.backendPath("/comments/list/all"), body: body)
        return response as? PlusApiResultListPlusCommentsVO
    }

    /// Get a comment by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCommentsVO? {
        let response = try await client.get(ApiPaths.backendPath("/comments/\(id)"))
        return response as? PlusApiResultPlusCommentsVO
    }

    /// Delete a comment
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/comments/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
