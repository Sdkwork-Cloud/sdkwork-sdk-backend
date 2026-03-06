import '../http/client.dart';
import '../models.dart';

class AudioEffectGenerationApi {
  final HttpClient _client;
  
  AudioEffectGenerationApi(this._client);

  /// Create audio effect generation task
  Future<PlusApiResultGenerateAudioEffectVO?> create(GenerateAudioEffectForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/audio-effect/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateAudioEffectVO ? response : null;
  }

  /// Get audio effect generation result
  Future<PlusApiResultGenerateAudioEffectVO?> getResult(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/audio-effect/result/${taskId}'));
    return response is PlusApiResultGenerateAudioEffectVO ? response : null;
  }
}
