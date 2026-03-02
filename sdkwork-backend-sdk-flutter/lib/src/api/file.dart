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

  /// 获取文件列表
  Future<PlusApiResultFileListVO?> listFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/oss/files'), params: params);
    return response is PlusApiResultFileListVO ? response : null;
  }

  /// 上传文件
  Future<PlusApiResultFileItemVO?> upload(UploadFileRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/files'), body: body, params: params, contentType: 'multipart/form-data');
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Get upload temporary session
  Future<PlusApiResultPlusTempSessionVO?> getTempSession(PlusGetTempSessionForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/files/temp_session'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusTempSessionVO ? response : null;
  }

  /// Generate presigned URL
  Future<PlusApiResultGetUrlResult?> getPresignedUrl(PlusGetPresignedUrlForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/files/get_presigned_url'), body: body, contentType: 'application/json');
    return response is PlusApiResultGetUrlResult ? response : null;
  }

  /// Upload file
  Future<PlusApiResultPlusFileVO?> createFiles(PlusUploadForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/files/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusFileVO ? response : null;
  }

  /// Get file metadata by page
  Future<PlusApiResultPagePlusFileVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/file/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusFileVO ? response : null;
  }

  /// Get all file metadata
  Future<PlusApiResultListPlusFileVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/file/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusFileVO ? response : null;
  }

  /// Get Tree
  Future<PlusApiResultSetPlusTreeNodePlusFileVO?> getTree(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/file/get_tree'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultSetPlusTreeNodePlusFileVO ? response : null;
  }

  /// 获取单个文件信息
  Future<PlusApiResultFileItemVO?> getFile(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/oss/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// 删除文件
  Future<PlusApiResultFileItemVO?> deleteFile(String fileId) async {
    final response = await _client.delete(ApiPaths.backendPath('/oss/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// 获取文件内容
  Future<String?> getFileContent(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/oss/files/${fileId}/content'));
    return response is String ? response : null;
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
}
