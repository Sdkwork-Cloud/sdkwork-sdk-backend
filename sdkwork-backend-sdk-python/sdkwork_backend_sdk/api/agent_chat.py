from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResult

class AgentChatApi:
    """agent_chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def with_context(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with agent"""
        return self._client.post(f"/backend/v3/api/agent/chat/with_context", json=body, params=params, headers=headers)

    def stop(self, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> PlusApiResult:
        """Stop a chat completion stream"""
        return self._client.post(f"/backend/v3/api/agent/chat/stop", params=params, headers=headers)

    def resume_stream(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with agent"""
        return self._client.post(f"/backend/v3/api/agent/chat/resume_stream", json=body, params=params, headers=headers)

    def create(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with agent"""
        return self._client.post(f"/backend/v3/api/agent/chat/completions", json=body, params=params, headers=headers)
