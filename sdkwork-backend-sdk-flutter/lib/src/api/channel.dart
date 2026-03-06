import '../http/client.dart';
import '../models.dart';

class ChannelApi {
  final HttpClient _client;
  
  ChannelApi(this._client);

  /// Update channel
  Future<PlusApiResultPlusChannelVO?> update(PlusChannelForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/channel'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelVO ? response : null;
  }

  /// Create channel
  Future<PlusApiResultPlusChannelVO?> create(PlusChannelForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelVO ? response : null;
  }

  /// List channels by page
  Future<PlusApiResultPagePlusChannelVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChannelVO ? response : null;
  }

  /// List all channels
  Future<PlusApiResultListPlusChannelVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelVO ? response : null;
  }

  /// Get channel by ID
  Future<PlusApiResultPlusChannelVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/channel/${id}'));
    return response is PlusApiResultPlusChannelVO ? response : null;
  }

  /// Delete channel
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/channel/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
