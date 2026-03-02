import Foundation

public class AiImageGenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create image generation task
    public func create(body: GenerateImageForm) async throws -> PlusApiResultGenerateImageVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/image/create"), body: body)
        return response as? PlusApiResultGenerateImageVO
    }

    /// Get image generation result
    public func getResult(taskId: String) async throws -> PlusApiResultGenerateImageVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/image/result/\(taskId)"))
        return response as? PlusApiResultGenerateImageVO
    }
}
