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

    /// 获取文件列表
    public func listFiles(params: [String: Any]? = nil) async throws -> PlusApiResultFileListVO? {
        let response = try await client.get(ApiPaths.backendPath("/oss/files"), params: params)
        return response as? PlusApiResultFileListVO
    }

    /// 上传文件
    public func upload(body: UploadFileRequest? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/oss/files"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? PlusApiResultFileItemVO
    }

    /// Get upload temporary session
    public func getTempSession(body: PlusGetTempSessionForm) async throws -> PlusApiResultPlusTempSessionVO? {
        let response = try await client.post(ApiPaths.backendPath("/oss/files/temp_session"), body: body)
        return response as? PlusApiResultPlusTempSessionVO
    }

    /// Generate presigned URL
    public func getPresignedUrl(body: PlusGetPresignedUrlForm) async throws -> PlusApiResultGetUrlResult? {
        let response = try await client.post(ApiPaths.backendPath("/oss/files/get_presigned_url"), body: body)
        return response as? PlusApiResultGetUrlResult
    }

    /// Upload file
    public func createFiles(body: PlusUploadForm) async throws -> PlusApiResultPlusFileVO? {
        let response = try await client.post(ApiPaths.backendPath("/oss/files/create"), body: body)
        return response as? PlusApiResultPlusFileVO
    }

    /// Get file metadata by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusFileVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusFileVO
    }

    /// Get all file metadata
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusFileVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/list/all"), body: body)
        return response as? PlusApiResultListPlusFileVO
    }

    /// Get Tree
    public func getTree(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultSetPlusTreeNodePlusFileVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/get_tree"), body: body, params: params)
        return response as? PlusApiResultSetPlusTreeNodePlusFileVO
    }

    /// 获取单个文件信息
    public func getFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/oss/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// 删除文件
    public func deleteFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.delete(ApiPaths.backendPath("/oss/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// 获取文件内容
    public func getFileContent(fileId: String) async throws -> String? {
        let response = try await client.get(ApiPaths.backendPath("/oss/files/\(fileId)/content"))
        return response as? String
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
}
