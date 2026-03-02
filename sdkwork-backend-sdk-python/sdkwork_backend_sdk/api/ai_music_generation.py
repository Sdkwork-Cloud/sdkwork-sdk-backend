from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GenerateMusicForm, PlusApiResultGenerateMusicVO

class AiMusicGenerationApi:
    """ai_music_generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create(self, body: GenerateMusicForm) -> PlusApiResultGenerateMusicVO:
        """Create music generation task"""
        return self._client.post(f"/backend/v3/api/generation/music/create", json=body)

    def get_result(self, taskId: str) -> PlusApiResultGenerateMusicVO:
        """Get music generation result"""
        return self._client.get(f"/backend/v3/api/generation/music/result/{taskId}")
