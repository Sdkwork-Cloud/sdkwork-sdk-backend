import '../http/client.dart';
import '../models.dart';

class ChannelResourceApi {
  final HttpClient _client;
  
  ChannelResourceApi(this._client);

  /// Update an existing channel resource
  Future<PlusApiResultPlusChannelResourceVO?> update(PlusChannelResourceForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/channel/resource'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelResourceVO ? response : null;
  }

  /// Create a new channel resource
  Future<PlusApiResultPlusChannelResourceVO?> create(PlusChannelResourceForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/resource'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelResourceVO ? response : null;
  }

  /// Get channel resources by page
  Future<PlusApiResultPagePlusChannelResourceVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/resource/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChannelResourceVO ? response : null;
  }

  /// Get all channel resources
  Future<PlusApiResultListPlusChannelResourceVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/resource/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelResourceVO ? response : null;
  }

  /// Get a channel resource by ID
  Future<PlusApiResultPlusChannelResourceVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/channel/resource/${id}'));
    return response is PlusApiResultPlusChannelResourceVO ? response : null;
  }

  /// Delete a channel resource
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/channel/resource/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
