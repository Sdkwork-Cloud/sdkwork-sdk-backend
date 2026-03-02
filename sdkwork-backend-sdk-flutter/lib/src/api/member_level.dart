import '../http/client.dart';
import '../models.dart';

class MemberLevelApi {
  final HttpClient _client;
  
  MemberLevelApi(this._client);

  /// Update an existing member level
  Future<PlusApiResultPlusMemberLevelVO?> update(PlusMemberLevelForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/member/level'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberLevelVO ? response : null;
  }

  /// Create a new member level
  Future<PlusApiResultPlusMemberLevelVO?> create(PlusMemberLevelForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/member/level'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberLevelVO ? response : null;
  }

  /// Get member levels by page
  Future<PlusApiResultPagePlusMemberLevelVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/member/level/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusMemberLevelVO ? response : null;
  }

  /// Get all member levels
  Future<PlusApiResultListPlusMemberLevelVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/member/level/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusMemberLevelVO ? response : null;
  }

  /// Get a member level by ID
  Future<PlusApiResultPlusMemberLevelVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/member/level/${id}'));
    return response is PlusApiResultPlusMemberLevelVO ? response : null;
  }

  /// Delete a member level
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/member/level/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
