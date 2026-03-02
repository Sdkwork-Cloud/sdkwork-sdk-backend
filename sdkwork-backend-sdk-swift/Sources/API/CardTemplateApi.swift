import Foundation

public class CardTemplateApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing card template
    public func update(body: PlusCardTemplateForm) async throws -> PlusApiResultPlusCardTemplateVO? {
        let response = try await client.put(ApiPaths.backendPath("/card/template"), body: body)
        return response as? PlusApiResultPlusCardTemplateVO
    }

    /// Create a new card template
    public func create(body: PlusCardTemplateForm) async throws -> PlusApiResultPlusCardTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/template"), body: body)
        return response as? PlusApiResultPlusCardTemplateVO
    }

    /// Get card templates by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCardTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/template/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCardTemplateVO
    }

    /// Get all card templates
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCardTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/template/list/all"), body: body)
        return response as? PlusApiResultListPlusCardTemplateVO
    }

    /// Get a card template by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCardTemplateVO? {
        let response = try await client.get(ApiPaths.backendPath("/card/template/\(id)"))
        return response as? PlusApiResultPlusCardTemplateVO
    }

    /// Delete a card template
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/card/template/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
