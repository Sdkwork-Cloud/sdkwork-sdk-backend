import Foundation

public class AuthenticationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 重置密码
    public func resetPassword(body: PasswordResetForm) async throws -> PlusApiResultPasswordResetResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/reset_password"), body: body)
        return response as? PlusApiResultPasswordResetResultVO
    }

    /// 请求密码重置
    public func requestPasswordReset(body: PasswordResetRequestForm) async throws -> PlusApiResultPasswordResetResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/request_password_reset"), body: body)
        return response as? PlusApiResultPasswordResetResultVO
    }

    /// 用户注册
    public func register(body: RegisterForm) async throws -> PlusApiResultRegisterResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/register"), body: body)
        return response as? PlusApiResultRegisterResultVO
    }

    /// 刷新访问令牌
    public func refreshToken(body: RefreshTokenForm) async throws -> PlusApiResultLoginResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/refresh_token"), body: body)
        return response as? PlusApiResultLoginResultVO
    }

    /// 退出登录
    public func logout() async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/logout"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 用户登录
    public func login(body: LoginForm) async throws -> LoginResultVO? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/login"), body: body)
        return response as? LoginResultVO
    }

    /// 修改密码
    public func changePassword(body: ChangePasswordForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.backendPath("/auth/authentication/change_password"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// 获取当前用户信息
    public func getCurrentUser() async throws -> PlusApiResultUserVO? {
        let response = try await client.get(ApiPaths.backendPath("/auth/authentication/get_current_user"))
        return response as? PlusApiResultUserVO
    }
}
