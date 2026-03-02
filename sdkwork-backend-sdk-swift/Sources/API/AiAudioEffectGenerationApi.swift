import Foundation

public class AiAudioEffectGenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create audio effect generation task
    public func create(body: GenerateAudioEffectForm) async throws -> PlusApiResultGenerateAudioEffectVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/audio-effect/create"), body: body)
        return response as? PlusApiResultGenerateAudioEffectVO
    }

    /// Get audio effect generation result
    public func getResult(taskId: String) async throws -> PlusApiResultGenerateAudioEffectVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/audio-effect/result/\(taskId)"))
        return response as? PlusApiResultGenerateAudioEffectVO
    }
}
