from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GenerateAudioEffectForm, GenerateAudioForm, GenerateCharacterForm, GenerateImageForm, GenerateMusicForm, GenerateVideoForm, GenerateVoiceSpeakerForm, PlusAiGenerationContentForm, PlusAiGenerationForm, PlusApiResultBoolean, PlusApiResultGenerateAudioEffectVO, PlusApiResultGenerateAudioVO, PlusApiResultGenerateCharacterVO, PlusApiResultGenerateImageVO, PlusApiResultGenerateMusicVO, PlusApiResultGenerateVideoVO, PlusApiResultGenerateVoiceSpeakerVO, PlusApiResultListPlusAiGenerationContentVO, PlusApiResultListPlusAiGenerationVO, PlusApiResultPagePlusAiGenerationContentVO, PlusApiResultPagePlusAiGenerationVO, PlusApiResultPlusAiGenerationContentVO, PlusApiResultPlusAiGenerationVO, QueryListForm

class GenerationApi:
    """generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiGenerationForm) -> PlusApiResultPlusAiGenerationVO:
        """Update an existing AI generation record"""
        return self._client.put(f"/backend/v3/api/generation", json=body)

    def create(self, body: PlusAiGenerationForm) -> PlusApiResultPlusAiGenerationVO:
        """Create a new AI generation record"""
        return self._client.post(f"/backend/v3/api/generation", json=body)

    def update_content(self, body: PlusAiGenerationContentForm) -> PlusApiResultPlusAiGenerationContentVO:
        """Update AI generated content"""
        return self._client.put(f"/backend/v3/api/generation/content", json=body)

    def create_content(self, body: PlusAiGenerationContentForm) -> PlusApiResultPlusAiGenerationContentVO:
        """Create new AI generated content"""
        return self._client.post(f"/backend/v3/api/generation/content", json=body)

    def create_voice_speaker(self, body: GenerateVoiceSpeakerForm) -> PlusApiResultGenerateVoiceSpeakerVO:
        """Create voice speaker generation task"""
        return self._client.post(f"/backend/v3/api/generation/voice-speaker/create", json=body)

    def create_video(self, body: GenerateVideoForm) -> PlusApiResultGenerateVideoVO:
        """Create video generation task"""
        return self._client.post(f"/backend/v3/api/generation/video/create", json=body)

    def create_music(self, body: GenerateMusicForm) -> PlusApiResultGenerateMusicVO:
        """Create music generation task"""
        return self._client.post(f"/backend/v3/api/generation/music/create", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiGenerationVO:
        """Get AI generation records by page"""
        return self._client.post(f"/backend/v3/api/generation/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiGenerationVO:
        """Get all AI generation records"""
        return self._client.post(f"/backend/v3/api/generation/list/all", json=body)

    def create_image(self, body: GenerateImageForm) -> PlusApiResultGenerateImageVO:
        """Create image generation task"""
        return self._client.post(f"/backend/v3/api/generation/image/create", json=body)

    def create_list_by_page_content(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiGenerationContentVO:
        """Get AI generated content by page"""
        return self._client.post(f"/backend/v3/api/generation/content/list", json=body, params=params)

    def create_list_all_entities_content(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiGenerationContentVO:
        """Get all AI generated content"""
        return self._client.post(f"/backend/v3/api/generation/content/list/all", json=body)

    def create_character(self, body: GenerateCharacterForm) -> PlusApiResultGenerateCharacterVO:
        """Create character generation task"""
        return self._client.post(f"/backend/v3/api/generation/character/create", json=body)

    def create_audio(self, body: GenerateAudioForm) -> PlusApiResultGenerateAudioVO:
        """Create audio generation task"""
        return self._client.post(f"/backend/v3/api/generation/audio/create", json=body)

    def create_audio_effect(self, body: GenerateAudioEffectForm) -> PlusApiResultGenerateAudioEffectVO:
        """Create audio effect generation task"""
        return self._client.post(f"/backend/v3/api/generation/audio-effect/create", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiGenerationVO:
        """Get an AI generation record by ID"""
        return self._client.get(f"/backend/v3/api/generation/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an AI generation record"""
        return self._client.delete(f"/backend/v3/api/generation/{id}")

    def get_result_by_task_id(self, taskId: str) -> PlusApiResultGenerateVoiceSpeakerVO:
        """Get voice speaker generation result"""
        return self._client.get(f"/backend/v3/api/generation/voice-speaker/result/{taskId}")

    def get_result(self, taskId: str) -> PlusApiResultGenerateVideoVO:
        """Get video generation result"""
        return self._client.get(f"/backend/v3/api/generation/video/result/{taskId}")

    def get_result_music(self, taskId: str) -> PlusApiResultGenerateMusicVO:
        """Get music generation result"""
        return self._client.get(f"/backend/v3/api/generation/music/result/{taskId}")

    def get_result_image(self, taskId: str) -> PlusApiResultGenerateImageVO:
        """Get image generation result"""
        return self._client.get(f"/backend/v3/api/generation/image/result/{taskId}")

    def get_by_id_content(self, id: str) -> PlusApiResultPlusAiGenerationContentVO:
        """Get AI generated content by ID"""
        return self._client.get(f"/backend/v3/api/generation/content/{id}")

    def delete_content(self, id: str) -> PlusApiResultBoolean:
        """Delete AI generated content"""
        return self._client.delete(f"/backend/v3/api/generation/content/{id}")

    def get_result_character(self, taskId: str) -> PlusApiResultGenerateCharacterVO:
        """Get character generation result"""
        return self._client.get(f"/backend/v3/api/generation/character/result/{taskId}")

    def get_result_audio(self, taskId: str) -> PlusApiResultGenerateAudioVO:
        """Get audio generation result"""
        return self._client.get(f"/backend/v3/api/generation/audio/result/{taskId}")

    def get_result_audio_effect(self, taskId: str) -> PlusApiResultGenerateAudioEffectVO:
        """Get audio effect generation result"""
        return self._client.get(f"/backend/v3/api/generation/audio-effect/result/{taskId}")
