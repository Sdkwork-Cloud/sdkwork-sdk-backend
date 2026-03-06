import Foundation

public class AgentChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create a chat completion with agent
    public func withContext(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/with_context"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }

    /// Stop a chat completion stream
    public func stop(params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> PlusApiResult? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/stop"), body: nil, params: params, headers: headers)
        return response as? PlusApiResult
    }

    /// Create a chat completion with agent
    public func resumeStream(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/resume_stream"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }

    /// Create a chat completion with agent
    public func create(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/completions"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }
}
