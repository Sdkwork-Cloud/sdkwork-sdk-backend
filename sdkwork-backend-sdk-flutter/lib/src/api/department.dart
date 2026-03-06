import '../http/client.dart';
import '../models.dart';

class DepartmentApi {
  final HttpClient _client;
  
  DepartmentApi(this._client);

  /// Update an existing department
  Future<PlusApiResultPlusDepartmentVO?> update(PlusDepartmentForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/department'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDepartmentVO ? response : null;
  }

  /// Create a new department
  Future<PlusApiResultPlusDepartmentVO?> create(PlusDepartmentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/department'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDepartmentVO ? response : null;
  }

  /// Move department
  Future<PlusApiResultPlusDepartmentVO?> move(String id, Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.backendPath('/department/${id}/move'), params: params);
    return response is PlusApiResultPlusDepartmentVO ? response : null;
  }

  /// Set primary department
  Future<PlusApiResultBoolean?> setPrimary(String id, String memberId) async {
    final response = await _client.put(ApiPaths.backendPath('/department/${id}/members/${memberId}/primary'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Add member to department
  Future<PlusApiResultBoolean?> addMemberTo(String id, String memberId, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/department/${id}/members/${memberId}'), params: params);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Remove member from department
  Future<PlusApiResultBoolean?> removeMemberFrom(String id, String memberId) async {
    final response = await _client.delete(ApiPaths.backendPath('/department/${id}/members/${memberId}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get departments by page
  Future<PlusApiResultPagePlusDepartmentVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/department/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusDepartmentVO ? response : null;
  }

  /// Get all departments
  Future<PlusApiResultListPlusDepartmentVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/department/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusDepartmentVO ? response : null;
  }

  /// Get a department by ID
  Future<PlusApiResultPlusDepartmentVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/department/${id}'));
    return response is PlusApiResultPlusDepartmentVO ? response : null;
  }

  /// Delete a department
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/department/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get department members
  Future<PlusApiResultListPlusOrganizationMemberVO?> getDepartmentMembers(String id, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/department/${id}/members'), params: params);
    return response is PlusApiResultListPlusOrganizationMemberVO ? response : null;
  }
}
