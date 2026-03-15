import '../http/client.dart';
import '../models.dart';

class OssApi {
  final HttpClient _client;
  
  OssApi(this._client);

  /// Update an existing OSS bucket
  Future<PlusApiResultPlusOssBucketVO?> update(PlusOssBucketForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/oss/bucket'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOssBucketVO ? response : null;
  }

  /// Create a new OSS bucket
  Future<PlusApiResultPlusOssBucketVO?> create(PlusOssBucketForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/bucket'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusOssBucketVO ? response : null;
  }

  /// List files
  Future<PlusApiResultFileListVO?> listFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/oss/files'), params: params);
    return response is PlusApiResultFileListVO ? response : null;
  }

  /// Upload file
  Future<PlusApiResultFileItemVO?> uploadFile(UploadFileRequest? body, Map<String, dynamic>? params) async {
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

  /// Get OSS buckets by page
  Future<PlusApiResultPagePlusOssBucketVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/bucket/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusOssBucketVO ? response : null;
  }

  /// Get all OSS buckets
  Future<PlusApiResultListPlusOssBucketVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/oss/bucket/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusOssBucketVO ? response : null;
  }

  /// Get file
  Future<PlusApiResultFileItemVO?> getFile(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/oss/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Delete file
  Future<PlusApiResultFileItemVO?> deleteFile(String fileId) async {
    final response = await _client.delete(ApiPaths.backendPath('/oss/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Get file content
  Future<String?> getFileContent(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/oss/files/${fileId}/content'));
    return response is String ? response : null;
  }

  /// Get an OSS bucket by ID
  Future<PlusApiResultPlusOssBucketVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/oss/bucket/${id}'));
    return response is PlusApiResultPlusOssBucketVO ? response : null;
  }

  /// Delete an OSS bucket
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/oss/bucket/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
