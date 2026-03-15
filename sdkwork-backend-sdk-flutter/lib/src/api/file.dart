import '../http/client.dart';
import '../models.dart';

class FileApi {
  final HttpClient _client;
  
  FileApi(this._client);

  /// Update existing file metadata
  Future<PlusApiResultPlusFileVO?> update(PlusFileForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/file'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFileVO ? response : null;
  }

  /// Create a new file metadata
  Future<PlusApiResultPlusFileVO?> create(PlusFileForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/file'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFileVO ? response : null;
  }

  /// Update an existing file part
  Future<PlusApiResultPlusFilePartVO?> updatePart(PlusFilePartForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/file/part'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFilePartVO ? response : null;
  }

  /// Create a new file part
  Future<PlusApiResultPlusFilePartVO?> createPart(PlusFilePartForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/part'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFilePartVO ? response : null;
  }

  /// Update file content
  Future<PlusApiResultPlusFileContentVO?> updateContent(PlusFileContentForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/file/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFileContentVO ? response : null;
  }

  /// Create file content
  Future<PlusApiResultPlusFileContentVO?> createContent(PlusFileContentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFileContentVO ? response : null;
  }

  /// Get file parts by page
  Future<PlusApiResultPagePlusFilePartVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/file/part/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusFilePartVO ? response : null;
  }

  /// Get all file parts
  Future<PlusApiResultListPlusFilePartVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/part/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusFilePartVO ? response : null;
  }

  /// Get file metadata by page
  Future<PlusApiResultPagePlusFileVO?> createListByPageFile(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/file/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusFileVO ? response : null;
  }

  /// Get all file metadata
  Future<PlusApiResultListPlusFileVO?> createListAllEntitiesFile(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusFileVO ? response : null;
  }

  /// Get Tree
  Future<PlusApiResultSetPlusTreeNodePlusFileVO?> getTree(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/file/get_tree'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultSetPlusTreeNodePlusFileVO ? response : null;
  }

  /// Get file contents by page
  Future<PlusApiResultPagePlusFileContentVO?> createListByPageContent(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/file/content/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusFileContentVO ? response : null;
  }

  /// Get all file contents
  Future<PlusApiResultListPlusFileContentVO?> createListAllEntitiesContent(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/content/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusFileContentVO ? response : null;
  }

  /// Get file metadata by ID
  Future<PlusApiResultPlusFileVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/file/${id}'));
    return response is PlusApiResultPlusFileVO ? response : null;
  }

  /// Delete file metadata
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/file/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get a file part by ID
  Future<PlusApiResultPlusFilePartVO?> getByIdPart(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/file/part/${id}'));
    return response is PlusApiResultPlusFilePartVO ? response : null;
  }

  /// Delete a file part
  Future<PlusApiResultBoolean?> deletePart(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/file/part/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get file content by ID
  Future<PlusApiResultPlusFileContentVO?> getByIdContent(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/file/content/${id}'));
    return response is PlusApiResultPlusFileContentVO ? response : null;
  }

  /// Delete file content
  Future<PlusApiResultBoolean?> deleteContent(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/file/content/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
