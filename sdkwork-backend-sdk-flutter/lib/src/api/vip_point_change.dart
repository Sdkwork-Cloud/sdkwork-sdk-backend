import '../http/client.dart';
import '../models.dart';

class VipPointChangeApi {
  final HttpClient _client;
  
  VipPointChangeApi(this._client);

  /// Update an existing VIP point change record
  Future<PlusApiResultPlusVipPointChangeVO?> update(PlusVipPointChangeForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/point/change'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPointChangeVO ? response : null;
  }

  /// Create a new VIP point change record
  Future<PlusApiResultPlusVipPointChangeVO?> create(PlusVipPointChangeForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/point/change'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPointChangeVO ? response : null;
  }

  /// Get VIP point change records by page
  Future<PlusApiResultPagePlusVipPointChangeVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/point/change/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipPointChangeVO ? response : null;
  }

  /// Get all VIP point change records
  Future<PlusApiResultListPlusVipPointChangeVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/point/change/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipPointChangeVO ? response : null;
  }

  /// Get a VIP point change record by ID
  Future<PlusApiResultPlusVipPointChangeVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/point/change/${id}'));
    return response is PlusApiResultPlusVipPointChangeVO ? response : null;
  }

  /// Delete a VIP point change record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/point/change/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
