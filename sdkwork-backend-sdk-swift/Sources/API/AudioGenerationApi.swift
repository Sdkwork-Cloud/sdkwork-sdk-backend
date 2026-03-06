import Foundation

public class AudioGenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create audio generation task
    public func create(body: GenerateAudioForm) async throws -> PlusApiResultGenerateAudioVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/audio/create"), body: body)
        return response as? PlusApiResultGenerateAudioVO
    }

    /// Get audio generation result
    public func getResult(taskId: String) async throws -> PlusApiResultGenerateAudioVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/audio/result/\(taskId)"))
        return response as? PlusApiResultGenerateAudioVO
    }
}
