import '../http/client.dart';
import '../models.dart';

class AiVideoGenerationApi {
  final HttpClient _client;
  
  AiVideoGenerationApi(this._client);

  /// Create video generation task
  Future<PlusApiResultGenerateVideoVO?> create(GenerateVideoForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/video/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateVideoVO ? response : null;
  }

  /// Get video generation result
  Future<PlusApiResultGenerateVideoVO?> getResult(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/video/result/${taskId}'));
    return response is PlusApiResultGenerateVideoVO ? response : null;
  }
}
