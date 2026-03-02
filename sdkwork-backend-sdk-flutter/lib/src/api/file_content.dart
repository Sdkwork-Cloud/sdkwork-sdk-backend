import '../http/client.dart';
import '../models.dart';

class FileContentApi {
  final HttpClient _client;
  
  FileContentApi(this._client);

  /// Update file content
  Future<PlusApiResultPlusFileContentVO?> update(PlusFileContentForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/file/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFileContentVO ? response : null;
  }

  /// Create file content
  Future<PlusApiResultPlusFileContentVO?> create(PlusFileContentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFileContentVO ? response : null;
  }

  /// Get file contents by page
  Future<PlusApiResultPagePlusFileContentVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/file/content/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusFileContentVO ? response : null;
  }

  /// Get all file contents
  Future<PlusApiResultListPlusFileContentVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/content/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusFileContentVO ? response : null;
  }

  /// Get file content by ID
  Future<PlusApiResultPlusFileContentVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/file/content/${id}'));
    return response is PlusApiResultPlusFileContentVO ? response : null;
  }

  /// Delete file content
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/file/content/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
