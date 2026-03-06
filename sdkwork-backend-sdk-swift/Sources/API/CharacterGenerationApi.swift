import Foundation

public class CharacterGenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Create character generation task
    public func create(body: GenerateCharacterForm) async throws -> PlusApiResultGenerateCharacterVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/character/create"), body: body)
        return response as? PlusApiResultGenerateCharacterVO
    }

    /// Get character generation result
    public func getResult(taskId: String) async throws -> PlusApiResultGenerateCharacterVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/character/result/\(taskId)"))
        return response as? PlusApiResultGenerateCharacterVO
    }
}
