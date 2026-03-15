import '../http/client.dart';
import '../models.dart';

class SkillApi {
  final HttpClient _client;
  
  SkillApi(this._client);

  /// Get one skill detail
  Future<PlusApiResultPlusAgentSkillVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/skill/${id}'));
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Update skill
  Future<PlusApiResultPlusAgentSkillVO?> update(String id, PlusAgentSkillForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/skill/${id}'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Get skill package detail
  Future<PlusApiResultPlusAgentSkillPackageVO?> getByIdPackage(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/skill/package/${id}'));
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Update skill package
  Future<PlusApiResultPlusAgentSkillPackageVO?> updatePackage(String id, PlusAgentSkillPackageForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/skill/package/${id}'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Delete skill package
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/skill/package/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Create skill
  Future<PlusApiResultPlusAgentSkillVO?> create(PlusAgentSkillForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Submit skill for review
  Future<PlusApiResultPlusAgentSkillVO?> submitForReview(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/${id}/review/submit'));
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Reject skill review
  Future<PlusApiResultPlusAgentSkillVO?> rejectReview(String id, PlusAgentSkillReviewForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/${id}/review/reject'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Approve skill review
  Future<PlusApiResultPlusAgentSkillVO?> approveReview(String id, PlusAgentSkillReviewForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/${id}/review/approve'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Publish skill
  Future<PlusApiResultPlusAgentSkillVO?> publish(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/${id}/publish'));
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Offline skill
  Future<PlusApiResultPlusAgentSkillVO?> offline(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/${id}/offline'));
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Update skill featured status
  Future<PlusApiResultPlusAgentSkillVO?> updateFeature(String id, PlusAgentSkillFeatureForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/${id}/feature'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Enable skill
  Future<PlusApiResultPlusAgentSkillVO?> createEnable(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/${id}/enable'));
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// Disable skill
  Future<PlusApiResultPlusAgentSkillVO?> createDisable(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/${id}/disable'));
    return response is PlusApiResultPlusAgentSkillVO ? response : null;
  }

  /// List pending review skills by page
  Future<PlusApiResultPagePlusAgentSkillVO?> listPendingReviewByPage(PlusAgentSkillQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/review/pending/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAgentSkillVO ? response : null;
  }

  /// Batch reject skill review
  Future<PlusApiResultListPlusAgentSkillVO?> batchRejectReview(PlusAgentSkillBatchReviewForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/review/batch/reject'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAgentSkillVO ? response : null;
  }

  /// Batch approve skill review
  Future<PlusApiResultListPlusAgentSkillVO?> batchApproveReview(PlusAgentSkillBatchReviewForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/review/batch/approve'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAgentSkillVO ? response : null;
  }

  /// Create skill package
  Future<PlusApiResultPlusAgentSkillPackageVO?> createPackage(PlusAgentSkillPackageForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Enable skill package
  Future<PlusApiResultPlusAgentSkillPackageVO?> createEnablePackage(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package/${id}/enable'));
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Disable skill package
  Future<PlusApiResultPlusAgentSkillPackageVO?> createDisablePackage(String id) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package/${id}/disable'));
    return response is PlusApiResultPlusAgentSkillPackageVO ? response : null;
  }

  /// Query skill package list by page
  Future<PlusApiResultPagePlusAgentSkillPackageVO?> createListByPage(PlusAgentSkillPackageQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAgentSkillPackageVO ? response : null;
  }

  /// Query all skill packages
  Future<PlusApiResultListPlusAgentSkillPackageVO?> createListAll(PlusAgentSkillPackageQueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/package/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAgentSkillPackageVO ? response : null;
  }

  /// Query skill list by page
  Future<PlusApiResultPagePlusAgentSkillVO?> createListByPageSkill(PlusAgentSkillQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAgentSkillVO ? response : null;
  }

  /// Query all skills
  Future<PlusApiResultListPlusAgentSkillVO?> createListAllSkill(PlusAgentSkillQueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/skill/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAgentSkillVO ? response : null;
  }
}
