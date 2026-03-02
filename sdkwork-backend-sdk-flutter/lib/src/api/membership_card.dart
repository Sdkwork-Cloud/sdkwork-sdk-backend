import '../http/client.dart';
import '../models.dart';

class MembershipCardApi {
  final HttpClient _client;
  
  MembershipCardApi(this._client);

  /// Update an existing membership card
  Future<PlusApiResultPlusCardVO?> update(PlusCardForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCardVO ? response : null;
  }

  /// Create a new membership card
  Future<PlusApiResultPlusCardVO?> create(PlusCardForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/card'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCardVO ? response : null;
  }

  /// Get membership cards by page
  Future<PlusApiResultPagePlusCardVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/card/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCardVO ? response : null;
  }

  /// Get all membership cards
  Future<PlusApiResultListPlusCardVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/card/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCardVO ? response : null;
  }

  /// Get a membership card by ID
  Future<PlusApiResultPlusCardVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/card/${id}'));
    return response is PlusApiResultPlusCardVO ? response : null;
  }

  /// Delete a membership card
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/card/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
