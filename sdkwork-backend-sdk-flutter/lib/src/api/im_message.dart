import '../http/client.dart';
import '../models.dart';

class ImMessageApi {
  final HttpClient _client;
  
  ImMessageApi(this._client);

  /// Get messages by page
  Future<PlusApiResultPagePlusMessage?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/im/message/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusMessage ? response : null;
  }
}
