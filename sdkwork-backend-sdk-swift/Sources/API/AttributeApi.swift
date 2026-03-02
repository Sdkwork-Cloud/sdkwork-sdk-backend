import Foundation

public class AttributeApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update attribute
    public func update(body: PlusAttributeForm) async throws -> PlusApiResultPlusAttributeVO? {
        let response = try await client.put(ApiPaths.backendPath("/attribute"), body: body)
        return response as? PlusApiResultPlusAttributeVO
    }

    /// Create attribute
    public func create(body: PlusAttributeForm) async throws -> PlusApiResultPlusAttributeVO? {
        let response = try await client.post(ApiPaths.backendPath("/attribute"), body: body)
        return response as? PlusApiResultPlusAttributeVO
    }

    /// Get attributes by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAttributeVO? {
        let response = try await client.post(ApiPaths.backendPath("/attribute/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAttributeVO
    }

    /// Get all attributes
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAttributeVO? {
        let response = try await client.post(ApiPaths.backendPath("/attribute/list/all"), body: body)
        return response as? PlusApiResultListPlusAttributeVO
    }

    /// Get attribute by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAttributeVO? {
        let response = try await client.get(ApiPaths.backendPath("/attribute/\(id)"))
        return response as? PlusApiResultPlusAttributeVO
    }

    /// Delete attribute
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/attribute/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
