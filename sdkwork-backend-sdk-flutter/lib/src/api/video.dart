import '../http/client.dart';
import '../models.dart';

class VideoApi {
  final HttpClient _client;
  
  VideoApi(this._client);

  /// Update an existing video
  Future<PlusApiResultPlusVideoVO?> update(PlusVideoForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/video'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVideoVO ? response : null;
  }

  /// Create a new video
  Future<PlusApiResultPlusVideoVO?> create(PlusVideoForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/video'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVideoVO ? response : null;
  }

  /// Get videos by page
  Future<PlusApiResultPagePlusVideoVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/video/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVideoVO ? response : null;
  }

  /// Get all videos
  Future<PlusApiResultListPlusVideoVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/video/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVideoVO ? response : null;
  }

  /// Get a video by ID
  Future<PlusApiResultPlusVideoVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/video/${id}'));
    return response is PlusApiResultPlusVideoVO ? response : null;
  }

  /// Delete a video
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/video/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
