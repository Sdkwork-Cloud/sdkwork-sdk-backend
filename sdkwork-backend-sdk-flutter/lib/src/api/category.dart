import '../http/client.dart';
import '../models.dart';

class CategoryApi {
  final HttpClient _client;
  
  CategoryApi(this._client);

  /// Update an existing category
  Future<PlusApiResultPlusCategoryVO?> update(PlusCategoryForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/category'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCategoryVO ? response : null;
  }

  /// Create a new category
  Future<PlusApiResultPlusCategoryVO?> create(PlusCategoryForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/category'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCategoryVO ? response : null;
  }

  /// Get categories by page
  Future<PlusApiResultPagePlusCategoryVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/category/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCategoryVO ? response : null;
  }

  /// Get all categories
  Future<PlusApiResultListPlusCategoryVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/category/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCategoryVO ? response : null;
  }

  /// Get Tree
  Future<PlusApiResultSetPlusTreeNodePlusCategoryVO?> getTree(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/category/get_tree'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultSetPlusTreeNodePlusCategoryVO ? response : null;
  }

  /// Get a category by ID
  Future<PlusApiResultPlusCategoryVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/category/${id}'));
    return response is PlusApiResultPlusCategoryVO ? response : null;
  }

  /// Delete a category
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/category/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
