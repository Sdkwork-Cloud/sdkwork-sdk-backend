import Foundation

public class AiAgentChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create a chat completion with agent
    public func withContext(body: ChatCompletionCreateForm, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/with_context"), body: body, params: nil, headers: headers)
        return response as? ChatCompletionChunk
    }

    /// Stop a chat completion stream
    public func stop(headers: [String: String]? = nil) async throws -> PlusApiResult? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/stop"), body: nil, params: nil, headers: headers)
        return response as? PlusApiResult
    }

    /// Create a chat completion with agent
    public func resumeStream(body: ChatCompletionCreateForm, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/resume_stream"), body: body, params: nil, headers: headers)
        return response as? ChatCompletionChunk
    }

    /// Create a chat completion with agent
    public func create(body: ChatCompletionCreateForm, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/agent/chat/completions"), body: body, params: nil, headers: headers)
        return response as? ChatCompletionChunk
    }
}
