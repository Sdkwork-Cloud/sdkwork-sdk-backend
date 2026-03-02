import '../http/client.dart';
import '../models.dart';

class VipPackageGroupApi {
  final HttpClient _client;
  
  VipPackageGroupApi(this._client);

  /// Update an existing VIP package group
  Future<PlusApiResultPlusVipPackGroupVO?> update(PlusVipPackGroupForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vip/pack_group'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPackGroupVO ? response : null;
  }

  /// Create a new VIP package group
  Future<PlusApiResultPlusVipPackGroupVO?> create(PlusVipPackGroupForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack_group'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVipPackGroupVO ? response : null;
  }

  /// List public
  Future<PlusApiResultPagePlusVipPackGroupVO?> listPublic(PlusVipPackGroupQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack_group/list_public'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipPackGroupVO ? response : null;
  }

  /// Get VIP package groups by page
  Future<PlusApiResultPagePlusVipPackGroupVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack_group/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVipPackGroupVO ? response : null;
  }

  /// Get all VIP package groups
  Future<PlusApiResultListPlusVipPackGroupVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vip/pack_group/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVipPackGroupVO ? response : null;
  }

  /// Get a VIP package group by ID
  Future<PlusApiResultPlusVipPackGroupVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vip/pack_group/${id}'));
    return response is PlusApiResultPlusVipPackGroupVO ? response : null;
  }

  /// Delete a VIP package group
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vip/pack_group/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
