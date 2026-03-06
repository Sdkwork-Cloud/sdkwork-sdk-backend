import '../http/client.dart';
import '../models.dart';

class UsageRecordApi {
  final HttpClient _client;
  
  UsageRecordApi(this._client);

  /// Update an existing usage record
  Future<PlusApiResultUsageRecordVO?> update(UsageRecordForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/usage/record'), body: body, contentType: 'application/json');
    return response is PlusApiResultUsageRecordVO ? response : null;
  }

  /// Create a new usage record
  Future<PlusApiResultUsageRecordVO?> create(UsageRecordForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/usage/record'), body: body, contentType: 'application/json');
    return response is PlusApiResultUsageRecordVO ? response : null;
  }

  /// Get usage records by page
  Future<PlusApiResultPageUsageRecordVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/usage/record/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPageUsageRecordVO ? response : null;
  }

  /// Get all usage records
  Future<PlusApiResultListUsageRecordVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/usage/record/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListUsageRecordVO ? response : null;
  }

  /// Get a usage record by ID
  Future<PlusApiResultUsageRecordVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/usage/record/${id}'));
    return response is PlusApiResultUsageRecordVO ? response : null;
  }

  /// Delete a usage record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/usage/record/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
