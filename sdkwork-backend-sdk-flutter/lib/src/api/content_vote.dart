import '../http/client.dart';
import '../models.dart';

class ContentVoteApi {
  final HttpClient _client;
  
  ContentVoteApi(this._client);

  /// Update an existing content vote
  Future<PlusApiResultContentVoteVO?> update(ContentVoteForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/vote'), body: body, contentType: 'application/json');
    return response is PlusApiResultContentVoteVO ? response : null;
  }

  /// Create a new content vote
  Future<PlusApiResultContentVoteVO?> create(ContentVoteForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/vote'), body: body, contentType: 'application/json');
    return response is PlusApiResultContentVoteVO ? response : null;
  }

  /// Get content votes by page
  Future<PlusApiResultPageContentVoteVO?> listByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/vote/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPageContentVoteVO ? response : null;
  }

  /// Get all content votes
  Future<PlusApiResultListContentVoteVO?> listAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/vote/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListContentVoteVO ? response : null;
  }

  /// Get a content vote by ID
  Future<PlusApiResultContentVoteVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/vote/${id}'));
    return response is PlusApiResultContentVoteVO ? response : null;
  }

  /// Delete a content vote
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/vote/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
