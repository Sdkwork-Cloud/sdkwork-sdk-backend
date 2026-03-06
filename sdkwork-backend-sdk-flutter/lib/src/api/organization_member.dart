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

  /// Transfer member position
  Future<PlusApiResultBoolean?> transferPosition(String id, Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.backendPath('/organization-member/${id}/positions/transfer'), params: params);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Set member primary department
  Future<PlusApiResultBoolean?> setPrimaryDepartment(String id, String departmentId) async {
    final response = await _client.put(ApiPaths.backendPath('/organization-member/${id}/departments/${departmentId}/primary'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Transfer member department
  Future<PlusApiResultBoolean?> transferDepartment(String id, Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.backendPath('/organization-member/${id}/departments/transfer'), params: params);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Deactivate member
  Future<PlusApiResultBoolean?> deactivateMember(String id) async {
    final response = await _client.put(ApiPaths.backendPath('/organization-member/${id}/deactivate'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Activate member
  Future<PlusApiResultBoolean?> activateMember(String id) async {
    final response = await _client.put(ApiPaths.backendPath('/organization-member/${id}/activate'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Bind member to department
  Future<PlusApiResultBoolean?> addToDepartment(String id, String departmentId, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/organization-member/${id}/departments/${departmentId}'), params: params);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Unbind member from department
  Future<PlusApiResultBoolean?> removeFromDepartment(String id, String departmentId) async {
    final response = await _client.delete(ApiPaths.backendPath('/organization-member/${id}/departments/${departmentId}'));
    return response is PlusApiResultBoolean ? response : null;
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

  /// Get member role ids
  Future<PlusApiResultListLong?> getMemberRoleIds(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization-member/${id}/roles'));
    return response is PlusApiResultListLong ? response : null;
  }

  /// Get member positions
  Future<PlusApiResultListPlusPositionVO?> getMemberPositions(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization-member/${id}/positions'));
    return response is PlusApiResultListPlusPositionVO ? response : null;
  }

  /// Get member departments
  Future<PlusApiResultListPlusDepartmentVO?> getMemberDepartments(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization-member/${id}/departments'));
    return response is PlusApiResultListPlusDepartmentVO ? response : null;
  }
}
