import Foundation

public class AuthApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Verify phone
    public func verifyPhone(body: PhoneVerificationForm) async throws -> PlusApiResultVerificationVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/verification/verify_phone"), body: body)
        return response as? PlusApiResultVerificationVO
    }

    /// Verify email
    public func verifyEmail(body: EmailVerificationForm) async throws -> PlusApiResultVerificationVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/verification/verify_email"), body: body)
        return response as? PlusApiResultVerificationVO
    }

    /// Send verification code
    public func sendVerificationCode(body: SendVerificationCodeForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/auth/verification/send_code"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Generate login QR code
    public func generateQrCode() async throws -> PlusApiResultQrCodeVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/qrcode/generate"), body: nil)
        return response as? PlusApiResultQrCodeVO
    }

    /// Confirm QR login
    public func confirmQrCodeLogin(body: QrCodeConfirmForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.backendPath("/auth/qrcode/confirm"), body: body)
        return response as? PlusApiResultVoid
    }

    /// Get OAuth authorization URL
    public func getAuthUrl(body: OAuthLoginRequestForm) async throws -> PlusApiResultOAuthLoginResponseVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/oauth/get_auth_url"), body: body)
        return response as? PlusApiResultOAuthLoginResponseVO
    }

    /// Get OAuth authorization URL
    public func createGetAuthUrl(body: OAuthLoginRequestForm) async throws -> PlusApiResultOAuthLoginResponseVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/oauth/authorize"), body: body)
        return response as? PlusApiResultOAuthLoginResponseVO
    }

    /// Handle OAuth callback
    public func handleCallback(body: OAuthCallbackForm) async throws -> PlusApiResultLoginResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/oauth/callback"), body: body)
        return response as? PlusApiResultLoginResultVO
    }

    /// Check role
    public func hasRole(body: RoleCheckForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authorization/has_role"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Check permission
    public func hasPermission(body: PermissionCheckForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authorization/has_permission"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Reset password
    public func resetPassword(body: PasswordResetForm) async throws -> PlusApiResultPasswordResetResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/reset_password"), body: body)
        return response as? PlusApiResultPasswordResetResultVO
    }

    /// Request password reset
    public func requestPasswordReset(body: PasswordResetRequestForm) async throws -> PlusApiResultPasswordResetResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/request_password_reset"), body: body)
        return response as? PlusApiResultPasswordResetResultVO
    }

    /// Register
    public func register(body: RegisterForm) async throws -> PlusApiResultRegisterResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/register"), body: body)
        return response as? PlusApiResultRegisterResultVO
    }

    /// Refresh token
    public func refreshToken(body: RefreshTokenForm) async throws -> PlusApiResultLoginResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/refresh_token"), body: body)
        return response as? PlusApiResultLoginResultVO
    }

    /// Logout
    public func logout() async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/logout"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// Login
    public func login(body: LoginForm) async throws -> LoginResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/login"), body: body)
        return response as? LoginResultVO
    }

    /// Change password
    public func changePassword(body: ChangePasswordForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/change_password"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// Get current tenant/organization access token
    public func getCurrentAccessToken(body: GetCurrentAccessTokenForm) async throws -> PlusApiResultCurrentAccessTokenVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/access_token/current"), body: body)
        return response as? PlusApiResultCurrentAccessTokenVO
    }

    /// Check QR code status
    public func checkQrCodeStatus(qrKey: String) async throws -> PlusApiResultQrCodeStatusVO? {
        let response = try await client.get(ApiPaths.backendPath("/auth/qrcode/status/\(qrKey)"))
        return response as? PlusApiResultQrCodeStatusVO
    }

    /// Get roles
    public func getRoles() async throws -> PlusApiResultListString? {
        let response = try await client.get(ApiPaths.backendPath("/auth/authorization/roles"))
        return response as? PlusApiResultListString
    }

    /// Get permissions
    public func getPermissions() async throws -> PlusApiResultListString? {
        let response = try await client.get(ApiPaths.backendPath("/auth/authorization/permissions"))
        return response as? PlusApiResultListString
    }

    /// Get current user
    public func getCurrentUser() async throws -> PlusApiResultUserVO? {
        let response = try await client.get(ApiPaths.backendPath("/auth/authentication/get_current_user"))
        return response as? PlusApiResultUserVO
    }
}
