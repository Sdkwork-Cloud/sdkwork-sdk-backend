import '../http/client.dart';
import '../models.dart';

class AiArticleApi {
  final HttpClient _client;
  
  AiArticleApi(this._client);

  /// Update an existing AI article
  Future<PlusApiResultPlusArticleVO?> update(PlusArticleForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/article'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusArticleVO ? response : null;
  }

  /// Create a new AI article
  Future<PlusApiResultPlusArticleVO?> create(PlusArticleForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/article'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusArticleVO ? response : null;
  }

  /// Get AI articles by page
  Future<PlusApiResultPagePlusArticleVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/article/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusArticleVO ? response : null;
  }

  /// Get all AI articles
  Future<PlusApiResultListPlusArticleVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/article/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusArticleVO ? response : null;
  }

  /// Get an AI article by ID
  Future<PlusApiResultPlusArticleVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/article/${id}'));
    return response is PlusApiResultPlusArticleVO ? response : null;
  }

  /// Delete an AI article
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/article/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
