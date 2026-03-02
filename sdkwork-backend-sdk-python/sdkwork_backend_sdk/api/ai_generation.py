from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAiGenerationForm, PlusApiResultBoolean, PlusApiResultListPlusAiGenerationVO, PlusApiResultPagePlusAiGenerationVO, PlusApiResultPlusAiGenerationVO, QueryListForm

class AiGenerationApi:
    """ai_generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiGenerationForm) -> PlusApiResultPlusAiGenerationVO:
        """Update an existing AI generation record"""
        return self._client.put(f"/backend/v3/api/generation", json=body)

    def create(self, body: PlusAiGenerationForm) -> PlusApiResultPlusAiGenerationVO:
        """Create a new AI generation record"""
        return self._client.post(f"/backend/v3/api/generation", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiGenerationVO:
        """Get AI generation records by page"""
        return self._client.post(f"/backend/v3/api/generation/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiGenerationVO:
        """Get all AI generation records"""
        return self._client.post(f"/backend/v3/api/generation/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiGenerationVO:
        """Get an AI generation record by ID"""
        return self._client.get(f"/backend/v3/api/generation/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an AI generation record"""
        return self._client.delete(f"/backend/v3/api/generation/{id}")
