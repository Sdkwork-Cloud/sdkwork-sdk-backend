import '../http/client.dart';
import '../models.dart';

class AccountApi {
  final HttpClient _client;
  
  AccountApi(this._client);

  /// Update an existing account
  Future<PlusApiResultPlusAccountVO?> update(PlusAccountForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Create a new account
  Future<PlusApiResultPlusAccountVO?> create(PlusAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Get accounts by page
  Future<PlusApiResultPagePlusAccountVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/account/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAccountVO ? response : null;
  }

  /// Get all accounts
  Future<PlusApiResultListPlusAccountVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAccountVO ? response : null;
  }

  /// Get points account
  Future<PlusApiResultPlusAccountVO?> getPoints(PlusGetAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/get_points'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Get cash account
  Future<PlusApiResultPlusAccountVO?> getCash(PlusGetAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/get_cash'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Get an account by ID
  Future<PlusApiResultPlusAccountVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/account/${id}'));
    return response is PlusApiResultPlusAccountVO ? response : null;
  }

  /// Delete an account
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/account/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
