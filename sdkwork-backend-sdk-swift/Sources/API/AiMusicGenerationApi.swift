import Foundation

public class AiMusicGenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create music generation task
    public func create(body: GenerateMusicForm) async throws -> PlusApiResultGenerateMusicVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/music/create"), body: body)
        return response as? PlusApiResultGenerateMusicVO
    }

    /// Get music generation result
    public func getResult(taskId: String) async throws -> PlusApiResultGenerateMusicVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/music/result/\(taskId)"))
        return response as? PlusApiResultGenerateMusicVO
    }
}
