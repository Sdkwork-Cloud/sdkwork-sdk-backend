from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAiGenerationContentForm, PlusApiResultBoolean, PlusApiResultListPlusAiGenerationContentVO, PlusApiResultPagePlusAiGenerationContentVO, PlusApiResultPlusAiGenerationContentVO, QueryListForm

class AiGenerationContentApi:
    """ai_generation_content API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiGenerationContentForm) -> PlusApiResultPlusAiGenerationContentVO:
        """Update AI generated content"""
        return self._client.put(f"/backend/v3/api/generation/content", json=body)

    def create(self, body: PlusAiGenerationContentForm) -> PlusApiResultPlusAiGenerationContentVO:
        """Create new AI generated content"""
        return self._client.post(f"/backend/v3/api/generation/content", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiGenerationContentVO:
        """Get AI generated content by page"""
        return self._client.post(f"/backend/v3/api/generation/content/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiGenerationContentVO:
        """Get all AI generated content"""
        return self._client.post(f"/backend/v3/api/generation/content/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiGenerationContentVO:
        """Get AI generated content by ID"""
        return self._client.get(f"/backend/v3/api/generation/content/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete AI generated content"""
        return self._client.delete(f"/backend/v3/api/generation/content/{id}")
