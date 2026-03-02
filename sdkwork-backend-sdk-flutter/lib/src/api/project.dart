import '../http/client.dart';
import '../models.dart';

class ProjectApi {
  final HttpClient _client;
  
  ProjectApi(this._client);

  /// Update an existing project
  Future<PlusApiResultPlusProjectVO?> update(PlusProjectForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/project'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusProjectVO ? response : null;
  }

  /// Create a new project
  Future<PlusApiResultPlusProjectVO?> create(PlusProjectForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/project'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusProjectVO ? response : null;
  }

  /// Get projects by page
  Future<PlusApiResultPagePlusProjectVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/project/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusProjectVO ? response : null;
  }

  /// Get all projects
  Future<PlusApiResultListPlusProjectVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/project/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusProjectVO ? response : null;
  }

  /// Get a project by ID
  Future<PlusApiResultPlusProjectVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/project/${id}'));
    return response is PlusApiResultPlusProjectVO ? response : null;
  }

  /// Delete a project
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/project/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
