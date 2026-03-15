import Foundation

public class GenerationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing AI generation record
    public func update(body: PlusAiGenerationForm) async throws -> PlusApiResultPlusAiGenerationVO? {
        let response = try await client.put(ApiPaths.backendPath("/generation"), body: body)
        return response as? PlusApiResultPlusAiGenerationVO
    }

    /// Create a new AI generation record
    public func create(body: PlusAiGenerationForm) async throws -> PlusApiResultPlusAiGenerationVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation"), body: body)
        return response as? PlusApiResultPlusAiGenerationVO
    }

    /// Update AI generated content
    public func updateContent(body: PlusAiGenerationContentForm) async throws -> PlusApiResultPlusAiGenerationContentVO? {
        let response = try await client.put(ApiPaths.backendPath("/generation/content"), body: body)
        return response as? PlusApiResultPlusAiGenerationContentVO
    }

    /// Create new AI generated content
    public func createContent(body: PlusAiGenerationContentForm) async throws -> PlusApiResultPlusAiGenerationContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/content"), body: body)
        return response as? PlusApiResultPlusAiGenerationContentVO
    }

    /// Create voice speaker generation task
    public func createVoiceSpeaker(body: GenerateVoiceSpeakerForm) async throws -> PlusApiResultGenerateVoiceSpeakerVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/voice-speaker/create"), body: body)
        return response as? PlusApiResultGenerateVoiceSpeakerVO
    }

    /// Create video generation task
    public func createVideo(body: GenerateVideoForm) async throws -> PlusApiResultGenerateVideoVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/video/create"), body: body)
        return response as? PlusApiResultGenerateVideoVO
    }

    /// Create music generation task
    public func createMusic(body: GenerateMusicForm) async throws -> PlusApiResultGenerateMusicVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/music/create"), body: body)
        return response as? PlusApiResultGenerateMusicVO
    }

    /// Get AI generation records by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiGenerationVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiGenerationVO
    }

    /// Get all AI generation records
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiGenerationVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/list/all"), body: body)
        return response as? PlusApiResultListPlusAiGenerationVO
    }

    /// Create image generation task
    public func createImage(body: GenerateImageForm) async throws -> PlusApiResultGenerateImageVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/image/create"), body: body)
        return response as? PlusApiResultGenerateImageVO
    }

    /// Get AI generated content by page
    public func createListByPageContent(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiGenerationContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/content/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiGenerationContentVO
    }

    /// Get all AI generated content
    public func createListAllEntitiesContent(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAiGenerationContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/content/list/all"), body: body)
        return response as? PlusApiResultListPlusAiGenerationContentVO
    }

    /// Create character generation task
    public func createCharacter(body: GenerateCharacterForm) async throws -> PlusApiResultGenerateCharacterVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/character/create"), body: body)
        return response as? PlusApiResultGenerateCharacterVO
    }

    /// Create audio generation task
    public func createAudio(body: GenerateAudioForm) async throws -> PlusApiResultGenerateAudioVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/audio/create"), body: body)
        return response as? PlusApiResultGenerateAudioVO
    }

    /// Create audio effect generation task
    public func createAudioEffect(body: GenerateAudioEffectForm) async throws -> PlusApiResultGenerateAudioEffectVO? {
        let response = try await client.post(ApiPaths.backendPath("/generation/audio-effect/create"), body: body)
        return response as? PlusApiResultGenerateAudioEffectVO
    }

    /// Get an AI generation record by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiGenerationVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/\(id)"))
        return response as? PlusApiResultPlusAiGenerationVO
    }

    /// Delete an AI generation record
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/generation/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get voice speaker generation result
    public func getResultByTaskId(taskId: String) async throws -> PlusApiResultGenerateVoiceSpeakerVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/voice-speaker/result/\(taskId)"))
        return response as? PlusApiResultGenerateVoiceSpeakerVO
    }

    /// Get video generation result
    public func getResult(taskId: String) async throws -> PlusApiResultGenerateVideoVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/video/result/\(taskId)"))
        return response as? PlusApiResultGenerateVideoVO
    }

    /// Get music generation result
    public func getResultMusic(taskId: String) async throws -> PlusApiResultGenerateMusicVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/music/result/\(taskId)"))
        return response as? PlusApiResultGenerateMusicVO
    }

    /// Get image generation result
    public func getResultImage(taskId: String) async throws -> PlusApiResultGenerateImageVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/image/result/\(taskId)"))
        return response as? PlusApiResultGenerateImageVO
    }

    /// Get AI generated content by ID
    public func getByIdContent(id: String) async throws -> PlusApiResultPlusAiGenerationContentVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/content/\(id)"))
        return response as? PlusApiResultPlusAiGenerationContentVO
    }

    /// Delete AI generated content
    public func deleteContent(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/generation/content/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get character generation result
    public func getResultCharacter(taskId: String) async throws -> PlusApiResultGenerateCharacterVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/character/result/\(taskId)"))
        return response as? PlusApiResultGenerateCharacterVO
    }

    /// Get audio generation result
    public func getResultAudio(taskId: String) async throws -> PlusApiResultGenerateAudioVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/audio/result/\(taskId)"))
        return response as? PlusApiResultGenerateAudioVO
    }

    /// Get audio effect generation result
    public func getResultAudioEffect(taskId: String) async throws -> PlusApiResultGenerateAudioEffectVO? {
        let response = try await client.get(ApiPaths.backendPath("/generation/audio-effect/result/\(taskId)"))
        return response as? PlusApiResultGenerateAudioEffectVO
    }
}
