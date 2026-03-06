import Foundation

public class PptTemplateChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    public func stop(params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/chat/stop"), body: nil, params: params, headers: headers)
        return response as? PlusApiResultBoolean
    }

    /// Create a chat completion with PPT template
    public func create(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/chat/completions"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }
}
