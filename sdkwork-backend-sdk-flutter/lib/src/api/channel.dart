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

  /// Update an existing channel resource
  Future<PlusApiResultPlusChannelResourceVO?> updateResource(PlusChannelResourceForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/channel/resource'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelResourceVO ? response : null;
  }

  /// Create a new channel resource
  Future<PlusApiResultPlusChannelResourceVO?> createResource(PlusChannelResourceForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/resource'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelResourceVO ? response : null;
  }

  /// Update channel proxy
  Future<PlusApiResultPlusChannelProxyVO?> updateProxy(PlusChannelProxyForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/channel/proxy'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelProxyVO ? response : null;
  }

  /// Create channel proxy
  Future<PlusApiResultPlusChannelProxyVO?> createProxy(PlusChannelProxyForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/proxy'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelProxyVO ? response : null;
  }

  /// Update channel account
  Future<PlusApiResultPlusChannelAccountVO?> updateAccount(PlusChannelAccountForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/channel/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelAccountVO ? response : null;
  }

  /// Create channel account
  Future<PlusApiResultPlusChannelAccountVO?> createAccount(PlusChannelAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelAccountVO ? response : null;
  }

  /// Get channel resources by page
  Future<PlusApiResultPagePlusChannelResourceVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/resource/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChannelResourceVO ? response : null;
  }

  /// Get all channel resources
  Future<PlusApiResultListPlusChannelResourceVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/resource/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelResourceVO ? response : null;
  }

  /// List channel proxies by page
  Future<PlusApiResultPagePlusChannelProxyVO?> createListByPageProxy(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/proxy/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChannelProxyVO ? response : null;
  }

  /// List all channel proxies
  Future<PlusApiResultListPlusChannelProxyVO?> createListAllEntitiesProxy(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/proxy/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelProxyVO ? response : null;
  }

  /// List channels by page
  Future<PlusApiResultPagePlusChannelVO?> createListByPageChannel(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChannelVO ? response : null;
  }

  /// List all channels
  Future<PlusApiResultListPlusChannelVO?> createListAllEntitiesChannel(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelVO ? response : null;
  }

  /// Get SMS channel accounts
  Future<PlusApiResultListPlusChannelAccountVO?> listSms(PlusChannelAccountQueryForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account/list_sms'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelAccountVO ? response : null;
  }

  /// Get payment channel accounts
  Future<PlusApiResultListPlusChannelAccountVO?> listPayment(PlusChannelAccountQueryForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account/list_payment'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelAccountVO ? response : null;
  }

  /// Get OSS channel accounts
  Future<PlusApiResultListPlusChannelAccountVO?> listOss(PlusChannelAccountQueryForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account/list_oss'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelAccountVO ? response : null;
  }

  /// Get official account channel accounts
  Future<PlusApiResultListPlusChannelAccountVO?> listOfficialAccount(PlusChannelAccountQueryForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account/list_official_account'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelAccountVO ? response : null;
  }

  /// Get mini program channel accounts
  Future<PlusApiResultListPlusChannelAccountVO?> listMiniProgram(PlusChannelAccountQueryForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account/list_mini_program'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelAccountVO ? response : null;
  }

  /// Get channel accounts by page
  Future<PlusApiResultPagePlusChannelAccountVO?> createListByPageAccount(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChannelAccountVO ? response : null;
  }

  /// Get all channel accounts
  Future<PlusApiResultListPlusChannelAccountVO?> createListAllEntitiesAccount(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelAccountVO ? response : null;
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

  /// Get a channel resource by ID
  Future<PlusApiResultPlusChannelResourceVO?> getByIdResource(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/channel/resource/${id}'));
    return response is PlusApiResultPlusChannelResourceVO ? response : null;
  }

  /// Delete a channel resource
  Future<PlusApiResultBoolean?> deleteResource(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/channel/resource/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get channel proxy by ID
  Future<PlusApiResultPlusChannelProxyVO?> getByIdProxy(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/channel/proxy/${id}'));
    return response is PlusApiResultPlusChannelProxyVO ? response : null;
  }

  /// Delete channel proxy
  Future<PlusApiResultBoolean?> deleteProxy(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/channel/proxy/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get channel account by ID
  Future<PlusApiResultPlusChannelAccountVO?> getByIdAccount(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/channel/account/${id}'));
    return response is PlusApiResultPlusChannelAccountVO ? response : null;
  }

  /// Delete channel account
  Future<PlusApiResultBoolean?> deleteAccount(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/channel/account/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
