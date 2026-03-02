import '../http/client.dart';
import '../models.dart';

class ShortUrlApi {
  final HttpClient _client;
  
  ShortUrlApi(this._client);

  /// Update short URL
  Future<PlusApiResultShortUrlVO?> update(ShortUrlForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/short_url'), body: body, contentType: 'application/json');
    return response is PlusApiResultShortUrlVO ? response : null;
  }

  /// Create short URL
  Future<PlusApiResultShortUrlVO?> create(ShortUrlForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/short_url'), body: body, contentType: 'application/json');
    return response is PlusApiResultShortUrlVO ? response : null;
  }

  /// Get short URLs by page
  Future<PlusApiResultPageShortUrlVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/short_url/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPageShortUrlVO ? response : null;
  }

  /// Get all short URLs
  Future<PlusApiResultListShortUrlVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/short_url/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListShortUrlVO ? response : null;
  }

  /// Get short URL details
  Future<PlusApiResultShortUrlVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/short_url/${id}'));
    return response is PlusApiResultShortUrlVO ? response : null;
  }

  /// Delete short URL
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/short_url/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
