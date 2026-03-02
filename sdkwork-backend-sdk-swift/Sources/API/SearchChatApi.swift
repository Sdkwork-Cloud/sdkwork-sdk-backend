import Foundation

public class SearchChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    public func stop(headers: [String: String]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/search/chat/stop"), body: nil, params: nil, headers: headers)
        return response as? PlusApiResultBoolean
    }

    /// Create a chat completion with Search
    public func create(body: ChatCompletionCreateForm, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/search/chat/completions"), body: body, params: nil, headers: headers)
        return response as? ChatCompletionChunk
    }
}
