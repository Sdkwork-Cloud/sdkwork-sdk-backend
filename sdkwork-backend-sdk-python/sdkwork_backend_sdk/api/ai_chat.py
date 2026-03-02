from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResult

class AiChatApi:
    """ai_chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def stop(self, headers: Optional[Dict[str, str]] = None) -> PlusApiResult:
        """Stop a chat completion stream"""
        return self._client.post(f"/backend/v3/api/chat/stop", headers=headers)

    def create(self, body: ChatCompletionCreateForm, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion"""
        return self._client.post(f"/backend/v3/api/chat/completions", json=body, headers=headers)
