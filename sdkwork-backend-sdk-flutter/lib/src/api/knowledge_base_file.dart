import '../http/client.dart';
import '../models.dart';

class KnowledgeBaseFileApi {
  final HttpClient _client;
  
  KnowledgeBaseFileApi(this._client);

  /// 获取文件列表
  Future<PlusApiResultFileListVO?> listFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/knowledge_base/files'), params: params);
    return response is PlusApiResultFileListVO ? response : null;
  }

  /// 上传文件
  Future<PlusApiResultFileItemVO?> uploadFile(UploadFilePostRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/knowledge_base/files'), body: body, params: params, contentType: 'multipart/form-data');
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// 获取文件列表
  Future<PlusApiResultFileListVO?> getListFiles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/files'), params: params);
    return response is PlusApiResultFileListVO ? response : null;
  }

  /// 上传文件
  Future<PlusApiResultFileItemVO?> createUploadFile(CreateUploadFileRequest? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/files'), body: body, params: params, contentType: 'multipart/form-data');
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// 获取单个文件信息
  Future<PlusApiResultFileItemVO?> getFile(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/knowledge_base/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// 删除文件
  Future<PlusApiResultFileItemVO?> deleteFile(String fileId) async {
    final response = await _client.delete(ApiPaths.backendPath('/knowledge_base/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// 获取文件内容
  Future<String?> getFileContent(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/knowledge_base/files/${fileId}/content'));
    return response is String ? response : null;
  }

  /// 获取单个文件信息
  Future<PlusApiResultFileItemVO?> getFileDisk(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// 删除文件
  Future<PlusApiResultFileItemVO?> deleteFileDisk(String fileId) async {
    final response = await _client.delete(ApiPaths.backendPath('/disk/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// 获取文件内容
  Future<String?> getFileContentDisk(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/files/${fileId}/content'));
    return response is String ? response : null;
  }
}
