import '../http/client.dart';
import '../models.dart';

class AppApi {
  final HttpClient _client;
  
  AppApi(this._client);

  /// Update application
  Future<PlusApiResultPlusAppVO?> update(PlusAppForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/app'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAppVO ? response : null;
  }

  /// Create application
  Future<PlusApiResultPlusAppVO?> create(PlusAppForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/app'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAppVO ? response : null;
  }

  /// Get applications by page
  Future<PlusApiResultPagePlusAppVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/app/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAppVO ? response : null;
  }

  /// Get all applications
  Future<PlusApiResultListPlusAppVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/app/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAppVO ? response : null;
  }

  /// Get app SDK config
  Future<PlusApiResultAppSdkConfigVO?> getSdkConfig(CreateJsapiSignatureForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/app/get_sdk_config'), body: body, contentType: 'application/json');
    return response is PlusApiResultAppSdkConfigVO ? response : null;
  }

  /// Get application by ID
  Future<PlusApiResultPlusAppVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/app/${id}'));
    return response is PlusApiResultPlusAppVO ? response : null;
  }

  /// Delete application
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/app/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get app info
  Future<PlusApiResultAppInfoVO?> getAppInfo() async {
    final response = await _client.get(ApiPaths.backendPath('/app/info'));
    return response is PlusApiResultAppInfoVO ? response : null;
  }
}
