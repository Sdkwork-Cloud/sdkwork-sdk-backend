import '../http/client.dart';
import '../models.dart';

class SchemaApi {
  final HttpClient _client;
  
  SchemaApi(this._client);

  /// Update an existing database schema
  Future<PlusApiResultPlusSchemaVO?> update(PlusSchemaForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/schema'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusSchemaVO ? response : null;
  }

  /// Create a new database schema
  Future<PlusApiResultPlusSchemaVO?> create(PlusSchemaForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/schema'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusSchemaVO ? response : null;
  }

  /// Get database schemas by page
  Future<PlusApiResultPagePlusSchemaVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/schema/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusSchemaVO ? response : null;
  }

  /// Get all database schemas
  Future<PlusApiResultListPlusSchemaVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/schema/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusSchemaVO ? response : null;
  }

  /// Get a database schema by ID
  Future<PlusApiResultPlusSchemaVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/schema/${id}'));
    return response is PlusApiResultPlusSchemaVO ? response : null;
  }

  /// Delete a database schema
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/schema/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
