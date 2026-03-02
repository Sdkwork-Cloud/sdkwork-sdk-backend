import Foundation

public class FilePartApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing file part
    public func update(body: PlusFilePartForm) async throws -> PlusApiResultPlusFilePartVO? {
        let response = try await client.put(ApiPaths.backendPath("/file/part"), body: body)
        return response as? PlusApiResultPlusFilePartVO
    }

    /// Create a new file part
    public func create(body: PlusFilePartForm) async throws -> PlusApiResultPlusFilePartVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/part"), body: body)
        return response as? PlusApiResultPlusFilePartVO
    }

    /// Get file parts by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusFilePartVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/part/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusFilePartVO
    }

    /// Get all file parts
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusFilePartVO? {
        let response = try await client.post(ApiPaths.backendPath("/file/part/list/all"), body: body)
        return response as? PlusApiResultListPlusFilePartVO
    }

    /// Get a file part by ID
    public func getById(id: String) async throws -> PlusApiResultPlusFilePartVO? {
        let response = try await client.get(ApiPaths.backendPath("/file/part/\(id)"))
        return response as? PlusApiResultPlusFilePartVO
    }

    /// Delete a file part
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/file/part/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
