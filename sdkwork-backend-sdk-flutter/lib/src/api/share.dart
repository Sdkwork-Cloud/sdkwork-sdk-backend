import '../http/client.dart';
import '../models.dart';

class ShareApi {
  final HttpClient _client;
  
  ShareApi(this._client);

  /// 更新分享
  Future<PlusApiResultPlusShareVO?> update(PlusShareForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/share'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShareVO ? response : null;
  }

  /// 创建分享
  Future<PlusApiResultPlusShareVO?> create(PlusShareForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/share'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShareVO ? response : null;
  }

  /// Update visit record
  Future<PlusApiResultPlusShareVisitRecordVO?> updateVisitRecord(PlusShareVisitRecordForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/share/visit_record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShareVisitRecordVO ? response : null;
  }

  /// Create visit record
  Future<PlusApiResultPlusShareVisitRecordVO?> createVisitRecord(PlusShareVisitRecordForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/share/visit_record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusShareVisitRecordVO ? response : null;
  }

  /// Get visit records by page
  Future<PlusApiResultPagePlusShareVisitRecordVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/share/visit_record/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusShareVisitRecordVO ? response : null;
  }

  /// Get all visit records
  Future<PlusApiResultListPlusShareVisitRecordVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/share/visit_record/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusShareVisitRecordVO ? response : null;
  }

  /// 分页获取分享
  Future<PlusApiResultPagePlusShareVO?> createListByPageShare(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/share/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusShareVO ? response : null;
  }

  /// 获取所有分享
  Future<PlusApiResultListPlusShareVO?> createListAllEntitiesShare(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/share/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusShareVO ? response : null;
  }

  /// 获取分享详情
  Future<PlusApiResultPlusShareVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/share/${id}'));
    return response is PlusApiResultPlusShareVO ? response : null;
  }

  /// 删除分享
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/share/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get visit record by ID
  Future<PlusApiResultPlusShareVisitRecordVO?> getByIdVisitRecord(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/share/visit_record/${id}'));
    return response is PlusApiResultPlusShareVisitRecordVO ? response : null;
  }

  /// Delete visit record
  Future<PlusApiResultBoolean?> deleteVisitRecord(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/share/visit_record/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
