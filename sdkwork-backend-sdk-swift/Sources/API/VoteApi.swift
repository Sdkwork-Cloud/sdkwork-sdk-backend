import Foundation

public class VoteApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing content vote
    public func update(body: ContentVoteForm) async throws -> PlusApiResultContentVoteVO? {
        let response = try await client.put(ApiPaths.backendPath("/vote"), body: body)
        return response as? PlusApiResultContentVoteVO
    }

    /// Create a new content vote
    public func create(body: ContentVoteForm) async throws -> PlusApiResultContentVoteVO? {
        let response = try await client.post(ApiPaths.backendPath("/vote"), body: body)
        return response as? PlusApiResultContentVoteVO
    }

    /// Get content votes by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPageContentVoteVO? {
        let response = try await client.post(ApiPaths.backendPath("/vote/list"), body: body, params: params)
        return response as? PlusApiResultPageContentVoteVO
    }

    /// Get all content votes
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListContentVoteVO? {
        let response = try await client.post(ApiPaths.backendPath("/vote/list/all"), body: body)
        return response as? PlusApiResultListContentVoteVO
    }

    /// Get a content vote by ID
    public func getById(id: String) async throws -> PlusApiResultContentVoteVO? {
        let response = try await client.get(ApiPaths.backendPath("/vote/\(id)"))
        return response as? PlusApiResultContentVoteVO
    }

    /// Delete a content vote
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/vote/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
