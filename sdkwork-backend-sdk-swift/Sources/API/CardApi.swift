import Foundation

public class CardApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing membership card
    public func update(body: PlusCardForm) async throws -> PlusApiResultPlusCardVO? {
        let response = try await client.put(ApiPaths.backendPath("/card"), body: body)
        return response as? PlusApiResultPlusCardVO
    }

    /// Create a new membership card
    public func create(body: PlusCardForm) async throws -> PlusApiResultPlusCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/card"), body: body)
        return response as? PlusApiResultPlusCardVO
    }

    /// Update an existing card template
    public func updateTemplate(body: PlusCardTemplateForm) async throws -> PlusApiResultPlusCardTemplateVO? {
        let response = try await client.put(ApiPaths.backendPath("/card/template"), body: body)
        return response as? PlusApiResultPlusCardTemplateVO
    }

    /// Create a new card template
    public func createTemplate(body: PlusCardTemplateForm) async throws -> PlusApiResultPlusCardTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/template"), body: body)
        return response as? PlusApiResultPlusCardTemplateVO
    }

    /// Get card templates by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCardTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/template/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCardTemplateVO
    }

    /// Get all card templates
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCardTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/template/list/all"), body: body)
        return response as? PlusApiResultListPlusCardTemplateVO
    }

    /// Get membership cards by page
    public func createListByPageCard(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusCardVO
    }

    /// Get all membership cards
    public func createListAllEntitiesCard(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusCardVO? {
        let response = try await client.post(ApiPaths.backendPath("/card/list/all"), body: body)
        return response as? PlusApiResultListPlusCardVO
    }

    /// Get a membership card by ID
    public func getById(id: String) async throws -> PlusApiResultPlusCardVO? {
        let response = try await client.get(ApiPaths.backendPath("/card/\(id)"))
        return response as? PlusApiResultPlusCardVO
    }

    /// Delete a membership card
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/card/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a card template by ID
    public func getByIdTemplate(id: String) async throws -> PlusApiResultPlusCardTemplateVO? {
        let response = try await client.get(ApiPaths.backendPath("/card/template/\(id)"))
        return response as? PlusApiResultPlusCardTemplateVO
    }

    /// Delete a card template
    public func deleteTemplate(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/card/template/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
