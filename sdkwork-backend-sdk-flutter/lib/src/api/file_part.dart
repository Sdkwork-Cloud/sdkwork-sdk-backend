import '../http/client.dart';
import '../models.dart';

class FilePartApi {
  final HttpClient _client;
  
  FilePartApi(this._client);

  /// Update an existing file part
  Future<PlusApiResultPlusFilePartVO?> update(PlusFilePartForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/file/part'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFilePartVO ? response : null;
  }

  /// Create a new file part
  Future<PlusApiResultPlusFilePartVO?> create(PlusFilePartForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/part'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFilePartVO ? response : null;
  }

  /// Get file parts by page
  Future<PlusApiResultPagePlusFilePartVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/file/part/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusFilePartVO ? response : null;
  }

  /// Get all file parts
  Future<PlusApiResultListPlusFilePartVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/part/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusFilePartVO ? response : null;
  }

  /// Get a file part by ID
  Future<PlusApiResultPlusFilePartVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/file/part/${id}'));
    return response is PlusApiResultPlusFilePartVO ? response : null;
  }

  /// Delete a file part
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/file/part/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
