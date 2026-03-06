import '../http/client.dart';
import '../models.dart';

class SkillPackageApi {
  final HttpClient _client;
  
  SkillPackageApi(this._client);

  /// Get skill package detail
  Future<PlusApiResultPlusAgentSkillPackageVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/skill/package/${id}'));
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Update skill package
  Future<PlusApiResultPlusAgentSkillPackageVO?> update(String id, PlusAgentSkillPackageForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/skill/package/${id}'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Delete skill package
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/skill/package/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Create skill package
  Future<PlusApiResultPlusAgentSkillPackageVO?> create(PlusAgentSkillPackageForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Enable skill package
  Future<PlusApiResultPlusAgentSkillPackageVO?> enable(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package/${id}/enable'));
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Disable skill package
  Future<PlusApiResultPlusAgentSkillPackageVO?> disable(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package/${id}/disable'));
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Query skill package list by page
  Future<PlusApiResultPagePlusAgentSkillPackageVO?> listByPage(PlusAgentSkillPackageQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAgentSkillPackageVO ? response : null;
  }

  /// Query all skill packages
  Future<PlusApiResultListPlusAgentSkillPackageVO?> listAll(PlusAgentSkillPackageQueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAgentSkillPackageVO ? response : null;
  }
}
