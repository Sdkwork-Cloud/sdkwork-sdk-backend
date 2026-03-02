import '../http/client.dart';
import '../models.dart';

class WorkspaceApi {
  final HttpClient _client;
  
  WorkspaceApi(this._client);

  /// Update an existing workspace
  Future<PlusApiResultPlusWorkspaceVO?> update(PlusWorkspaceForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/workspace'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusWorkspaceVO ? response : null;
  }

  /// Create a new workspace
  Future<PlusApiResultPlusWorkspaceVO?> create(PlusWorkspaceForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/workspace'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusWorkspaceVO ? response : null;
  }

  /// Get workspaces by page
  Future<PlusApiResultPagePlusWorkspaceVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/workspace/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusWorkspaceVO ? response : null;
  }

  /// Get all workspaces
  Future<PlusApiResultListPlusWorkspaceVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/workspace/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusWorkspaceVO ? response : null;
  }

  /// Get a workspace by ID
  Future<PlusApiResultPlusWorkspaceVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/workspace/${id}'));
    return response is PlusApiResultPlusWorkspaceVO ? response : null;
  }

  /// Delete a workspace
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/workspace/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
