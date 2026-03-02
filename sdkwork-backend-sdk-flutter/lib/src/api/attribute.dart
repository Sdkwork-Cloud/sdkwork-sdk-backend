import '../http/client.dart';
import '../models.dart';

class AttributeApi {
  final HttpClient _client;
  
  AttributeApi(this._client);

  /// Update attribute
  Future<PlusApiResultPlusAttributeVO?> update(PlusAttributeForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/attribute'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAttributeVO ? response : null;
  }

  /// Create attribute
  Future<PlusApiResultPlusAttributeVO?> create(PlusAttributeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/attribute'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAttributeVO ? response : null;
  }

  /// Get attributes by page
  Future<PlusApiResultPagePlusAttributeVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/attribute/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAttributeVO ? response : null;
  }

  /// Get all attributes
  Future<PlusApiResultListPlusAttributeVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/attribute/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAttributeVO ? response : null;
  }

  /// Get attribute by ID
  Future<PlusApiResultPlusAttributeVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/attribute/${id}'));
    return response is PlusApiResultPlusAttributeVO ? response : null;
  }

  /// Delete attribute
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/attribute/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
