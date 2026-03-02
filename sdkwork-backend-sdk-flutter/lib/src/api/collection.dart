import '../http/client.dart';
import '../models.dart';

class CollectionApi {
  final HttpClient _client;
  
  CollectionApi(this._client);

  /// Update an existing collection
  Future<PlusApiResultPlusCollectionVO?> update(PlusCollectionForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/collection'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCollectionVO ? response : null;
  }

  /// Create a new collection
  Future<PlusApiResultPlusCollectionVO?> create(PlusCollectionForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/collection'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCollectionVO ? response : null;
  }

  /// Get collections by page
  Future<PlusApiResultPagePlusCollectionVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/collection/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCollectionVO ? response : null;
  }

  /// Get all collections
  Future<PlusApiResultListPlusCollectionVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/collection/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCollectionVO ? response : null;
  }

  /// Get a collection by ID
  Future<PlusApiResultPlusCollectionVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/collection/${id}'));
    return response is PlusApiResultPlusCollectionVO ? response : null;
  }

  /// Delete a collection
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/collection/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
