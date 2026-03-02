import Foundation

public class PptTemplateApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing PPT template
    public func update(body: PlusPptTemplateForm) async throws -> PlusApiResultPlusPptTemplateVO? {
        let response = try await client.put(ApiPaths.backendPath("/ppt/template"), body: body)
        return response as? PlusApiResultPlusPptTemplateVO
    }

    /// Create a new PPT template
    public func create(body: PlusPptTemplateForm) async throws -> PlusApiResultPlusPptTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template"), body: body)
        return response as? PlusApiResultPlusPptTemplateVO
    }

    /// Get PPT templates by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPptTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPptTemplateVO
    }

    /// Get all PPT templates
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPptTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/list/all"), body: body)
        return response as? PlusApiResultListPlusPptTemplateVO
    }

    /// Get a PPT template by ID
    public func getById(id: String) async throws -> PlusApiResultPlusPptTemplateVO? {
        let response = try await client.get(ApiPaths.backendPath("/ppt/template/\(id)"))
        return response as? PlusApiResultPlusPptTemplateVO
    }

    /// Delete a PPT template
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/ppt/template/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
