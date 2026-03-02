from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GenerateAudioForm, PlusApiResultGenerateAudioVO

class AiAudioGenerationApi:
    """ai_audio_generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create(self, body: GenerateAudioForm) -> PlusApiResultGenerateAudioVO:
        """Create audio generation task"""
        return self._client.post(f"/backend/v3/api/generation/audio/create", json=body)

    def get_result(self, taskId: str) -> PlusApiResultGenerateAudioVO:
        """Get audio generation result"""
        return self._client.get(f"/backend/v3/api/generation/audio/result/{taskId}")
