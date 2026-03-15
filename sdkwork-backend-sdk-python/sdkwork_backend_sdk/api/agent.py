from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusAiAgentForm, PlusAiAgentQueryListForm, PlusAiAgentToolForm, PlusApiResult, PlusApiResultBoolean, PlusApiResultListPlusAiAgentToolVO, PlusApiResultListPlusAiAgentVO, PlusApiResultPagePlusAiAgentToolVO, PlusApiResultPagePlusAiAgentVO, PlusApiResultPlusAiAgentToolVO, PlusApiResultPlusAiAgentVO, QueryListForm

class AgentApi:
    """agent API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusAiAgentForm) -> PlusApiResultPlusAiAgentVO:
        """Update an existing AI agent"""
        return self._client.put(f"/backend/v3/api/agent", json=body)

    def create(self, body: PlusAiAgentForm) -> PlusApiResultPlusAiAgentVO:
        """Create a new AI agent"""
        return self._client.post(f"/backend/v3/api/agent", json=body)

    def update_tool(self, body: PlusAiAgentToolForm) -> PlusApiResultPlusAiAgentToolVO:
        """Update an existing agent-tool relationship"""
        return self._client.put(f"/backend/v3/api/agent/tool", json=body)

    def create_tool(self, body: PlusAiAgentToolForm) -> PlusApiResultPlusAiAgentToolVO:
        """Create a new agent-tool relationship"""
        return self._client.post(f"/backend/v3/api/agent/tool", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiAgentToolVO:
        """Get agent-tool relationships by page"""
        return self._client.post(f"/backend/v3/api/agent/tool/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusAiAgentToolVO:
        """Get all agent-tool relationships"""
        return self._client.post(f"/backend/v3/api/agent/tool/list/all", json=body)

    def list_public(self, body: Optional[PlusAiAgentQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiAgentVO:
        """Get public AI agents by page"""
        return self._client.post(f"/backend/v3/api/agent/list_public", json=body, params=params)

    def create_list_by_page_agent(self, body: Optional[PlusAiAgentQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusAiAgentVO:
        """Get AI agents by page"""
        return self._client.post(f"/backend/v3/api/agent/list", json=body, params=params)

    def create_list_all_entities_agent(self, body: Optional[PlusAiAgentQueryListForm] = None) -> PlusApiResultListPlusAiAgentVO:
        """Get all AI agents"""
        return self._client.post(f"/backend/v3/api/agent/list/all", json=body)

    def with_context(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with agent"""
        return self._client.post(f"/backend/v3/api/agent/chat/with_context", json=body, params=params, headers=headers)

    def stop(self, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> PlusApiResult:
        """Stop a chat completion stream"""
        return self._client.post(f"/backend/v3/api/agent/chat/stop", params=params, headers=headers)

    def resume_stream(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with agent"""
        return self._client.post(f"/backend/v3/api/agent/chat/resume_stream", json=body, params=params, headers=headers)

    def create_completions(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with agent"""
        return self._client.post(f"/backend/v3/api/agent/chat/completions", json=body, params=params, headers=headers)

    def get_by_id(self, id: str) -> PlusApiResultPlusAiAgentVO:
        """Get an AI agent by ID"""
        return self._client.get(f"/backend/v3/api/agent/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an AI agent"""
        return self._client.delete(f"/backend/v3/api/agent/{id}")

    def get_by_id_tool(self, id: str) -> PlusApiResultPlusAiAgentToolVO:
        """Get an agent-tool relationship by ID"""
        return self._client.get(f"/backend/v3/api/agent/tool/{id}")

    def delete_tool(self, id: str) -> PlusApiResultBoolean:
        """Delete an agent-tool relationship"""
        return self._client.delete(f"/backend/v3/api/agent/tool/{id}")
