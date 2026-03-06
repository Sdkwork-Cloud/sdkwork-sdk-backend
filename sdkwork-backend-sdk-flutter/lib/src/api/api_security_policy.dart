import '../http/client.dart';
import '../models.dart';

class ApiSecurityPolicyApi {
  final HttpClient _client;
  
  ApiSecurityPolicyApi(this._client);

  Future<PlusApiResultPlusApiSecurityPolicyVO?> update(PlusApiSecurityPolicyForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/security/policy'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusApiSecurityPolicyVO ? response : null;
  }

  Future<PlusApiResultPlusApiSecurityPolicyVO?> create(PlusApiSecurityPolicyForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/security/policy'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusApiSecurityPolicyVO ? response : null;
  }

  /// List policies by page
  Future<PlusApiResultPagePlusApiSecurityPolicyVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/security/policy/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusApiSecurityPolicyVO ? response : null;
  }

  /// List all policies
  Future<PlusApiResultListPlusApiSecurityPolicyVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/security/policy/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusApiSecurityPolicyVO ? response : null;
  }

  Future<PlusApiResultPlusApiSecurityPolicyVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/security/policy/${id}'));
    return response is PlusApiResultPlusApiSecurityPolicyVO ? response : null;
  }

  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/security/policy/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
