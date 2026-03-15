import '../http/client.dart';
import '../models.dart';

class GenerationApi {
  final HttpClient _client;
  
  GenerationApi(this._client);

  /// Update an existing AI generation record
  Future<PlusApiResultPlusAiGenerationVO?> update(PlusAiGenerationForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/generation'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiGenerationVO ? response : null;
  }

  /// Create a new AI generation record
  Future<PlusApiResultPlusAiGenerationVO?> create(PlusAiGenerationForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiGenerationVO ? response : null;
  }

  /// Update AI generated content
  Future<PlusApiResultPlusAiGenerationContentVO?> updateContent(PlusAiGenerationContentForm body) async {
    final response = await _client.put(ApiPaths.backendPath('/generation/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiGenerationContentVO ? response : null;
  }

  /// Create new AI generated content
  Future<PlusApiResultPlusAiGenerationContentVO?> createContent(PlusAiGenerationContentForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultPlusAiGenerationContentVO ? response : null;
  }

  /// Create voice speaker generation task
  Future<PlusApiResultGenerateVoiceSpeakerVO?> createVoiceSpeaker(GenerateVoiceSpeakerForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/voice-speaker/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateVoiceSpeakerVO ? response : null;
  }

  /// Create video generation task
  Future<PlusApiResultGenerateVideoVO?> createVideo(GenerateVideoForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/video/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateVideoVO ? response : null;
  }

  /// Create music generation task
  Future<PlusApiResultGenerateMusicVO?> createMusic(GenerateMusicForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/music/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateMusicVO ? response : null;
  }

  /// Get AI generation records by page
  Future<PlusApiResultPagePlusAiGenerationVO?> createListByPage(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiGenerationVO ? response : null;
  }

  /// Get all AI generation records
  Future<PlusApiResultListPlusAiGenerationVO?> createListAllEntities(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiGenerationVO ? response : null;
  }

  /// Create image generation task
  Future<PlusApiResultGenerateImageVO?> createImage(GenerateImageForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/image/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateImageVO ? response : null;
  }

  /// Get AI generated content by page
  Future<PlusApiResultPagePlusAiGenerationContentVO?> createListByPageContent(QueryListForm? body, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/content/list'), body: body, params: params, contentType: 'application/json');
    return response is PlusApiResultPagePlusAiGenerationContentVO ? response : null;
  }

  /// Get all AI generated content
  Future<PlusApiResultListPlusAiGenerationContentVO?> createListAllEntitiesContent(QueryListForm? body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/content/list/all'), body: body, contentType: 'application/json');
    return response is PlusApiResultListPlusAiGenerationContentVO ? response : null;
  }

  /// Create character generation task
  Future<PlusApiResultGenerateCharacterVO?> createCharacter(GenerateCharacterForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/character/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateCharacterVO ? response : null;
  }

  /// Create audio generation task
  Future<PlusApiResultGenerateAudioVO?> createAudio(GenerateAudioForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/audio/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateAudioVO ? response : null;
  }

  /// Create audio effect generation task
  Future<PlusApiResultGenerateAudioEffectVO?> createAudioEffect(GenerateAudioEffectForm body) async {
    final response = await _client.post(ApiPaths.backendPath('/generation/audio-effect/create'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerateAudioEffectVO ? response : null;
  }

  /// Get an AI generation record by ID
  Future<PlusApiResultPlusAiGenerationVO?> getById(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/${id}'));
    return response is PlusApiResultPlusAiGenerationVO ? response : null;
  }

  /// Delete an AI generation record
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/generation/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get voice speaker generation result
  Future<PlusApiResultGenerateVoiceSpeakerVO?> getResultByTaskId(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/voice-speaker/result/${taskId}'));
    return response is PlusApiResultGenerateVoiceSpeakerVO ? response : null;
  }

  /// Get video generation result
  Future<PlusApiResultGenerateVideoVO?> getResult(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/video/result/${taskId}'));
    return response is PlusApiResultGenerateVideoVO ? response : null;
  }

  /// Get music generation result
  Future<PlusApiResultGenerateMusicVO?> getResultMusic(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/music/result/${taskId}'));
    return response is PlusApiResultGenerateMusicVO ? response : null;
  }

  /// Get image generation result
  Future<PlusApiResultGenerateImageVO?> getResultImage(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/image/result/${taskId}'));
    return response is PlusApiResultGenerateImageVO ? response : null;
  }

  /// Get AI generated content by ID
  Future<PlusApiResultPlusAiGenerationContentVO?> getByIdContent(String id) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/content/${id}'));
    return response is PlusApiResultPlusAiGenerationContentVO ? response : null;
  }

  /// Delete AI generated content
  Future<PlusApiResultBoolean?> deleteContent(String id) async {
    final response = await _client.delete(ApiPaths.backendPath('/generation/content/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get character generation result
  Future<PlusApiResultGenerateCharacterVO?> getResultCharacter(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/character/result/${taskId}'));
    return response is PlusApiResultGenerateCharacterVO ? response : null;
  }

  /// Get audio generation result
  Future<PlusApiResultGenerateAudioVO?> getResultAudio(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/audio/result/${taskId}'));
    return response is PlusApiResultGenerateAudioVO ? response : null;
  }

  /// Get audio effect generation result
  Future<PlusApiResultGenerateAudioEffectVO?> getResultAudioEffect(String taskId) async {
    final response = await _client.get(ApiPaths.backendPath('/generation/audio-effect/result/${taskId}'));
    return response is PlusApiResultGenerateAudioEffectVO ? response : null;
  }
}
