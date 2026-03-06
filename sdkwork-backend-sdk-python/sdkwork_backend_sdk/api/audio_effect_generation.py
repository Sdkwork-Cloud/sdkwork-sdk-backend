from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GenerateAudioEffectForm, PlusApiResultGenerateAudioEffectVO

class AudioEffectGenerationApi:
    """audio_effect_generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create(self, body: GenerateAudioEffectForm) -> PlusApiResultGenerateAudioEffectVO:
        """Create audio effect generation task"""
        return self._client.post(f"/backend/v3/api/generation/audio-effect/create", json=body)

    def get_result(self, taskId: str) -> PlusApiResultGenerateAudioEffectVO:
        """Get audio effect generation result"""
        return self._client.get(f"/backend/v3/api/generation/audio-effect/result/{taskId}")
