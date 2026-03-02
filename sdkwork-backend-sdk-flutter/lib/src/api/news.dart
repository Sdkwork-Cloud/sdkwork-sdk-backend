import '../http/client.dart';
import '../models.dart';

class NewsApi {
  final HttpClient _client;
  
  NewsApi(this._client);

  /// Update an existing news
  Future<PlusApiResultPlusNewsVO?> update(PlusNewsForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/news'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusNewsVO ? response : null;
  }

  /// Create a new news
  Future<PlusApiResultPlusNewsVO?> create(PlusNewsForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/news'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusNewsVO ? response : null;
  }

  /// Get news by page
  Future<PlusApiResultPagePlusNewsVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/news/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusNewsVO ? response : null;
  }

  /// Get all news
  Future<PlusApiResultListPlusNewsVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/news/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusNewsVO ? response : null;
  }

  /// Get a news by ID
  Future<PlusApiResultPlusNewsVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/news/${id}'));
    return response is PlusApiResultPlusNewsVO ? response : null;
  }

  /// Delete a news
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/news/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
