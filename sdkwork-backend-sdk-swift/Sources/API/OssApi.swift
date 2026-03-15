import Foundation

public class OssApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing OSS bucket
    public func update(body: PlusOssBucketForm) async throws -> PlusApiResultPlusOssBucketVO? {
        let response = try await client.put(ApiPaths.backendPath("/oss/bucket"), body: body)
        return response as? PlusApiResultPlusOssBucketVO
    }

    /// Create a new OSS bucket
    public func create(body: PlusOssBucketForm) async throws -> PlusApiResultPlusOssBucketVO? {
        let response = try await client.post(ApiPaths.backendPath("/oss/bucket"), body: body)
        return response as? PlusApiResultPlusOssBucketVO
    }

    /// List files
    public func listFiles(params: [String: Any]? = nil) async throws -> PlusApiResultFileListVO? {
        let response = try await client.get(ApiPaths.backendPath("/oss/files"), params: params)
        return response as? PlusApiResultFileListVO
    }

    /// Upload file
    public func uploadFile(body: UploadFileRequest? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultFileItemVO? {
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

    /// Get OSS buckets by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusOssBucketVO? {
        let response = try await client.post(ApiPaths.backendPath("/oss/bucket/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusOssBucketVO
    }

    /// Get all OSS buckets
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusOssBucketVO? {
        let response = try await client.post(ApiPaths.backendPath("/oss/bucket/list/all"), body: body)
        return response as? PlusApiResultListPlusOssBucketVO
    }

    /// Get file
    public func getFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/oss/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// Delete file
    public func deleteFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.delete(ApiPaths.backendPath("/oss/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// Get file content
    public func getFileContent(fileId: String) async throws -> String? {
        let response = try await client.get(ApiPaths.backendPath("/oss/files/\(fileId)/content"))
        return response as? String
    }

    /// Get an OSS bucket by ID
    public func getById(id: String) async throws -> PlusApiResultPlusOssBucketVO? {
        let response = try await client.get(ApiPaths.backendPath("/oss/bucket/\(id)"))
        return response as? PlusApiResultPlusOssBucketVO
    }

    /// Delete an OSS bucket
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/oss/bucket/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
