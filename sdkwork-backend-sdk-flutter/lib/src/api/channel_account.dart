import '../http/client.dart';
import '../models.dart';

class ChannelAccountApi {
  final HttpClient _client;
  
  ChannelAccountApi(this._client);

  /// Update channel account
  Future<PlusApiResultPlusChannelAccountVO?> update(PlusChannelAccountForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/channel/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelAccountVO ? response : null;
  }

  /// Create channel account
  Future<PlusApiResultPlusChannelAccountVO?> create(PlusChannelAccountForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusChannelAccountVO ? response : null;
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
  Future<PlusApiResultPagePlusChannelAccountVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusChannelAccountVO ? response : null;
  }

  /// Get all channel accounts
  Future<PlusApiResultListPlusChannelAccountVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/channel/account/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusChannelAccountVO ? response : null;
  }

  /// Get channel account by ID
  Future<PlusApiResultPlusChannelAccountVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/channel/account/${id}'));
    return response is PlusApiResultPlusChannelAccountVO ? response : null;
  }

  /// Delete channel account
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/channel/account/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
