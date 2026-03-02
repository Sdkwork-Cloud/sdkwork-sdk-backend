import '../http/client.dart';
import '../models.dart';

class UserCardApi {
  final HttpClient _client;
  
  UserCardApi(this._client);

  /// Update user-card binding
  Future<PlusApiResultPlusUserCardVO?> update(PlusUserCardForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCardVO ? response : null;
  }

  /// Create user-card binding
  Future<PlusApiResultPlusUserCardVO?> create(PlusUserCardForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserCardVO ? response : null;
  }

  /// Get user-card bindings by page
  Future<PlusApiResultPagePlusUserCardVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/card/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserCardVO ? response : null;
  }

  /// Get all user-card bindings
  Future<PlusApiResultListPlusUserCardVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/card/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserCardVO ? response : null;
  }

  /// Get user-card binding by ID
  Future<PlusApiResultPlusUserCardVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/card/${id}'));
    return response is PlusApiResultPlusUserCardVO ? response : null;
  }

  /// Delete user-card binding
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/card/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
