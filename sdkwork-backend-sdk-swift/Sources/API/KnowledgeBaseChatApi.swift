import Foundation

public class KnowledgeBaseChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    public func stop(headers: [String: String]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base/chat/stop"), body: nil, params: nil, headers: headers)
        return response as? PlusApiResultBoolean
    }

    /// Create a chat completion with Knowledge base
    public func create(body: ChatCompletionCreateForm, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base/chat/completions"), body: body, params: nil, headers: headers)
        return response as? ChatCompletionChunk
    }
}
