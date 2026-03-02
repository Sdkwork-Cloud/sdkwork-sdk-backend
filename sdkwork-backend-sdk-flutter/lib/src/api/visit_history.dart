import '../http/client.dart';
import '../models.dart';

class VisitHistoryApi {
  final HttpClient _client;
  
  VisitHistoryApi(this._client);

  /// Update Visit History
  Future<PlusApiResultPlusVisitHistoryVO?> update(PlusVisitHistoryForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/visit_history'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVisitHistoryVO ? response : null;
  }

  /// Create Visit History
  Future<PlusApiResultPlusVisitHistoryVO?> create(PlusVisitHistoryForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/visit_history'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVisitHistoryVO ? response : null;
  }

  /// List Visit Histories by Page
  Future<PlusApiResultPagePlusVisitHistoryVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/visit_history/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVisitHistoryVO ? response : null;
  }

  /// List All Visit Histories
  Future<PlusApiResultListPlusVisitHistoryVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/visit_history/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVisitHistoryVO ? response : null;
  }

  /// Get Visit History by ID
  Future<PlusApiResultPlusVisitHistoryVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/visit_history/${id}'));
    return response is PlusApiResultPlusVisitHistoryVO ? response : null;
  }

  /// Delete Visit History
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/visit_history/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
