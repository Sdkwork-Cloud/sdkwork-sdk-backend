import '../http/client.dart';
import '../models.dart';

class VoiceSpeakerApi {
  final HttpClient _client;
  
  VoiceSpeakerApi(this._client);

  /// Update an existing voice speaker
  Future<PlusApiResultPlusVoiceSpeakerVO?> update(PlusVoiceSpeakerForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/voice/speaker'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVoiceSpeakerVO ? response : null;
  }

  /// Create a new voice speaker
  Future<PlusApiResultPlusVoiceSpeakerVO?> create(PlusVoiceSpeakerForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/voice/speaker'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusVoiceSpeakerVO ? response : null;
  }

  /// Get voice speakers by page
  Future<PlusApiResultPagePlusVoiceSpeakerVO?> listPublic(PlusVoiceSpeakerQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/voice/speaker/list_public'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVoiceSpeakerVO ? response : null;
  }

  /// Get voice speakers by page
  Future<PlusApiResultPagePlusVoiceSpeakerVO?> listByPage(PlusVoiceSpeakerQueryForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/voice/speaker/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusVoiceSpeakerVO ? response : null;
  }

  /// Get all voice speakers
  Future<PlusApiResultListPlusVoiceSpeakerVO?> listAllEntities(PlusVoiceSpeakerQueryForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/voice/speaker/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusVoiceSpeakerVO ? response : null;
  }

  /// Get a voice speaker by ID
  Future<PlusApiResultPlusVoiceSpeakerVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/voice/speaker/${id}'));
    return response is PlusApiResultPlusVoiceSpeakerVO ? response : null;
  }

  /// Delete a voice speaker
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/voice/speaker/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
