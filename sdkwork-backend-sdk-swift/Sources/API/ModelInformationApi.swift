import Foundation

public class ModelInformationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update existing AI model information
    public func update(body: PlusAiModelInfoForm) async throws -> PlusApiResultPlusAiModelInfoVO? {
        let response = try await client.put(ApiPaths.backendPath("/model"), body: body)
        return response as? PlusApiResultPlusAiModelInfoVO
    }

    /// Create a new AI model information
    public func create(body: PlusAiModelInfoForm) async throws -> PlusApiResultPlusAiModelInfoVO? {
        let response = try await client.post(ApiPaths.backendPath("/model"), body: body)
        return response as? PlusApiResultPlusAiModelInfoVO
    }

    /// Get AI model information by page
    public func listByPage(body: PlusAiModelInfoQueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAiModelInfoVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAiModelInfoVO
    }

    /// Get all AI model information
    public func listAllEntities(body: PlusAiModelInfoQueryListForm? = nil) async throws -> PlusApiResultListPlusAiModelInfoVO? {
        let response = try await client.post(ApiPaths.backendPath("/model/list/all"), body: body)
        return response as? PlusApiResultListPlusAiModelInfoVO
    }

    /// Get AI model information by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAiModelInfoVO? {
        let response = try await client.get(ApiPaths.backendPath("/model/\(id)"))
        return response as? PlusApiResultPlusAiModelInfoVO
    }

    /// Delete AI model information
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/model/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
