import Foundation

public class DatasourceApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing data source
    public func update(body: PlusDatasourceForm) async throws -> PlusApiResultPlusDatasourceVO? {
        let response = try await client.put(ApiPaths.backendPath("/datasource"), body: body)
        return response as? PlusApiResultPlusDatasourceVO
    }

    /// Create a new data source
    public func create(body: PlusDatasourceForm) async throws -> PlusApiResultPlusDatasourceVO? {
        let response = try await client.post(ApiPaths.backendPath("/datasource"), body: body)
        return response as? PlusApiResultPlusDatasourceVO
    }

    public func stop(params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/datasource/stop"), body: nil, params: params, headers: headers)
        return response as? PlusApiResultBoolean
    }

    /// Get data sources by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusDatasourceVO? {
        let response = try await client.post(ApiPaths.backendPath("/datasource/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusDatasourceVO
    }

    /// Get all data sources
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusDatasourceVO? {
        let response = try await client.post(ApiPaths.backendPath("/datasource/list/all"), body: body)
        return response as? PlusApiResultListPlusDatasourceVO
    }

    /// Create a chat completion with Datasource
    public func createCompletions(body: ChatCompletionCreateForm, params: [String: Any]? = nil, headers: [String: String]? = nil) async throws -> ChatCompletionChunk? {
        let response = try await client.post(ApiPaths.backendPath("/datasource/chat/completions"), body: body, params: params, headers: headers)
        return response as? ChatCompletionChunk
    }

    /// Get a data source by ID
    public func getById(id: String) async throws -> PlusApiResultPlusDatasourceVO? {
        let response = try await client.get(ApiPaths.backendPath("/datasource/\(id)"))
        return response as? PlusApiResultPlusDatasourceVO
    }

    /// Delete a data source
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/datasource/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
