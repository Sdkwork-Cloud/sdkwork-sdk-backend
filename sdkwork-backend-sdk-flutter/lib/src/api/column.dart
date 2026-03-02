import '../http/client.dart';
import '../models.dart';

class ColumnApi {
  final HttpClient _client;
  
  ColumnApi(this._client);

  /// Update column
  Future<PlusApiResultPlusColumnVO?> update(PlusColumnForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/column'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusColumnVO ? response : null;
  }

  /// Create column
  Future<PlusApiResultPlusColumnVO?> create(PlusColumnForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/column'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusColumnVO ? response : null;
  }

  /// Get columns by page
  Future<PlusApiResultPagePlusColumnVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/column/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusColumnVO ? response : null;
  }

  /// Get all columns
  Future<PlusApiResultListPlusColumnVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/column/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusColumnVO ? response : null;
  }

  /// Get column by ID
  Future<PlusApiResultPlusColumnVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/column/${id}'));
    return response is PlusApiResultPlusColumnVO ? response : null;
  }

  /// Delete column
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/column/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
