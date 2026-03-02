import '../http/client.dart';
import '../models.dart';

class DiskMemberApi {
  final HttpClient _client;
  
  DiskMemberApi(this._client);

  /// Update an existing disk member
  Future<PlusApiResultPlusDiskMemberVO?> update(PlusDiskMemberForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/disk/member'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDiskMemberVO ? response : null;
  }

  /// Create a new disk member
  Future<PlusApiResultPlusDiskMemberVO?> create(PlusDiskMemberForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/member'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDiskMemberVO ? response : null;
  }

  /// Get disk members by page
  Future<PlusApiResultPagePlusDiskMemberVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/member/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusDiskMemberVO ? response : null;
  }

  /// Get all disk members
  Future<PlusApiResultListPlusDiskMemberVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/member/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusDiskMemberVO ? response : null;
  }

  /// Get a disk member by ID
  Future<PlusApiResultPlusDiskMemberVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/member/${id}'));
    return response is PlusApiResultPlusDiskMemberVO ? response : null;
  }

  /// Delete a disk member
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/disk/member/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
