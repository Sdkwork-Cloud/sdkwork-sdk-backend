import Foundation

public class OauthAuthenticationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get OAuth authorization URL
    public func getAuthUrl(body: OAuthLoginRequestForm) async throws -> OAuthLoginResponse? {
        let response = try await client.post(ApiPaths.backendPath("/auth/oauth/get_auth_url"), body: body)
        return response as? OAuthLoginResponse
    }

    /// Get OAuth authorization URL
    public func createGetAuthUrl(body: OAuthLoginRequestForm) async throws -> OAuthLoginResponse? {
        let response = try await client.post(ApiPaths.backendPath("/auth/oauth/authorize"), body: body)
        return response as? OAuthLoginResponse
    }

    /// Handle OAuth callback
    public func handleCallback(body: OAuthCallbackForm) async throws -> TokenDTO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/oauth/callback"), body: body)
        return response as? TokenDTO
    }
}
