import '../http/client.dart';
import '../models.dart';

class PptTemplateApi {
  final HttpClient _client;
  
  PptTemplateApi(this._client);

  /// Update an existing PPT template
  Future<PlusApiResultPlusPptTemplateVO?> update(PlusPptTemplateForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/ppt/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPptTemplateVO ? response : null;
  }

  /// Create a new PPT template
  Future<PlusApiResultPlusPptTemplateVO?> create(PlusPptTemplateForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPptTemplateVO ? response : null;
  }

  /// Get PPT templates by page
  Future<PlusApiResultPagePlusPptTemplateVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPptTemplateVO ? response : null;
  }

  /// Get all PPT templates
  Future<PlusApiResultListPlusPptTemplateVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPptTemplateVO ? response : null;
  }

  /// Get a PPT template by ID
  Future<PlusApiResultPlusPptTemplateVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/ppt/template/${id}'));
    return response is PlusApiResultPlusPptTemplateVO ? response : null;
  }

  /// Delete a PPT template
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/ppt/template/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
