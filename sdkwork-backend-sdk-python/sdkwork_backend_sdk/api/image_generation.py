from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GenerateImageForm, PlusApiResultGenerateImageVO

class ImageGenerationApi:
    """image_generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create(self, body: GenerateImageForm) -> PlusApiResultGenerateImageVO:
        """Create image generation task"""
        return self._client.post(f"/backend/v3/api/generation/image/create", json=body)

    def get_result(self, taskId: str) -> PlusApiResultGenerateImageVO:
        """Get image generation result"""
        return self._client.get(f"/backend/v3/api/generation/image/result/{taskId}")
