import '../http/client.dart';
import '../models.dart';

class PptTemplateSlideApi {
  final HttpClient _client;
  
  PptTemplateSlideApi(this._client);

  /// Update an existing PPT template slide
  Future<PlusApiResultPlusPptTemplateSlideVO?> update(PlusPptTemplateSlideForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/ppt/template/slide'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPptTemplateSlideVO ? response : null;
  }

  /// Create a new PPT template slide
  Future<PlusApiResultPlusPptTemplateSlideVO?> create(PlusPptTemplateSlideForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/slide'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPptTemplateSlideVO ? response : null;
  }

  /// Get PPT template slides by page
  Future<PlusApiResultPagePlusPptTemplateSlideVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/slide/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPptTemplateSlideVO ? response : null;
  }

  /// Get all PPT template slides
  Future<PlusApiResultListPlusPptTemplateSlideVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/slide/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPptTemplateSlideVO ? response : null;
  }

  /// Get a PPT template slide by ID
  Future<PlusApiResultPlusPptTemplateSlideVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/ppt/template/slide/${id}'));
    return response is PlusApiResultPlusPptTemplateSlideVO ? response : null;
  }

  /// Delete a PPT template slide
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/ppt/template/slide/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
