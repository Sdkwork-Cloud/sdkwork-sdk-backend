import '../http/client.dart';
import '../models.dart';

class AiCharacterGenerationApi {
  final HttpClient _client;
  
  AiCharacterGenerationApi(this._client);

  /// Create character generation task
  Future<PlusApiResultGenerateCharacterVO?> create(GenerateCharacterForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/character/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateCharacterVO ? response : null;
  }

  /// Get character generation result
  Future<PlusApiResultGenerateCharacterVO?> getResult(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/character/result/${taskId}'));
    return response is PlusApiResultGenerateCharacterVO ? response : null;
  }
}
