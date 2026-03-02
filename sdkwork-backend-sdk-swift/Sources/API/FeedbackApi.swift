import Foundation

public class FeedbackApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update feedback
    public func update(body: PlusFeedbackForm) async throws -> PlusApiResultPlusFeedbackVO? {
        let response = try await client.put(ApiPaths.backendPath("/feedback"), body: body)
        return response as? PlusApiResultPlusFeedbackVO
    }

    /// Create new feedback
    public func create(body: PlusFeedbackForm) async throws -> PlusApiResultPlusFeedbackVO? {
        let response = try await client.post(ApiPaths.backendPath("/feedback"), body: body)
        return response as? PlusApiResultPlusFeedbackVO
    }

    /// Get feedback by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusFeedbackVO? {
        let response = try await client.post(ApiPaths.backendPath("/feedback/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusFeedbackVO
    }

    /// Get all feedback records
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusFeedbackVO? {
        let response = try await client.post(ApiPaths.backendPath("/feedback/list/all"), body: body)
        return response as? PlusApiResultListPlusFeedbackVO
    }

    /// Get feedback by ID
    public func getById(id: String) async throws -> PlusApiResultPlusFeedbackVO? {
        let response = try await client.get(ApiPaths.backendPath("/feedback/\(id)"))
        return response as? PlusApiResultPlusFeedbackVO
    }

    /// Delete feedback
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/feedback/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
