import '../http/client.dart';
import '../models.dart';

class ChannelProxyApi {
  final HttpClient _client;
  
  ChannelProxyApi(this._client);

  /// Update channel proxy
  Future<PlusApiResultPlusChannelProxyVO?> update(PlusChannelProxyForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/channel/proxy'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelProxyVO ? response : null;
  }

  /// Create channel proxy
  Future<PlusApiResultPlusChannelProxyVO?> create(PlusChannelProxyForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/proxy'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelProxyVO ? response : null;
  }

  /// List channel proxies by page
  Future<PlusApiResultPagePlusChannelProxyVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/proxy/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChannelProxyVO ? response : null;
  }

  /// List all channel proxies
  Future<PlusApiResultListPlusChannelProxyVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/proxy/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelProxyVO ? response : null;
  }

  /// Get channel proxy by ID
  Future<PlusApiResultPlusChannelProxyVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/channel/proxy/${id}'));
    return response is PlusApiResultPlusChannelProxyVO ? response : null;
  }

  /// Delete channel proxy
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/channel/proxy/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
