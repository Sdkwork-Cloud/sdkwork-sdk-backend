import Foundation

public class DiskApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing file disk
    public func update(body: PlusDiskForm) async throws -> PlusApiResultPlusDiskVO? {
        let response = try await client.put(ApiPaths.backendPath("/disk"), body: body)
        return response as? PlusApiResultPlusDiskVO
    }

    /// Create a new file disk
    public func create(body: PlusDiskForm) async throws -> PlusApiResultPlusDiskVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk"), body: body)
        return response as? PlusApiResultPlusDiskVO
    }

    /// Update an existing disk member
    public func updateMember(body: PlusDiskMemberForm) async throws -> PlusApiResultPlusDiskMemberVO? {
        let response = try await client.put(ApiPaths.backendPath("/disk/member"), body: body)
        return response as? PlusApiResultPlusDiskMemberVO
    }

    /// Create a new disk member
    public func createMember(body: PlusDiskMemberForm) async throws -> PlusApiResultPlusDiskMemberVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/member"), body: body)
        return response as? PlusApiResultPlusDiskMemberVO
    }

    /// Get disk members by page
    public func createListByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusDiskMemberVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/member/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusDiskMemberVO
    }

    /// Get all disk members
    public func createListAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusDiskMemberVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/member/list/all"), body: body)
        return response as? PlusApiResultListPlusDiskMemberVO
    }

    /// Get file disks by page
    public func createListByPageDisk(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusDiskVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusDiskVO
    }

    /// Get all file disks
    public func createListAllEntitiesDisk(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusDiskVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/list/all"), body: body)
        return response as? PlusApiResultListPlusDiskVO
    }

    /// List files
    public func getListFiles(params: [String: Any]? = nil) async throws -> PlusApiResultFileListVO? {
        let response = try await client.get(ApiPaths.backendPath("/disk/files"), params: params)
        return response as? PlusApiResultFileListVO
    }

    /// Upload file
    public func createUploadFile(body: CreateUploadFileRequest? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/files"), body: body, params: params, headers: nil, contentType: "multipart/form-data")
        return response as? PlusApiResultFileItemVO
    }

    /// Get a file disk by ID
    public func getById(id: String) async throws -> PlusApiResultPlusDiskVO? {
        let response = try await client.get(ApiPaths.backendPath("/disk/\(id)"))
        return response as? PlusApiResultPlusDiskVO
    }

    /// Delete a file disk
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/disk/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get a disk member by ID
    public func getByIdMember(id: String) async throws -> PlusApiResultPlusDiskMemberVO? {
        let response = try await client.get(ApiPaths.backendPath("/disk/member/\(id)"))
        return response as? PlusApiResultPlusDiskMemberVO
    }

    /// Delete a disk member
    public func deleteMember(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/disk/member/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get file
    public func getFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.get(ApiPaths.backendPath("/disk/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// Delete file
    public func deleteFile(fileId: String) async throws -> PlusApiResultFileItemVO? {
        let response = try await client.delete(ApiPaths.backendPath("/disk/files/\(fileId)"))
        return response as? PlusApiResultFileItemVO
    }

    /// Get file content
    public func getFileContent(fileId: String) async throws -> String? {
        let response = try await client.get(ApiPaths.backendPath("/disk/files/\(fileId)/content"))
        return response as? String
    }
}
