from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GenerateVideoForm, PlusApiResultGenerateVideoVO

class VideoGenerationApi:
    """video_generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create(self, body: GenerateVideoForm) -> PlusApiResultGenerateVideoVO:
        """Create video generation task"""
        return self._client.post(f"/backend/v3/api/generation/video/create", json=body)

    def get_result(self, taskId: str) -> PlusApiResultGenerateVideoVO:
        """Get video generation result"""
        return self._client.get(f"/backend/v3/api/generation/video/result/{taskId}")
