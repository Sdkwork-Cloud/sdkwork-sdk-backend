from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GenerateCharacterForm, PlusApiResultGenerateCharacterVO

class CharacterGenerationApi:
    """character_generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create(self, body: GenerateCharacterForm) -> PlusApiResultGenerateCharacterVO:
        """Create character generation task"""
        return self._client.post(f"/backend/v3/api/generation/character/create", json=body)

    def get_result(self, taskId: str) -> PlusApiResultGenerateCharacterVO:
        """Get character generation result"""
        return self._client.get(f"/backend/v3/api/generation/character/result/{taskId}")
