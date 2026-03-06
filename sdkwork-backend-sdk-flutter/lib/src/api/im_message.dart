import '../http/client.dart';
import '../models.dart';

class ImMessageApi {
  final HttpClient _client;
  
  ImMessageApi(this._client);

  /// Mark conversation messages as read
  Future<PlusApiResultBoolean?> markRead(PlusImMessageMarkReadForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/im/message/mark_read'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get messages by page
  Future<PlusApiResultPagePlusMessage?> listByPage(PlusImMessageQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/im/message/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusMessage ? response : null;
  }
}
