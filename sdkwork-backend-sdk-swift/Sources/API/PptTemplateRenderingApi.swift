import Foundation

public class PptTemplateRenderingApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Render PPT template
    public func render(body: PlusPptTemplateRenderForm) async throws -> PlusApiResult? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/render"), body: body)
        return response as? PlusApiResult
    }
}
