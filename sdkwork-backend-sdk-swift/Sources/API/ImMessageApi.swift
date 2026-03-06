import Foundation

public class ImMessageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Mark conversation messages as read
    public func markRead(body: PlusImMessageMarkReadForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/im/message/mark_read"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Get messages by page
    public func listByPage(body: PlusImMessageQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusMessage? {
        let response = try await client.post(ApiPaths.backendPath("/im/message/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusMessage
    }
}
