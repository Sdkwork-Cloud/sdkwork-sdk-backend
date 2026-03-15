import '../http/client.dart';
import '../models.dart';

class RecordApi {
  final HttpClient _client;
  
  RecordApi(this._client);

  /// Update an existing invocation record
  Future<PlusApiResultPlusInvokeRecordVO?> update(PlusInvokeRecordForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusInvokeRecordVO ? response : null;
  }

  /// Create a new invocation record
  Future<PlusApiResultPlusInvokeRecordVO?> create(PlusInvokeRecordForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/record'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusInvokeRecordVO ? response : null;
  }

  /// Get invocation records by page
  Future<PlusApiResultPagePlusInvokeRecordVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/record/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusInvokeRecordVO ? response : null;
  }

  /// Get all invocation records
  Future<PlusApiResultListPlusInvokeRecordVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/record/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusInvokeRecordVO ? response : null;
  }

  /// Get an invocation record by ID
  Future<PlusApiResultPlusInvokeRecordVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/record/${id}'));
    return response is PlusApiResultPlusInvokeRecordVO ? response : null;
  }

  /// Delete an invocation record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/record/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
