import '../http/client.dart';
import '../models.dart';

class CardTemplateApi {
  final HttpClient _client;
  
  CardTemplateApi(this._client);

  /// Update an existing card template
  Future<PlusApiResultPlusCardTemplateVO?> update(PlusCardTemplateForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/card/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCardTemplateVO ? response : null;
  }

  /// Create a new card template
  Future<PlusApiResultPlusCardTemplateVO?> create(PlusCardTemplateForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/card/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCardTemplateVO ? response : null;
  }

  /// Get card templates by page
  Future<PlusApiResultPagePlusCardTemplateVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/card/template/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCardTemplateVO ? response : null;
  }

  /// Get all card templates
  Future<PlusApiResultListPlusCardTemplateVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/card/template/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCardTemplateVO ? response : null;
  }

  /// Get a card template by ID
  Future<PlusApiResultPlusCardTemplateVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/card/template/${id}'));
    return response is PlusApiResultPlusCardTemplateVO ? response : null;
  }

  /// Delete a card template
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/card/template/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
