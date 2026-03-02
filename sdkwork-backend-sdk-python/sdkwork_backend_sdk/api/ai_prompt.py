from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAiPromptForm, PlusApiResultBoolean, PlusApiResultListPlusAiPromptVO, PlusApiResultPagePlusAiPromptVO, PlusApiResultPlusAiPromptVO, QueryListForm

class AiPromptApi:
    """ai_prompt API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiPromptForm) -> PlusApiResultPlusAiPromptVO:
        """Update an existing AI prompt"""
        return self._client.put(f"/backend/v3/api/prompt", json=body)

    def create(self, body: PlusAiPromptForm) -> PlusApiResultPlusAiPromptVO:
        """Create a new AI prompt"""
        return self._client.post(f"/backend/v3/api/prompt", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiPromptVO:
        """Get AI prompts by page"""
        return self._client.post(f"/backend/v3/api/prompt/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiPromptVO:
        """Get all AI prompts"""
        return self._client.post(f"/backend/v3/api/prompt/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiPromptVO:
        """Get an AI prompt by ID"""
        return self._client.get(f"/backend/v3/api/prompt/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an AI prompt"""
        return self._client.delete(f"/backend/v3/api/prompt/{id}")
