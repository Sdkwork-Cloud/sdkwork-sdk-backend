import '../http/client.dart';
import '../models.dart';

class AiMusicGenerationApi {
  final HttpClient _client;
  
  AiMusicGenerationApi(this._client);

  /// Create music generation task
  Future<PlusApiResultGenerateMusicVO?> create(GenerateMusicForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/music/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateMusicVO ? response : null;
  }

  /// Get music generation result
  Future<PlusApiResultGenerateMusicVO?> getResult(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/music/result/${taskId}'));
    return response is PlusApiResultGenerateMusicVO ? response : null;
  }
}
