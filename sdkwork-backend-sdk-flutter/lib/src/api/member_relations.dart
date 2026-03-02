import '../http/client.dart';
import '../models.dart';

class MemberRelationsApi {
  final HttpClient _client;
  
  MemberRelationsApi(this._client);

  /// Update member relation
  Future<PlusApiResultPlusMemberRelationsVO?> update(PlusMemberRelationsForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/organization/member-relations'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberRelationsVO ? response : null;
  }

  /// Create member relation
  Future<PlusApiResultPlusMemberRelationsVO?> create(PlusMemberRelationsForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/member-relations'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMemberRelationsVO ? response : null;
  }

  /// Get member relations by page
  Future<PlusApiResultPagePlusMemberRelationsVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/member-relations/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusMemberRelationsVO ? response : null;
  }

  /// Get all member relations
  Future<PlusApiResultListPlusMemberRelationsVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/member-relations/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusMemberRelationsVO ? response : null;
  }

  /// Get member relation by ID
  Future<PlusApiResultPlusMemberRelationsVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization/member-relations/${id}'));
    return response is PlusApiResultPlusMemberRelationsVO ? response : null;
  }

  /// Delete member relation
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/organization/member-relations/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
