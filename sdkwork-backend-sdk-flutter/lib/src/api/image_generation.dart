import '../http/client.dart';
import '../models.dart';

class ImageGenerationApi {
  final HttpClient _client;
  
  ImageGenerationApi(this._client);

  /// Create image generation task
  Future<PlusApiResultGenerateImageVO?> create(GenerateImageForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/image/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateImageVO ? response : null;
  }

  /// Get image generation result
  Future<PlusApiResultGenerateImageVO?> getResult(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/image/result/${taskId}'));
    return response is PlusApiResultGenerateImageVO ? response : null;
  }
}
