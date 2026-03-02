import '../http/client.dart';
import '../models.dart';

class CollectionItemApi {
  final HttpClient _client;
  
  CollectionItemApi(this._client);

  /// Update an existing collection item
  Future<PlusApiResultPlusCollectionItemVO?> update(PlusCollectionItemForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/collection-item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCollectionItemVO ? response : null;
  }

  /// Create a new collection item
  Future<PlusApiResultPlusCollectionItemVO?> create(PlusCollectionItemForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/collection-item'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCollectionItemVO ? response : null;
  }

  /// Get collection items by page
  Future<PlusApiResultPagePlusCollectionItemVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/collection-item/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCollectionItemVO ? response : null;
  }

  /// Get all collection items
  Future<PlusApiResultListPlusCollectionItemVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/collection-item/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCollectionItemVO ? response : null;
  }

  /// Get a collection item by ID
  Future<PlusApiResultPlusCollectionItemVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/collection-item/${id}'));
    return response is PlusApiResultPlusCollectionItemVO ? response : null;
  }

  /// Delete a collection item
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/collection-item/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
