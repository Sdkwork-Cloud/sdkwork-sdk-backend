import Foundation

public class AiVideoGenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create video generation task
    public func create(body: GenerateVideoForm) async throws -> PlusApiResultGenerateVideoVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/video/create"), body: body)
        return response as? PlusApiResultGenerateVideoVO
    }

    /// Get video generation result
    public func getResult(taskId: String) async throws -> PlusApiResultGenerateVideoVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/video/result/\(taskId)"))
        return response as? PlusApiResultGenerateVideoVO
    }
}
