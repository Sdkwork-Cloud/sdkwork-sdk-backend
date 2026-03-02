import Foundation

public class AppApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get app SDK config
    public func getSdkConfig(body: CreateJsapiSignatureForm) async throws -> PlusApiResultAppSdkConfigVO? {
        let response = try await client.post(ApiPaths.backendPath("/app/get_sdk_config"), body: body)
        return response as? PlusApiResultAppSdkConfigVO
    }

    /// Get app info
    public func getAppInfo() async throws -> PlusApiResultAppInfoVO? {
        let response = try await client.get(ApiPaths.backendPath("/app/info"))
        return response as? PlusApiResultAppInfoVO
    }
}
