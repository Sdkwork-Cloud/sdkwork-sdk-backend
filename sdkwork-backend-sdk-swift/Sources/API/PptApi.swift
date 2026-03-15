import Foundation

public class PptApi {
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

    /// Update an existing PPT template slide
    public func updateSlide(body: PlusPptTemplateSlideForm) async throws -> PlusApiResultPlusPptTemplateSlideVO? {
        let response = try await client.put(ApiPaths.backendPath("/ppt/template/slide"), body: body)
        return response as? PlusApiResultPlusPptTemplateSlideVO
    }

    /// Create a new PPT template slide
    public func createSlide(body: PlusPptTemplateSlideForm) async throws -> PlusApiResultPlusPptTemplateSlideVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/slide"), body: body)
        return response as? PlusApiResultPlusPptTemplateSlideVO
    }

    /// Get PPT template slides by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPptTemplateSlideVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/slide/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPptTemplateSlideVO
    }

    /// Get all PPT template slides
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPptTemplateSlideVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/slide/list/all"), body: body)
        return response as? PlusApiResultListPlusPptTemplateSlideVO
    }

    /// Render PPT template
    public func render(body: PlusPptTemplateRenderForm) async throws -> PlusApiResult? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/render"), body: body)
        return response as? PlusApiResult
    }

    /// Get PPT templates by page
    public func createListByPageTemplate(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusPptTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusPptTemplateVO
    }

    /// Get all PPT templates
    public func createListAllEntitiesTemplate(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusPptTemplateVO? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/list/all"), body: body)
        return response as? PlusApiResultListPlusPptTemplateVO
    }

    public func stop(params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/chat/stop"), body: nil, params: params, headers: headers)
        return response as? PlusApiResultBoolean
    }

    /// Create a chat completion with PPT template
    public func createCompletions(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/ppt/template/chat/completions"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
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

    /// Get a PPT template slide by ID
    public func getByIdSlide(id: String) async throws -> PlusApiResultPlusPptTemplateSlideVO? {
        let response = try await client.get(ApiPaths.backendPath("/ppt/template/slide/\(id)"))
        return response as? PlusApiResultPlusPptTemplateSlideVO
    }

    /// Delete a PPT template slide
    public func deleteSlide(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/ppt/template/slide/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
