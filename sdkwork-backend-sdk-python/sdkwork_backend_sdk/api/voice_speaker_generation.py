from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GenerateVoiceSpeakerForm, PlusApiResultGenerateVoiceSpeakerVO

class VoiceSpeakerGenerationApi:
    """voice_speaker_generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create(self, body: GenerateVoiceSpeakerForm) -> PlusApiResultGenerateVoiceSpeakerVO:
        """Create voice speaker generation task"""
        return self._client.post(f"/backend/v3/api/generation/voice-speaker/create", json=body)

    def get_result_by_task_id(self, taskId: str) -> PlusApiResultGenerateVoiceSpeakerVO:
        """Get voice speaker generation result"""
        return self._client.get(f"/backend/v3/api/generation/voice-speaker/result/{taskId}")
