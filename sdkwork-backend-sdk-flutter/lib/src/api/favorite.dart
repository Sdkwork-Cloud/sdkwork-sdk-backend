import '../http/client.dart';
import '../models.dart';

class FavoriteApi {
  final HttpClient _client;
  
  FavoriteApi(this._client);

  /// Update an existing favorite
  Future<PlusApiResultPlusFavoriteVO?> update(PlusFavoriteForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/favorite'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFavoriteVO ? response : null;
  }

  /// Create a new favorite
  Future<PlusApiResultPlusFavoriteVO?> create(PlusFavoriteForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/favorite'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFavoriteVO ? response : null;
  }

  /// Get favorites by page
  Future<PlusApiResultPagePlusFavoriteVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/favorite/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusFavoriteVO ? response : null;
  }

  /// Get all favorites
  Future<PlusApiResultListPlusFavoriteVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/favorite/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusFavoriteVO ? response : null;
  }

  /// Get a favorite by ID
  Future<PlusApiResultPlusFavoriteVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/favorite/${id}'));
    return response is PlusApiResultPlusFavoriteVO ? response : null;
  }

  /// Delete a favorite
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/favorite/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
