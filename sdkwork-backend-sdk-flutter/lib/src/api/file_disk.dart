import '../http/client.dart';
import '../models.dart';

class FileDiskApi {
  final HttpClient _client;
  
  FileDiskApi(this._client);

  /// Update an existing file disk
  Future<PlusApiResultPlusDiskVO?> update(PlusDiskForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/disk'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDiskVO ? response : null;
  }

  /// Create a new file disk
  Future<PlusApiResultPlusDiskVO?> create(PlusDiskForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/disk'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDiskVO ? response : null;
  }

  /// Get file disks by page
  Future<PlusApiResultPagePlusDiskVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusDiskVO ? response : null;
  }

  /// Get all file disks
  Future<PlusApiResultListPlusDiskVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusDiskVO ? response : null;
  }

  /// Get a file disk by ID
  Future<PlusApiResultPlusDiskVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/${id}'));
    return response is PlusApiResultPlusDiskVO ? response : null;
  }

  /// Delete a file disk
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/disk/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
