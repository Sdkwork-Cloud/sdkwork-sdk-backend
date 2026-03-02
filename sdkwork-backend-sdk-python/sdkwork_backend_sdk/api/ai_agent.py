from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAiAgentForm, PlusAiAgentQueryListForm, PlusApiResultBoolean, PlusApiResultListPlusAiAgentVO, PlusApiResultPagePlusAiAgentVO, PlusApiResultPlusAiAgentVO

class AiAgentApi:
    """ai_agent API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiAgentForm) -> PlusApiResultPlusAiAgentVO:
        """Update an existing AI agent"""
        return self._client.put(f"/backend/v3/api/agent", json=body)

    def create(self, body: PlusAiAgentForm) -> PlusApiResultPlusAiAgentVO:
        """Create a new AI agent"""
        return self._client.post(f"/backend/v3/api/agent", json=body)

    def list_public(self, body: Optional[PlusAiAgentQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiAgentVO:
        """Get public AI agents by page"""
        return self._client.post(f"/backend/v3/api/agent/list_public", json=body, params=params)

    def list_by_page(self, body: Optional[PlusAiAgentQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiAgentVO:
        """Get AI agents by page"""
        return self._client.post(f"/backend/v3/api/agent/list", json=body, params=params)

    def list_all_entities(self, body: Optional[PlusAiAgentQueryListForm] = None) -> PlusApiResultListPlusAiAgentVO:
        """Get all AI agents"""
        return self._client.post(f"/backend/v3/api/agent/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiAgentVO:
        """Get an AI agent by ID"""
        return self._client.get(f"/backend/v3/api/agent/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an AI agent"""
        return self._client.delete(f"/backend/v3/api/agent/{id}")
