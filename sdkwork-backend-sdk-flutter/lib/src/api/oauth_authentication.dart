import '../http/client.dart';
import '../models.dart';

class OauthAuthenticationApi {
  final HttpClient _client;
  
  OauthAuthenticationApi(this._client);

  /// Get OAuth authorization URL
  Future<OAuthLoginResponse?> getAuthUrl(OAuthLoginRequestForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/oauth/get_auth_url'), body: body, contentType: 'application/json');
    return response is OAuthLoginResponse ? response : null;
  }

  /// Get OAuth authorization URL
  Future<OAuthLoginResponse?> createGetAuthUrl(OAuthLoginRequestForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/oauth/authorize'), body: body, contentType: 'application/json');
    return response is OAuthLoginResponse ? response : null;
  }

  /// Handle OAuth callback
  Future<TokenDTO?> handleCallback(OAuthCallbackForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/auth/oauth/callback'), body: body, contentType: 'application/json');
    return response is TokenDTO ? response : null;
  }
}
