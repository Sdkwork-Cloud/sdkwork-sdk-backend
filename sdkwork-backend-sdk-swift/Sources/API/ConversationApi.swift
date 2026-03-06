import Foundation

public class ConversationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing conversation
    public func update(body: PlusConversationForm) async throws -> PlusApiResultPlusConversationVO? {
        let response = try await client.put(ApiPaths.backendPath("/conversation"), body: body)
        return response as? PlusApiResultPlusConversationVO
    }

    /// Create a new conversation
    public func create(body: PlusConversationForm) async throws -> PlusApiResultPlusConversationVO? {
        let response = try await client.post(ApiPaths.backendPath("/conversation"), body: body)
        return response as? PlusApiResultPlusConversationVO
    }

    /// Pin/Unpin a conversation
    public func pin(id: String, params: [String: Any]? = nil) async throws -> PlusApiResultPlusConversationVO? {
        let response = try await client.post(ApiPaths.backendPath("/conversation/\(id)/pin"), body: nil, params: params)
        return response as? PlusApiResultPlusConversationVO
    }

    /// Get all open conversations
    public func open(body: PlusConversationOpenForm? = nil) async throws -> PlusApiResultPlusConversationVO? {
        let response = try await client.post(ApiPaths.backendPath("/conversation/open"), body: body)
        return response as? PlusApiResultPlusConversationVO
    }

    /// Update an existing conversation
    public func messageFeedback(body: PlusMessageFeedbackForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/conversation/message_feedback"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Get conversations by page
    public func listByPage(body: PlusConversationQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusConversationVO? {
        let response = try await client.post(ApiPaths.backendPath("/conversation/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusConversationVO
    }

    /// Get all conversations
    public func listAllEntities(body: PlusConversationQueryListForm? = nil) async throws -> PlusApiResultListPlusConversationVO? {
        let response = try await client.post(ApiPaths.backendPath("/conversation/list/all"), body: body)
        return response as? PlusApiResultListPlusConversationVO
    }

    /// Get a conversation by ID
    public func getById(id: String) async throws -> PlusApiResultPlusConversationVO? {
        let response = try await client.get(ApiPaths.backendPath("/conversation/\(id)"))
        return response as? PlusApiResultPlusConversationVO
    }

    /// Delete a conversation
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/conversation/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
