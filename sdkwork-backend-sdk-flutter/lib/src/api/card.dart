import '../http/client.dart';
import '../models.dart';

class CardApi {
  final HttpClient _client;
  
  CardApi(this._client);

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

  /// Update an existing card template
  Future<PlusApiResultPlusCardTemplateVO?> updateTemplate(PlusCardTemplateForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/card/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCardTemplateVO ? response : null;
  }

  /// Create a new card template
  Future<PlusApiResultPlusCardTemplateVO?> createTemplate(PlusCardTemplateForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/card/template'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCardTemplateVO ? response : null;
  }

  /// Get card templates by page
  Future<PlusApiResultPagePlusCardTemplateVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/card/template/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCardTemplateVO ? response : null;
  }

  /// Get all card templates
  Future<PlusApiResultListPlusCardTemplateVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/card/template/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCardTemplateVO ? response : null;
  }

  /// Get membership cards by page
  Future<PlusApiResultPagePlusCardVO?> createListByPageCard(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/card/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCardVO ? response : null;
  }

  /// Get all membership cards
  Future<PlusApiResultListPlusCardVO?> createListAllEntitiesCard(QueryListForm? body) async {
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

  /// Get a card template by ID
  Future<PlusApiResultPlusCardTemplateVO?> getByIdTemplate(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/card/template/${id}'));
    return response is PlusApiResultPlusCardTemplateVO ? response : null;
  }

  /// Delete a card template
  Future<PlusApiResultBoolean?> deleteTemplate(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/card/template/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
