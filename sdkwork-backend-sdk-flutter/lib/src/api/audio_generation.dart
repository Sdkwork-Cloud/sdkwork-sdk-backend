import '../http/client.dart';
import '../models.dart';

class AudioGenerationApi {
  final HttpClient _client;
  
  AudioGenerationApi(this._client);

  /// Create audio generation task
  Future<PlusApiResultGenerateAudioVO?> create(GenerateAudioForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/audio/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateAudioVO ? response : null;
  }

  /// Get audio generation result
  Future<PlusApiResultGenerateAudioVO?> getResult(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/audio/result/${taskId}'));
    return response is PlusApiResultGenerateAudioVO ? response : null;
  }
}
