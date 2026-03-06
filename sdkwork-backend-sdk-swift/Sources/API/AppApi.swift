import Foundation

public class AppApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Update application
    public func update(body: PlusAppForm) async throws -> PlusApiResultPlusAppVO? {
        let response = try await client.put(ApiPaths.backendPath("/app"), body: body)
        return response as? PlusApiResultPlusAppVO
    }

    /// Create application
    public func create(body: PlusAppForm) async throws -> PlusApiResultPlusAppVO? {
        let response = try await client.post(ApiPaths.backendPath("/app"), body: body)
        return response as? PlusApiResultPlusAppVO
    }

    /// Get applications by page
    public func listByPage(body: QueryListForm? = nil, params: [String: Any]? = nil) async throws -> PlusApiResultPagePlusAppVO? {
        let response = try await client.post(ApiPaths.backendPath("/app/list"), body: body, params: params)
        return response as? PlusApiResultPagePlusAppVO
    }

    /// Get all applications
    public func listAllEntities(body: QueryListForm? = nil) async throws -> PlusApiResultListPlusAppVO? {
        let response = try await client.post(ApiPaths.backendPath("/app/list/all"), body: body)
        return response as? PlusApiResultListPlusAppVO
    }

    /// Get app SDK config
    public func getSdkConfig(body: CreateJsapiSignatureForm) async throws -> PlusApiResultAppSdkConfigVO? {
        let response = try await client.post(ApiPaths.backendPath("/app/get_sdk_config"), body: body)
        return response as? PlusApiResultAppSdkConfigVO
    }

    /// Get application by ID
    public func getById(id: String) async throws -> PlusApiResultPlusAppVO? {
        let response = try await client.get(ApiPaths.backendPath("/app/\(id)"))
        return response as? PlusApiResultPlusAppVO
    }

    /// Delete application
    public func delete(id: String) async throws -> PlusApiResultBoolean? {
        let response = try await client.delete(ApiPaths.backendPath("/app/\(id)"))
        return response as? PlusApiResultBoolean
    }

    /// Get app info
    public func getAppInfo() async throws -> PlusApiResultAppInfoVO? {
        let response = try await client.get(ApiPaths.backendPath("/app/info"))
        return response as? PlusApiResultAppInfoVO
    }
}
