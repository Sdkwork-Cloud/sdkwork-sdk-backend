import '../http/client.dart';
import '../models.dart';

class NotificationApi {
  final HttpClient _client;
  
  NotificationApi(this._client);

  /// Update an existing notification
  Future<PlusApiResultPlusNotificationVO?> update(PlusNotificationForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/notification'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusNotificationVO ? response : null;
  }

  /// Create a new notification
  Future<PlusApiResultPlusNotificationVO?> create(PlusNotificationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/notification'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusNotificationVO ? response : null;
  }

  /// Get notifications by page
  Future<PlusApiResultPagePlusNotificationVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/notification/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusNotificationVO ? response : null;
  }

  /// Get all notifications
  Future<PlusApiResultListPlusNotificationVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/notification/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusNotificationVO ? response : null;
  }

  /// Get a notification by ID
  Future<PlusApiResultPlusNotificationVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/notification/${id}'));
    return response is PlusApiResultPlusNotificationVO ? response : null;
  }

  /// Delete a notification
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/notification/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
