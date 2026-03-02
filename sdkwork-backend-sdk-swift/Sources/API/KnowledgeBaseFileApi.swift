import Foundation

public class KnowledgeBaseFileApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取文件列表
    public func listFiles(params: [String: Any]? = nil) async throws -> PlusApiResultFileListVO? {
        let response = try await client.get(ApiPaths.backendPath("/knowledge_base/files"), params: params)
        return response as? PlusApiResultFileListVO
    }

    /// 上传文件
    public func uploadFile(body: UploadFilePostRequest? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/knowledge_base/files"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? PlusApiResultFileItemVO
    }

    /// 获取文件列表
    public func getListFiles(params: [String: Any]? = nil) async throws -> PlusApiResultFileListVO? {
        let response = try await client.get(ApiPaths.backendPath("/disk/files"), params: params)
        return response as? PlusApiResultFileListVO
    }

    /// 上传文件
    public func createUploadFile(body: CreateUploadFileRequest? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/files"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? PlusApiResultFileItemVO
    }

    /// 获取单个文件信息
    public func getFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/knowledge_base/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// 删除文件
    public func deleteFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.delete(ApiPaths.backendPath("/knowledge_base/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// 获取文件内容
    public func getFileContent(fileId: String) async throws -> String? {
        let response = try await client.get(ApiPaths.backendPath("/knowledge_base/files/\(fileId)/content"))
        return response as? String
    }

    /// 获取单个文件信息
    public func getFileDisk(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/disk/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// 删除文件
    public func deleteFileDisk(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.delete(ApiPaths.backendPath("/disk/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// 获取文件内容
    public func getFileContentDisk(fileId: String) async throws -> String? {
        let response = try await client.get(ApiPaths.backendPath("/disk/files/\(fileId)/content"))
        return response as? String
    }
}
