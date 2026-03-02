from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAiToolForm, PlusApiResultBoolean, PlusApiResultListPlusAiToolVO, PlusApiResultPagePlusAiToolVO, PlusApiResultPlusAiToolVO, QueryListForm

class AiToolApi:
    """ai_tool API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiToolForm) -> PlusApiResultPlusAiToolVO:
        """Update an existing AI tool"""
        return self._client.put(f"/backend/v3/api/tool", json=body)

    def create(self, body: PlusAiToolForm) -> PlusApiResultPlusAiToolVO:
        """Create a new AI tool"""
        return self._client.post(f"/backend/v3/api/tool", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiToolVO:
        """Get AI tools by page"""
        return self._client.post(f"/backend/v3/api/tool/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiToolVO:
        """Get all AI tools"""
        return self._client.post(f"/backend/v3/api/tool/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiToolVO:
        """Get an AI tool by ID"""
        return self._client.get(f"/backend/v3/api/tool/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an AI tool"""
        return self._client.delete(f"/backend/v3/api/tool/{id}")
