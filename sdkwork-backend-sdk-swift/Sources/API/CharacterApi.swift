import Foundation

public class CharacterApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update character
    public func update(body: PlusCharacterForm) async throws -> PlusApiResultPlusCharacterVO? {
        let response = try await client.put(ApiPaths.backendPath("/character"), body: body)
        return response as? PlusApiResultPlusCharacterVO
    }

    /// Create character
    public func create(body: PlusCharacterForm) async throws -> PlusApiResultPlusCharacterVO? {
        let response = try await client.post(ApiPaths.backendPath("/character"), body: body)
        return response as? PlusApiResultPlusCharacterVO
    }

    /// Get characters by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCharacterVO? {
        let response = try await client.post(ApiPaths.backendPath("/character/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCharacterVO
    }

    /// Get all characters
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCharacterVO? {
        let response = try await client.post(ApiPaths.backendPath("/character/list/all"), body: body)
        return response as? PlusApiResultListPlusCharacterVO
    }

    /// Get character by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCharacterVO? {
        let response = try await client.get(ApiPaths.backendPath("/character/\(id)"))
        return response as? PlusApiResultPlusCharacterVO
    }

    /// Delete character
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/character/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
