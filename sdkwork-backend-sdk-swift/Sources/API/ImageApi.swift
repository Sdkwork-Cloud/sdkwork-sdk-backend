import Foundation

public class ImageApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update an existing image
    public func update(body: PlusImageForm) async throws -> PlusApiResultPlusImageVO? {
        let response = try await client.put(ApiPaths.backendPath("/image"), body: body)
        return response as? PlusApiResultPlusImageVO
    }

    /// Create a new image
    public func create(body: PlusImageForm) async throws -> PlusApiResultPlusImageVO? {
        let response = try await client.post(ApiPaths.backendPath("/image"), body: body)
        return response as? PlusApiResultPlusImageVO
    }

    /// Get images by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusImageVO? {
        let response = try await client.post(ApiPaths.backendPath("/image/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusImageVO
    }

    /// Get all images
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusImageVO? {
        let response = try await client.post(ApiPaths.backendPath("/image/list/all"), body: body)
        return response as? PlusApiResultListPlusImageVO
    }

    /// Get an image by ID
    public func getById(id: String) async throws -> PlusApiResultPlusImageVO? {
        let response = try await client.get(ApiPaths.backendPath("/image/\(id)"))
        return response as? PlusApiResultPlusImageVO
    }

    /// Delete an image
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/image/\(id)"))
        return response as? PlusApiResultBoolean
    }
}
