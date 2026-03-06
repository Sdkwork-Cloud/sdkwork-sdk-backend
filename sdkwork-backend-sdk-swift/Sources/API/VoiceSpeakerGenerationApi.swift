import Foundation

public class VoiceSpeakerGenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create voice speaker generation task
    public func create(body: GenerateVoiceSpeakerForm) async throws -> PlusApiResultGenerateVoiceSpeakerVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/voice-speaker/create"), body: body)
        return response as? PlusApiResultGenerateVoiceSpeakerVO
    }

    /// Get voice speaker generation result
    public func getResultByTaskId(taskId: String) async throws -> PlusApiResultGenerateVoiceSpeakerVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/voice-speaker/result/\(taskId)"))
        return response as? PlusApiResultGenerateVoiceSpeakerVO
    }
}
