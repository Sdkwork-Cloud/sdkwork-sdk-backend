import '../http/client.dart';
import '../models.dart';

class AccountHistoryApi {
  final HttpClient _client;
  
  AccountHistoryApi(this._client);

  /// Update an existing account history record
  Future<PlusApiResultPlusAccountHistoryVO?> update(PlusAccountHistoryForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/account/history'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountHistoryVO ? response : null;
  }

  /// Create a new account history record
  Future<PlusApiResultPlusAccountHistoryVO?> create(PlusAccountHistoryForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/history'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAccountHistoryVO ? response : null;
  }

  /// Get account history records by page
  Future<PlusApiResultPagePlusAccountHistoryVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/account/history/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAccountHistoryVO ? response : null;
  }

  /// Get all account history records
  Future<PlusApiResultListPlusAccountHistoryVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/account/history/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAccountHistoryVO ? response : null;
  }

  /// Get an account history record by ID
  Future<PlusApiResultPlusAccountHistoryVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/account/history/${id}'));
    return response is PlusApiResultPlusAccountHistoryVO ? response : null;
  }

  /// Delete an account history record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/account/history/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
