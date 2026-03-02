from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResult

class AiAgentChatApi:
    """ai_agent_chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def with_context(self, body: ChatCompletionCreateForm, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with agent"""
        return self._client.post(f"/backend/v3/api/agent/chat/with_context", json=body, headers=headers)

    def stop(self, headers: Optional[Dict[str, str]] = None) -> PlusApiResult:
        """Stop a chat completion stream"""
        return self._client.post(f"/backend/v3/api/agent/chat/stop", headers=headers)

    def resume_stream(self, body: ChatCompletionCreateForm, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with agent"""
        return self._client.post(f"/backend/v3/api/agent/chat/resume_stream", json=body, headers=headers)

    def create(self, body: ChatCompletionCreateForm, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with agent"""
        return self._client.post(f"/backend/v3/api/agent/chat/completions", json=body, headers=headers)
