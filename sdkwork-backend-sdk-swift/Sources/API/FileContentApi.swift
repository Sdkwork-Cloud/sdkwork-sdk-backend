import Foundation

public class FileContentApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update file content
    public func update(body: PlusFileContentForm) async throws -> PlusApiResultPlusFileContentVO? {
        let response = try await client.put(ApiPaths.backendPath("/file/content"), body: body)
        return response as? PlusApiResultPlusFileContentVO
    }

    /// Create file content
    public func create(body: PlusFileContentForm) async throws -> PlusApiResultPlusFileContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/content"), body: body)
        return response as? PlusApiResultPlusFileContentVO
    }

    /// Get file contents by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusFileContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/content/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusFileContentVO
    }

    /// Get all file contents
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusFileContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/content/list/all"), body: body)
        return response as? PlusApiResultListPlusFileContentVO
    }

    /// Get file content by ID
    public func getById(id: String) async throws -> PlusApiResultPlusFileContentVO? {
        let response = try await client.get(ApiPaths.backendPath("/file/content/\(id)"))
        return response as? PlusApiResultPlusFileContentVO
    }

    /// Delete file content
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/file/content/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
