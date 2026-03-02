import '../http/client.dart';
import '../models.dart';

class UserOauthAccountApi {
  final HttpClient _client;
  
  UserOauthAccountApi(this._client);

  /// Update user OAuth account
  Future<PlusApiResultPlusUserOAuthAccountVO?> update(PlusUserOAuthAccountForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user/oauth/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserOAuthAccountVO ? response : null;
  }

  /// Create user OAuth account
  Future<PlusApiResultPlusUserOAuthAccountVO?> create(PlusUserOAuthAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/oauth/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserOAuthAccountVO ? response : null;
  }

  /// Get user OAuth accounts by page
  Future<PlusApiResultPagePlusUserOAuthAccountVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/oauth/account/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserOAuthAccountVO ? response : null;
  }

  /// Get all user OAuth accounts
  Future<PlusApiResultListPlusUserOAuthAccountVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/oauth/account/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserOAuthAccountVO ? response : null;
  }

  /// Get user OAuth account by ID
  Future<PlusApiResultPlusUserOAuthAccountVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/oauth/account/${id}'));
    return response is PlusApiResultPlusUserOAuthAccountVO ? response : null;
  }

  /// Delete user OAuth account
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/oauth/account/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
