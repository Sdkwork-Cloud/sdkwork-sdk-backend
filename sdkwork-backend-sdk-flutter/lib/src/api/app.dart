import '../http/client.dart';
import '../models.dart';

class AppApi {
  final HttpClient _client;
  
  AppApi(this._client);

  /// Get app SDK config
  Future<PlusApiResultAppSdkConfigVO?> getSdkConfig(CreateJsapiSignatureForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/app/get_sdk_config'), body: body, contentType: 'application/json');
    return response is PlusApiResultAppSdkConfigVO ? response : null;
  }

  /// Get app info
  Future<PlusApiResultAppInfoVO?> getAppInfo() async {
    final response = await _client.get(ApiPaths.backendPath('/app/info'));
    return response is PlusApiResultAppInfoVO ? response : null;
  }
}
