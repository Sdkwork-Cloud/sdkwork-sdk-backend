import '../http/client.dart';
import '../models.dart';

class MemberCardApi {
  final HttpClient _client;
  
  MemberCardApi(this._client);

  /// Update an existing member card
  Future<PlusApiResultPlusMemberCardVO?> update(PlusMemberCardForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/member/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberCardVO ? response : null;
  }

  /// Create a new member card
  Future<PlusApiResultPlusMemberCardVO?> create(PlusMemberCardForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/member/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberCardVO ? response : null;
  }

  /// Get member cards by page
  Future<PlusApiResultPagePlusMemberCardVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/member/card/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusMemberCardVO ? response : null;
  }

  /// Get all member cards
  Future<PlusApiResultListPlusMemberCardVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/member/card/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusMemberCardVO ? response : null;
  }

  /// Get a member card by ID
  Future<PlusApiResultPlusMemberCardVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/member/card/${id}'));
    return response is PlusApiResultPlusMemberCardVO ? response : null;
  }

  /// Delete a member card
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/member/card/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
