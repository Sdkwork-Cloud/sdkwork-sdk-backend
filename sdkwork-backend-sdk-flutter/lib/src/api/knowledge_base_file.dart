import '../http/client.dart';
import '../models.dart';

class KnowledgeBaseFileApi {
  final HttpClient _client;
  
  KnowledgeBaseFileApi(this._client);

  /// List files
  Future<PlusApiResultFileListVO?> listFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/knowledge_base/files'), params: params);
    return response is PlusApiResultFileListVO ? response : null;
  }

  /// Upload file
  Future<PlusApiResultFileItemVO?> uploadFile(UploadFilePostRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/knowledge_base/files'), body: body, params: params, contentType: 'multipart/form-data');
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// List files
  Future<PlusApiResultFileListVO?> getListFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/files'), params: params);
    return response is PlusApiResultFileListVO ? response : null;
  }

  /// Upload file
  Future<PlusApiResultFileItemVO?> createUploadFile(CreateUploadFileRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/files'), body: body, params: params, contentType: 'multipart/form-data');
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Get file
  Future<PlusApiResultFileItemVO?> getFile(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/knowledge_base/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Delete file
  Future<PlusApiResultFileItemVO?> deleteFile(String fileId) async {
    final response = await _client.delete(ApiPaths.backendPath('/knowledge_base/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Get file content
  Future<String?> getFileContent(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/knowledge_base/files/${fileId}/content'));
    return response is String ? response : null;
  }

  /// Get file
  Future<PlusApiResultFileItemVO?> getFileDisk(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Delete file
  Future<PlusApiResultFileItemVO?> deleteFileDisk(String fileId) async {
    final response = await _client.delete(ApiPaths.backendPath('/disk/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Get file content
  Future<String?> getFileContentDisk(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/files/${fileId}/content'));
    return response is String ? response : null;
  }
}
