from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResultBoolean

class KnowledgeBaseChatApi:
    """knowledge_base_chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def stop(self, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> PlusApiResultBoolean:
        return self._client.post(f"/backend/v3/api/knowledge_base/chat/stop", params=params, headers=headers)

    def create(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with Knowledge base"""
        return self._client.post(f"/backend/v3/api/knowledge_base/chat/completions", json=body, params=params, headers=headers)
