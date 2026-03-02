import Foundation

public class ImMessageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get messages by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMessage? {
        let response = try await client.post(ApiPaths.backendPath("/im/message/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMessage
    }
}
