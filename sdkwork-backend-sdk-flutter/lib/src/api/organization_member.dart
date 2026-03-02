import '../http/client.dart';
import '../models.dart';

class OrganizationMemberApi {
  final HttpClient _client;
  
  OrganizationMemberApi(this._client);

  /// Update organization member
  Future<PlusApiResultPlusOrganizationMemberVO?> update(PlusOrganizationMemberForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/organization-member'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrganizationMemberVO ? response : null;
  }

  /// Create organization member
  Future<PlusApiResultPlusOrganizationMemberVO?> create(PlusOrganizationMemberForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization-member'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOrganizationMemberVO ? response : null;
  }

  /// Get organization members by page
  Future<PlusApiResultPagePlusOrganizationMemberVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/organization-member/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOrganizationMemberVO ? response : null;
  }

  /// Get all organization members
  Future<PlusApiResultListPlusOrganizationMemberVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization-member/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOrganizationMemberVO ? response : null;
  }

  /// Get organization member by ID
  Future<PlusApiResultPlusOrganizationMemberVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization-member/${id}'));
    return response is PlusApiResultPlusOrganizationMemberVO ? response : null;
  }

  /// Delete organization member
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/organization-member/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
