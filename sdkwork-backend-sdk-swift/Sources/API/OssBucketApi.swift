import Foundation

public class OssBucketApi {
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
