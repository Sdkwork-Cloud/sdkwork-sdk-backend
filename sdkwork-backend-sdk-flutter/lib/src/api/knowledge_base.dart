import '../http/client.dart';
import '../models.dart';

class KnowledgeBaseApi {
  final HttpClient _client;
  
  KnowledgeBaseApi(this._client);

  /// Update an existing knowledge base
  Future<PlusApiResultPlusKnowledgeBaseVO?> update(PlusKnowledgeBaseForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/knowledge_base'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusKnowledgeBaseVO ? response : null;
  }

  /// Create a new knowledge base
  Future<PlusApiResultPlusKnowledgeBaseVO?> create(PlusKnowledgeBaseForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/knowledge_base'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusKnowledgeBaseVO ? response : null;
  }

  /// Get knowledge bases by page
  Future<PlusApiResultPagePlusKnowledgeBaseVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/knowledge_base/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusKnowledgeBaseVO ? response : null;
  }

  /// Get all knowledge bases
  Future<PlusApiResultListPlusKnowledgeBaseVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/knowledge_base/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusKnowledgeBaseVO ? response : null;
  }

  /// Get a knowledge base detail by ID
  Future<PlusApiResultPlusKnowledgeBaseVO?> getDetail(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/knowledge_base/get_detail'), params: params);
    return response is PlusApiResultPlusKnowledgeBaseVO ? response : null;
  }

  /// Get a knowledge base by ID
  Future<PlusApiResultPlusKnowledgeBaseVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/knowledge_base/${id}'));
    return response is PlusApiResultPlusKnowledgeBaseVO ? response : null;
  }

  /// Delete a knowledge base
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/knowledge_base/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
