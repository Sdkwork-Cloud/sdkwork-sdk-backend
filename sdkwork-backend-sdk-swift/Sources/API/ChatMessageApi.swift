import Foundation

public class ChatMessageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing chat message
    public func update(body: PlusChatMessageContentForm) async throws -> PlusApiResultPlusChatMessageContentVO? {
        let response = try await client.put(ApiPaths.backendPath("/message"), body: body)
        return response as? PlusApiResultPlusChatMessageContentVO
    }

    /// Create a new chat message
    public func create(body: PlusChatMessageContentForm) async throws -> PlusApiResultPlusChatMessageContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/message"), body: body)
        return response as? PlusApiResultPlusChatMessageContentVO
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

    /// Get chat messages by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusChatMessageContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/message/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusChatMessageContentVO
    }

    /// Get all chat messages
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusChatMessageContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/message/list/all"), body: body)
        return response as? PlusApiResultListPlusChatMessageContentVO
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

    /// Get chat message by ID
    public func getById(id: String) async throws -> PlusApiResultPlusChatMessageContentVO? {
        let response = try await client.get(ApiPaths.backendPath("/message/\(id)"))
        return response as? PlusApiResultPlusChatMessageContentVO
    }

    /// Delete a chat message
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/message/\(id)"))
        return response as? PlusApiResultBoolean
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
