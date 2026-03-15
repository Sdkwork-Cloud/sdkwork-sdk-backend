import '../http/client.dart';
import '../models.dart';

class DiskApi {
  final HttpClient _client;
  
  DiskApi(this._client);

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

  /// Update an existing disk member
  Future<PlusApiResultPlusDiskMemberVO?> updateMember(PlusDiskMemberForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/disk/member'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDiskMemberVO ? response : null;
  }

  /// Create a new disk member
  Future<PlusApiResultPlusDiskMemberVO?> createMember(PlusDiskMemberForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/member'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusDiskMemberVO ? response : null;
  }

  /// Get disk members by page
  Future<PlusApiResultPagePlusDiskMemberVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/member/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusDiskMemberVO ? response : null;
  }

  /// Get all disk members
  Future<PlusApiResultListPlusDiskMemberVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/member/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusDiskMemberVO ? response : null;
  }

  /// Get file disks by page
  Future<PlusApiResultPagePlusDiskVO?> createListByPageDisk(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusDiskVO ? response : null;
  }

  /// Get all file disks
  Future<PlusApiResultListPlusDiskVO?> createListAllEntitiesDisk(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/disk/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusDiskVO ? response : null;
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

  /// Get a disk member by ID
  Future<PlusApiResultPlusDiskMemberVO?> getByIdMember(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/member/${id}'));
    return response is PlusApiResultPlusDiskMemberVO ? response : null;
  }

  /// Delete a disk member
  Future<PlusApiResultBoolean?> deleteMember(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/disk/member/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get file
  Future<PlusApiResultFileItemVO?> getFile(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Delete file
  Future<PlusApiResultFileItemVO?> deleteFile(String fileId) async {
    final response = await _client.delete(ApiPaths.backendPath('/disk/files/${fileId}'));
    return response is PlusApiResultFileItemVO ? response : null;
  }

  /// Get file content
  Future<String?> getFileContent(String fileId) async {
    final response = await _client.get(ApiPaths.backendPath('/disk/files/${fileId}/content'));
    return response is String ? response : null;
  }
}
