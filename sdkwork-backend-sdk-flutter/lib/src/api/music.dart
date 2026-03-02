import '../http/client.dart';
import '../models.dart';

class MusicApi {
  final HttpClient _client;
  
  MusicApi(this._client);

  /// Update music
  Future<PlusApiResultPlusMusicVO?> update(PlusMusicForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/music'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMusicVO ? response : null;
  }

  /// Create new music
  Future<PlusApiResultPlusMusicVO?> create(PlusMusicForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/music'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMusicVO ? response : null;
  }

  /// Get music records by page
  Future<PlusApiResultPagePlusMusicVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/music/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusMusicVO ? response : null;
  }

  /// Get all music records
  Future<PlusApiResultListPlusMusicVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/music/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusMusicVO ? response : null;
  }

  /// Get music by ID
  Future<PlusApiResultPlusMusicVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/music/${id}'));
    return response is PlusApiResultPlusMusicVO ? response : null;
  }

  /// Delete music
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/music/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
