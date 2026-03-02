import '../http/client.dart';
import '../models.dart';

class PartnerApi {
  final HttpClient _client;
  
  PartnerApi(this._client);

  /// Update a partner
  Future<PlusApiResultPlusPartnerVO?> update(PlusPartnerForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/partner'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPartnerVO ? response : null;
  }

  /// Create a new partner
  Future<PlusApiResultPlusPartnerVO?> create(PlusPartnerForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/partner'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPartnerVO ? response : null;
  }

  /// Get partners by page
  Future<PlusApiResultPagePlusPartnerVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/partner/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPartnerVO ? response : null;
  }

  /// Get all partners
  Future<PlusApiResultListPlusPartnerVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/partner/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPartnerVO ? response : null;
  }

  /// Get a partner by ID
  Future<PlusApiResultPlusPartnerVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/partner/${id}'));
    return response is PlusApiResultPlusPartnerVO ? response : null;
  }

  /// Delete a partner
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/partner/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
