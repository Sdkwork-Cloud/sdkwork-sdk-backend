import '../http/client.dart';
import '../models.dart';

class TableApi {
  final HttpClient _client;
  
  TableApi(this._client);

  /// Update an existing database table
  Future<PlusApiResultPlusTableVO?> update(PlusTableForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/table'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusTableVO ? response : null;
  }

  /// Create a new database table
  Future<PlusApiResultPlusTableVO?> create(PlusTableForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/table'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusTableVO ? response : null;
  }

  /// Get database tables by page
  Future<PlusApiResultPagePlusTableVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/table/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusTableVO ? response : null;
  }

  /// Get all database tables
  Future<PlusApiResultListPlusTableVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/table/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusTableVO ? response : null;
  }

  /// Get a database table by ID
  Future<PlusApiResultPlusTableVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/table/${id}'));
    return response is PlusApiResultPlusTableVO ? response : null;
  }

  /// Delete a database table
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/table/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
