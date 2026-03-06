from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusAiAgentToolForm, PlusApiResultBoolean, PlusApiResultListPlusAiAgentToolVO, PlusApiResultPagePlusAiAgentToolVO, PlusApiResultPlusAiAgentToolVO, QueryListForm

class AgentToolRelationshipApi:
    """agent_tool_relationship API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiAgentToolForm) -> PlusApiResultPlusAiAgentToolVO:
        """Update an existing agent-tool relationship"""
        return self._client.put(f"/backend/v3/api/agent/tool", json=body)

    def create(self, body: PlusAiAgentToolForm) -> PlusApiResultPlusAiAgentToolVO:
        """Create a new agent-tool relationship"""
        return self._client.post(f"/backend/v3/api/agent/tool", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiAgentToolVO:
        """Get agent-tool relationships by page"""
        return self._client.post(f"/backend/v3/api/agent/tool/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiAgentToolVO:
        """Get all agent-tool relationships"""
        return self._client.post(f"/backend/v3/api/agent/tool/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiAgentToolVO:
        """Get an agent-tool relationship by ID"""
        return self._client.get(f"/backend/v3/api/agent/tool/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an agent-tool relationship"""
        return self._client.delete(f"/backend/v3/api/agent/tool/{id}")
