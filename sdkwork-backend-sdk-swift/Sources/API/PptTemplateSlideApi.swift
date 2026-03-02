import Foundation

public class PptTemplateSlideApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing PPT template slide
    public func update(body: PlusPptTemplateSlideForm) async throws -> PlusApiResultPlusPptTemplateSlideVO? {
        let response = try await client.put(ApiPaths.backendPath("/ppt/template/slide"), body: body)
        return response as? PlusApiResultPlusPptTemplateSlideVO
    }

    /// Create a new PPT template slide
    public func create(body: PlusPptTemplateSlideForm) async throws -> PlusApiResultPlusPptTemplateSlideVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/slide"), body: body)
        return response as? PlusApiResultPlusPptTemplateSlideVO
    }

    /// Get PPT template slides by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPptTemplateSlideVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/slide/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPptTemplateSlideVO
    }

    /// Get all PPT template slides
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPptTemplateSlideVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/slide/list/all"), body: body)
        return response as? PlusApiResultListPlusPptTemplateSlideVO
    }

    /// Get a PPT template slide by ID
    public func getById(id: String) async throws -> PlusApiResultPlusPptTemplateSlideVO? {
        let response = try await client.get(ApiPaths.backendPath("/ppt/template/slide/\(id)"))
        return response as? PlusApiResultPlusPptTemplateSlideVO
    }

    /// Delete a PPT template slide
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/ppt/template/slide/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
