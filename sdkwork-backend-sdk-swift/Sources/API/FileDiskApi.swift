import Foundation

public class FileDiskApi {
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

    /// Get file disks by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusDiskVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusDiskVO
    }

    /// Get all file disks
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusDiskVO? {
        let response = try await client.post(ApiPaths.backendPath("/disk/list/all"), body: body)
        return response as? PlusApiResultListPlusDiskVO
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
}
