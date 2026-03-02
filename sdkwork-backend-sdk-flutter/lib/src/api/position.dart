import '../http/client.dart';
import '../models.dart';

class PositionApi {
  final HttpClient _client;
  
  PositionApi(this._client);

  /// Update an existing position
  Future<PlusApiResultPlusPositionVO?> update(PlusPositionForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/organization/position'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPositionVO ? response : null;
  }

  /// Create a new position
  Future<PlusApiResultPlusPositionVO?> create(PlusPositionForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/position'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusPositionVO ? response : null;
  }

  /// Get positions by page
  Future<PlusApiResultPagePlusPositionVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/position/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusPositionVO ? response : null;
  }

  /// Get all positions
  Future<PlusApiResultListPlusPositionVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/organization/position/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusPositionVO ? response : null;
  }

  /// Get a position by ID
  Future<PlusApiResultPlusPositionVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/organization/position/${id}'));
    return response is PlusApiResultPlusPositionVO ? response : null;
  }

  /// Delete a position
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/organization/position/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
