import '../http/client.dart';
import '../models.dart';

class ShareVisitRecordApi {
  final HttpClient _client;
  
  ShareVisitRecordApi(this._client);

  /// Update visit record
  Future<PlusApiResultPlusShareVisitRecordVO?> update(PlusShareVisitRecordForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/share/visit_record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShareVisitRecordVO ? response : null;
  }

  /// Create visit record
  Future<PlusApiResultPlusShareVisitRecordVO?> create(PlusShareVisitRecordForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/share/visit_record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShareVisitRecordVO ? response : null;
  }

  /// Get visit records by page
  Future<PlusApiResultPagePlusShareVisitRecordVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/share/visit_record/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusShareVisitRecordVO ? response : null;
  }

  /// Get all visit records
  Future<PlusApiResultListPlusShareVisitRecordVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/share/visit_record/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusShareVisitRecordVO ? response : null;
  }

  /// Get visit record by ID
  Future<PlusApiResultPlusShareVisitRecordVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/share/visit_record/${id}'));
    return response is PlusApiResultPlusShareVisitRecordVO ? response : null;
  }

  /// Delete visit record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/share/visit_record/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
