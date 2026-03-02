import '../http/client.dart';
import '../models.dart';

class AuthenticationApi {
  final HttpClient _client;
  
  AuthenticationApi(this._client);

  /// 重置密码
  Future<PlusApiResultPasswordResetResultVO?> resetPassword(PasswordResetForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/reset_password'), body: body, contentType: 'application/json');
    return response is PlusApiResultPasswordResetResultVO ? response : null;
  }

  /// 请求密码重置
  Future<PlusApiResultPasswordResetResultVO?> requestPasswordReset(PasswordResetRequestForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/request_password_reset'), body: body, contentType: 'application/json');
    return response is PlusApiResultPasswordResetResultVO ? response : null;
  }

  /// 用户注册
  Future<PlusApiResultRegisterResultVO?> register(RegisterForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/register'), body: body, contentType: 'application/json');
    return response is PlusApiResultRegisterResultVO ? response : null;
  }

  /// 刷新访问令牌
  Future<PlusApiResultLoginResultVO?> refreshToken(RefreshTokenForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/refresh_token'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginResultVO ? response : null;
  }

  /// 退出登录
  Future<PlusApiResultVoid?> logout() async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/logout'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 用户登录
  Future<LoginResultVO?> login(LoginForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/login'), body: body, contentType: 'application/json');
    return response is LoginResultVO ? response : null;
  }

  /// 修改密码
  Future<PlusApiResultBoolean?> changePassword(ChangePasswordForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/authentication/change_password'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// 获取当前用户信息
  Future<PlusApiResultUserVO?> getCurrentUser() async {
    final response = await _client.get(ApiPaths.backendPath('/auth/authentication/get_current_user'));
    return response is PlusApiResultUserVO ? response : null;
  }
}
