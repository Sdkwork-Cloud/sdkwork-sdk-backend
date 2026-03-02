import '../http/client.dart';
import '../models.dart';

class AiVoiceSpeakerGenerationApi {
  final HttpClient _client;
  
  AiVoiceSpeakerGenerationApi(this._client);

  /// Create voice speaker generation task
  Future<PlusApiResultGenerateVoiceSpeakerVO?> create(GenerateVoiceSpeakerForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/voice-speaker/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateVoiceSpeakerVO ? response : null;
  }

  /// Get voice speaker generation result
  Future<PlusApiResultGenerateVoiceSpeakerVO?> getResultByTaskId(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/voice-speaker/result/${taskId}'));
    return response is PlusApiResultGenerateVoiceSpeakerVO ? response : null;
  }
}
