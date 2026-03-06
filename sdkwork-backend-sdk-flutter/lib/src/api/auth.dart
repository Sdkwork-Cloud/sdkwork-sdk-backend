import '../http/client.dart';
import '../models.dart';

class AuthApi {
  final HttpClient _client;
  
  AuthApi(this._client);

  /// Verify phone
  Future<PlusApiResultVerificationVO?> verifyPhone(PhoneVerificationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/verification/verify_phone'), body: body, contentType: 'application/json');
    return response is PlusApiResultVerificationVO ? response : null;
  }

  /// Verify email
  Future<PlusApiResultVerificationVO?> verifyEmail(EmailVerificationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/verification/verify_email'), body: body, contentType: 'application/json');
    return response is PlusApiResultVerificationVO ? response : null;
  }

  /// Send verification code
  Future<PlusApiResultBoolean?> sendVerificationCode(SendVerificationCodeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/verification/send_code'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Generate login QR code
  Future<PlusApiResultQrCodeVO?> generateQrCode() async {
    final response = await _client.post(ApiPaths.backendPath('/auth/qrcode/generate'));
    return response is PlusApiResultQrCodeVO ? response : null;
  }

  /// Confirm QR login
  Future<PlusApiResultVoid?> confirmQrCodeLogin(QrCodeConfirmForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/qrcode/confirm'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// Get OAuth authorization URL
  Future<PlusApiResultOAuthLoginResponseVO?> getAuthUrl(OAuthLoginRequestForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/oauth/get_auth_url'), body: body, contentType: 'application/json');
    return response is PlusApiResultOAuthLoginResponseVO ? response : null;
  }

  /// Get OAuth authorization URL
  Future<PlusApiResultOAuthLoginResponseVO?> createGetAuthUrl(OAuthLoginRequestForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/oauth/authorize'), body: body, contentType: 'application/json');
    return response is PlusApiResultOAuthLoginResponseVO ? response : null;
  }

  /// Handle OAuth callback
  Future<PlusApiResultLoginResultVO?> handleCallback(OAuthCallbackForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/oauth/callback'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginResultVO ? response : null;
  }

  /// Check role
  Future<PlusApiResultBoolean?> hasRole(RoleCheckForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authorization/has_role'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Check permission
  Future<PlusApiResultBoolean?> hasPermission(PermissionCheckForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authorization/has_permission'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Reset password
  Future<PlusApiResultPasswordResetResultVO?> resetPassword(PasswordResetForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/reset_password'), body: body, contentType: 'application/json');
    return response is PlusApiResultPasswordResetResultVO ? response : null;
  }

  /// Request password reset
  Future<PlusApiResultPasswordResetResultVO?> requestPasswordReset(PasswordResetRequestForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/request_password_reset'), body: body, contentType: 'application/json');
    return response is PlusApiResultPasswordResetResultVO ? response : null;
  }

  /// Register
  Future<PlusApiResultRegisterResultVO?> register(RegisterForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/register'), body: body, contentType: 'application/json');
    return response is PlusApiResultRegisterResultVO ? response : null;
  }

  /// Refresh token
  Future<PlusApiResultLoginResultVO?> refreshToken(RefreshTokenForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/refresh_token'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginResultVO ? response : null;
  }

  /// Logout
  Future<PlusApiResultVoid?> logout() async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/logout'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// Login
  Future<LoginResultVO?> login(LoginForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/login'), body: body, contentType: 'application/json');
    return response is LoginResultVO ? response : null;
  }

  /// Change password
  Future<PlusApiResultBoolean?> changePassword(ChangePasswordForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/change_password'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get current tenant/organization access token
  Future<PlusApiResultCurrentAccessTokenVO?> getCurrentAccessToken(GetCurrentAccessTokenForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/access_token/current'), body: body, contentType: 'application/json');
    return response is PlusApiResultCurrentAccessTokenVO ? response : null;
  }

  /// Check QR code status
  Future<PlusApiResultQrCodeStatusVO?> checkQrCodeStatus(String qrKey) async {
    final response = await _client.get(ApiPaths.backendPath('/auth/qrcode/status/${qrKey}'));
    return response is PlusApiResultQrCodeStatusVO ? response : null;
  }

  /// Get roles
  Future<PlusApiResultListString?> getRoles() async {
    final response = await _client.get(ApiPaths.backendPath('/auth/authorization/roles'));
    return response is PlusApiResultListString ? response : null;
  }

  /// Get permissions
  Future<PlusApiResultListString?> getPermissions() async {
    final response = await _client.get(ApiPaths.backendPath('/auth/authorization/permissions'));
    return response is PlusApiResultListString ? response : null;
  }

  /// Get current user
  Future<PlusApiResultUserVO?> getCurrentUser() async {
    final response = await _client.get(ApiPaths.backendPath('/auth/authentication/get_current_user'));
    return response is PlusApiResultUserVO ? response : null;
  }
}
