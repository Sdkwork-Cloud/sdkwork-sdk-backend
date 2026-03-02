import '../http/client.dart';
import '../models.dart';

class ImageApi {
  final HttpClient _client;
  
  ImageApi(this._client);

  /// Update an existing image
  Future<PlusApiResultPlusImageVO?> update(PlusImageForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/image'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusImageVO ? response : null;
  }

  /// Create a new image
  Future<PlusApiResultPlusImageVO?> create(PlusImageForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/image'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusImageVO ? response : null;
  }

  /// Get images by page
  Future<PlusApiResultPagePlusImageVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/image/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusImageVO ? response : null;
  }

  /// Get all images
  Future<PlusApiResultListPlusImageVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/image/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusImageVO ? response : null;
  }

  /// Get an image by ID
  Future<PlusApiResultPlusImageVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/image/${id}'));
    return response is PlusApiResultPlusImageVO ? response : null;
  }

  /// Delete an image
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/image/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
