import '../http/client.dart';
import '../models.dart';

class ProductApi {
  final HttpClient _client;
  
  ProductApi(this._client);

  /// Update an existing product
  Future<PlusApiResultPlusProductVO?> update(PlusProductForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/product'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusProductVO ? response : null;
  }

  /// Create a new product
  Future<PlusApiResultPlusProductVO?> create(PlusProductForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/product'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusProductVO ? response : null;
  }

  /// Get all products
  Future<PlusApiResultPlusMallHomeVO?> mallHome(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/product/mall_home'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusMallHomeVO ? response : null;
  }

  /// Get products by page
  Future<PlusApiResultPagePlusProductVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/product/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusProductVO ? response : null;
  }

  /// Get all products
  Future<PlusApiResultListPlusProductVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/product/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusProductVO ? response : null;
  }

  /// Get a product by ID
  Future<PlusApiResultPlusProductVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/product/${id}'));
    return response is PlusApiResultPlusProductVO ? response : null;
  }

  /// Delete a product
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/product/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a product by ID
  Future<PlusApiResultPlusProductVO?> getDetail(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/product/detail'), params: params);
    return response is PlusApiResultPlusProductVO ? response : null;
  }
}
