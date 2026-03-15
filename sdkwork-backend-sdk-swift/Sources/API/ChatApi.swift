import Foundation

public class ChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing chat message
    public func updateMessage(body: PlusChatMessageForm) async throws -> PlusApiResultPlusChatMessageVO? {
        let response = try await client.put(ApiPaths.backendPath("/chat/message"), body: body)
        return response as? PlusApiResultPlusChatMessageVO
    }

    /// Create a new chat message
    public func createMessage(body: PlusChatMessageForm) async throws -> PlusApiResultPlusChatMessageVO? {
        let response = try await client.post(ApiPaths.backendPath("/chat/message"), body: body)
        return response as? PlusApiResultPlusChatMessageVO
    }

    /// Stop a chat completion stream
    public func stop(params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> PlusApiResult? {
        let response = try await client.post(ApiPaths.backendPath("/chat/stop"), body: nil, params: params, headers: headers)
        return response as? PlusApiResult
    }

    /// Get chat messages by page
    public func loadMore(body: ChatMessageQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChatMessageVO? {
        let response = try await client.post(ApiPaths.backendPath("/chat/message/load_more"), body: body, params: params)
        return response as? PlusApiResultPagePlusChatMessageVO
    }

    /// Get chat messages by page
    public func createListByPage(body: ChatMessageQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChatMessageVO? {
        let response = try await client.post(ApiPaths.backendPath("/chat/message/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChatMessageVO
    }

    /// Get all chat messages
    public func createListAllEntities(body: ChatMessageQueryListForm? = nil) async throws -> PlusApiResultListPlusChatMessageVO? {
        let response = try await client.post(ApiPaths.backendPath("/chat/message/list/all"), body: body)
        return response as? PlusApiResultListPlusChatMessageVO
    }

    /// Create a chat completion
    public func create(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/chat/completions"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }

    /// Get a chat message by ID
    public func getByIdMessage(id: String) async throws -> PlusApiResultPlusChatMessageVO? {
        let response = try await client.get(ApiPaths.backendPath("/chat/message/\(id)"))
        return response as? PlusApiResultPlusChatMessageVO
    }

    /// Delete a chat message
    public func deleteMessage(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/chat/message/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
