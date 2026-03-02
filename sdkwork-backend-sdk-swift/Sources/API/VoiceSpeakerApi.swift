import Foundation

public class VoiceSpeakerApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing voice speaker
    public func update(body: PlusVoiceSpeakerForm) async throws -> PlusApiResultPlusVoiceSpeakerVO? {
        let response = try await client.put(ApiPaths.backendPath("/voice/speaker"), body: body)
        return response as? PlusApiResultPlusVoiceSpeakerVO
    }

    /// Create a new voice speaker
    public func create(body: PlusVoiceSpeakerForm) async throws -> PlusApiResultPlusVoiceSpeakerVO? {
        let response = try await client.post(ApiPaths.backendPath("/voice/speaker"), body: body)
        return response as? PlusApiResultPlusVoiceSpeakerVO
    }

    /// Get voice speakers by page
    public func listPublic(body: PlusVoiceSpeakerQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVoiceSpeakerVO? {
        let response = try await client.post(ApiPaths.backendPath("/voice/speaker/list_public"), body: body, params: params)
        return response as? PlusApiResultPagePlusVoiceSpeakerVO
    }

    /// Get voice speakers by page
    public func listByPage(body: PlusVoiceSpeakerQueryForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusVoiceSpeakerVO? {
        let response = try await client.post(ApiPaths.backendPath("/voice/speaker/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusVoiceSpeakerVO
    }

    /// Get all voice speakers
    public func listAllEntities(body: PlusVoiceSpeakerQueryForm? = nil) async throws -> PlusApiResultListPlusVoiceSpeakerVO? {
        let response = try await client.post(ApiPaths.backendPath("/voice/speaker/list/all"), body: body)
        return response as? PlusApiResultListPlusVoiceSpeakerVO
    }

    /// Get a voice speaker by ID
    public func getById(id: String) async throws -> PlusApiResultPlusVoiceSpeakerVO? {
        let response = try await client.get(ApiPaths.backendPath("/voice/speaker/\(id)"))
        return response as? PlusApiResultPlusVoiceSpeakerVO
    }

    /// Delete a voice speaker
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/voice/speaker/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
