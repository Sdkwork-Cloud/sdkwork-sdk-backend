import '../http/client.dart';
import '../models.dart';

class PptApi {
  final HttpClient _client;
  
  PptApi(this._client);

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

  /// Update an existing PPT template slide
  Future<PlusApiResultPlusPptTemplateSlideVO?> updateSlide(PlusPptTemplateSlideForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/ppt/template/slide'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPptTemplateSlideVO ? response : null;
  }

  /// Create a new PPT template slide
  Future<PlusApiResultPlusPptTemplateSlideVO?> createSlide(PlusPptTemplateSlideForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/slide'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPptTemplateSlideVO ? response : null;
  }

  /// Get PPT template slides by page
  Future<PlusApiResultPagePlusPptTemplateSlideVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/slide/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPptTemplateSlideVO ? response : null;
  }

  /// Get all PPT template slides
  Future<PlusApiResultListPlusPptTemplateSlideVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/slide/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPptTemplateSlideVO ? response : null;
  }

  /// Render PPT template
  Future<PlusApiResult?> render(PlusPptTemplateRenderForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/render'), body: body, contentType: 'application/json');
    return response is PlusApiResult ? response : null;
  }

  /// Get PPT templates by page
  Future<PlusApiResultPagePlusPptTemplateVO?> createListByPageTemplate(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPptTemplateVO ? response : null;
  }

  /// Get all PPT templates
  Future<PlusApiResultListPlusPptTemplateVO?> createListAllEntitiesTemplate(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPptTemplateVO ? response : null;
  }

  Future<PlusApiResultBoolean?> stop(Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/chat/stop'), params: params, headers: headers);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Create a chat completion with PPT template
  Future<ChatCompletionChunk?> createCompletions(ChatCompletionCreateForm body, Map<String, dynamic>? params, Map<String, String>? headers) async {
    final response = await _client.post(ApiPaths.backendPath('/ppt/template/chat/completions'), body: body, params: params, headers: headers, contentType: 'application/json');
    return response is ChatCompletionChunk ? response : null;
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

  /// Get a PPT template slide by ID
  Future<PlusApiResultPlusPptTemplateSlideVO?> getByIdSlide(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/ppt/template/slide/${id}'));
    return response is PlusApiResultPlusPptTemplateSlideVO ? response : null;
  }

  /// Delete a PPT template slide
  Future<PlusApiResultBoolean?> deleteSlide(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/ppt/template/slide/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
