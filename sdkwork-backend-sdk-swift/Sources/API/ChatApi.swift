import Foundation

public class ChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Stop a chat completion stream
    public func stop(params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> PlusApiResult? {
        let response = try await client.post(ApiPaths.backendPath("/chat/stop"), body: nil, params: params, headers: headers)
        return response as? PlusApiResult
    }

    /// Create a chat completion
    public func create(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/chat/completions"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }
}
