import '../http/client.dart';
import '../models.dart';

class AiConversationApi {
  final HttpClient _client;
  
  AiConversationApi(this._client);

  /// Update an existing conversation
  Future<PlusApiResultPlusConversationVO?> update(PlusConversationForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/conversation'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusConversationVO ? response : null;
  }

  /// Create a new conversation
  Future<PlusApiResultPlusConversationVO?> create(PlusConversationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/conversation'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusConversationVO ? response : null;
  }

  /// Pin/Unpin a conversation
  Future<PlusApiResultPlusConversationVO?> pinConversation(String id, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/conversation/${id}/pin'), params: params);
    return response is PlusApiResultPlusConversationVO ? response : null;
  }

  /// Get all open conversations
  Future<PlusApiResultPlusConversationVO?> open(PlusConversationOpenForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/conversation/open'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusConversationVO ? response : null;
  }

  /// Update an existing conversation
  Future<PlusApiResultBoolean?> messageFeedback(PlusMessageFeedbackForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/conversation/message_feedback'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get conversations by page
  Future<PlusApiResultPagePlusConversationVO?> listByPage(PlusConversationQueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/conversation/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusConversationVO ? response : null;
  }

  /// Get all conversations
  Future<PlusApiResultListPlusConversationVO?> listAllEntities(PlusConversationQueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/conversation/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusConversationVO ? response : null;
  }

  /// Get a conversation by ID
  Future<PlusApiResultPlusConversationVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/conversation/${id}'));
    return response is PlusApiResultPlusConversationVO ? response : null;
  }

  /// Delete a conversation
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/conversation/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
