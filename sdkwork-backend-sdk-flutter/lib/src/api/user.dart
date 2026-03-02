import '../http/client.dart';
import '../models.dart';

class UserApi {
  final HttpClient _client;
  
  UserApi(this._client);

  /// Update an existing user
  Future<PlusApiResultPlusUserVO?> update(PlusUserForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/user'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserVO ? response : null;
  }

  /// Create a new user
  Future<PlusApiResultPlusUserVO?> create(PlusUserForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/user'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusUserVO ? response : null;
  }

  /// Get users by page
  Future<PlusApiResultPagePlusUserVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/user/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusUserVO ? response : null;
  }

  /// Get all users
  Future<PlusApiResultListPlusUserVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/user/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusUserVO ? response : null;
  }

  /// Get a user by ID
  Future<PlusApiResultPlusUserVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/user/${id}'));
    return response is PlusApiResultPlusUserVO ? response : null;
  }

  /// Delete a user
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/user/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get current user profile
  Future<PlusApiResultPlusUserProfileVO?> getProfile() async {
    final response = await _client.get(ApiPaths.backendPath('/user/profile'));
    return response is PlusApiResultPlusUserProfileVO ? response : null;
  }
}
