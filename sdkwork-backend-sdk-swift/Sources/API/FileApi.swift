import Foundation

public class FileApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update existing file metadata
    public func update(body: PlusFileForm) async throws -> PlusApiResultPlusFileVO? {
        let response = try await client.put(ApiPaths.backendPath("/file"), body: body)
        return response as? PlusApiResultPlusFileVO
    }

    /// Create a new file metadata
    public func create(body: PlusFileForm) async throws -> PlusApiResultPlusFileVO? {
        let response = try await client.post(ApiPaths.backendPath("/file"), body: body)
        return response as? PlusApiResultPlusFileVO
    }

    /// Update an existing file part
    public func updatePart(body: PlusFilePartForm) async throws -> PlusApiResultPlusFilePartVO? {
        let response = try await client.put(ApiPaths.backendPath("/file/part"), body: body)
        return response as? PlusApiResultPlusFilePartVO
    }

    /// Create a new file part
    public func createPart(body: PlusFilePartForm) async throws -> PlusApiResultPlusFilePartVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/part"), body: body)
        return response as? PlusApiResultPlusFilePartVO
    }

    /// Update file content
    public func updateContent(body: PlusFileContentForm) async throws -> PlusApiResultPlusFileContentVO? {
        let response = try await client.put(ApiPaths.backendPath("/file/content"), body: body)
        return response as? PlusApiResultPlusFileContentVO
    }

    /// Create file content
    public func createContent(body: PlusFileContentForm) async throws -> PlusApiResultPlusFileContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/content"), body: body)
        return response as? PlusApiResultPlusFileContentVO
    }

    /// Get file parts by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusFilePartVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/part/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusFilePartVO
    }

    /// Get all file parts
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusFilePartVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/part/list/all"), body: body)
        return response as? PlusApiResultListPlusFilePartVO
    }

    /// Get file metadata by page
    public func createListByPageFile(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusFileVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusFileVO
    }

    /// Get all file metadata
    public func createListAllEntitiesFile(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusFileVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/list/all"), body: body)
        return response as? PlusApiResultListPlusFileVO
    }

    /// Get Tree
    public func getTree(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultSetPlusTreeNodePlusFileVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/get_tree"), body: body, params: params)
        return response as? PlusApiResultSetPlusTreeNodePlusFileVO
    }

    /// Get file contents by page
    public func createListByPageContent(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusFileContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/content/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusFileContentVO
    }

    /// Get all file contents
    public func createListAllEntitiesContent(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusFileContentVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/content/list/all"), body: body)
        return response as? PlusApiResultListPlusFileContentVO
    }

    /// Get file metadata by ID
    public func getById(id: String) async throws -> PlusApiResultPlusFileVO? {
        let response = try await client.get(ApiPaths.backendPath("/file/\(id)"))
        return response as? PlusApiResultPlusFileVO
    }

    /// Delete file metadata
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/file/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a file part by ID
    public func getByIdPart(id: String) async throws -> PlusApiResultPlusFilePartVO? {
        let response = try await client.get(ApiPaths.backendPath("/file/part/\(id)"))
        return response as? PlusApiResultPlusFilePartVO
    }

    /// Delete a file part
    public func deletePart(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/file/part/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get file content by ID
    public func getByIdContent(id: String) async throws -> PlusApiResultPlusFileContentVO? {
        let response = try await client.get(ApiPaths.backendPath("/file/content/\(id)"))
        return response as? PlusApiResultPlusFileContentVO
    }

    /// Delete file content
    public func deleteContent(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/file/content/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
