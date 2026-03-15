import '../http/client.dart';
import '../models.dart';

class MemberApi {
  final HttpClient _client;
  
  MemberApi(this._client);

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

  /// Update an existing member card
  Future<PlusApiResultPlusMemberCardVO?> updateCard(PlusMemberCardForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/member/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberCardVO ? response : null;
  }

  /// Create a new member card
  Future<PlusApiResultPlusMemberCardVO?> createCard(PlusMemberCardForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/member/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberCardVO ? response : null;
  }

  /// Get member levels by page
  Future<PlusApiResultPagePlusMemberLevelVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/member/level/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusMemberLevelVO ? response : null;
  }

  /// Get all member levels
  Future<PlusApiResultListPlusMemberLevelVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/member/level/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusMemberLevelVO ? response : null;
  }

  /// Get member cards by page
  Future<PlusApiResultPagePlusMemberCardVO?> createListByPageCard(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/member/card/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusMemberCardVO ? response : null;
  }

  /// Get all member cards
  Future<PlusApiResultListPlusMemberCardVO?> createListAllEntitiesCard(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/member/card/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusMemberCardVO ? response : null;
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

  /// Get a member card by ID
  Future<PlusApiResultPlusMemberCardVO?> getByIdCard(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/member/card/${id}'));
    return response is PlusApiResultPlusMemberCardVO ? response : null;
  }

  /// Delete a member card
  Future<PlusApiResultBoolean?> deleteCard(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/member/card/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
