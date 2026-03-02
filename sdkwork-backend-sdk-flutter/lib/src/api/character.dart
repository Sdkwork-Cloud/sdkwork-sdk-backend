import '../http/client.dart';
import '../models.dart';

class CharacterApi {
  final HttpClient _client;
  
  CharacterApi(this._client);

  /// Update character
  Future<PlusApiResultPlusCharacterVO?> update(PlusCharacterForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/character'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCharacterVO ? response : null;
  }

  /// Create character
  Future<PlusApiResultPlusCharacterVO?> create(PlusCharacterForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/character'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusCharacterVO ? response : null;
  }

  /// Get characters by page
  Future<PlusApiResultPagePlusCharacterVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/character/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusCharacterVO ? response : null;
  }

  /// Get all characters
  Future<PlusApiResultListPlusCharacterVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/character/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusCharacterVO ? response : null;
  }

  /// Get character by ID
  Future<PlusApiResultPlusCharacterVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/character/${id}'));
    return response is PlusApiResultPlusCharacterVO ? response : null;
  }

  /// Delete character
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/character/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
