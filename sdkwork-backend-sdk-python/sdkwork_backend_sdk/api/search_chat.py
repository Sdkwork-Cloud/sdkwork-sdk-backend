from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResultBoolean

class SearchChatApi:
    """search_chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def stop(self, headers: Optional[Dict[str, str]] = None) -> PlusApiResultBoolean:
        return self._client.post(f"/backend/v3/api/search/chat/stop", headers=headers)

    def create(self, body: ChatCompletionCreateForm, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with Search"""
        return self._client.post(f"/backend/v3/api/search/chat/completions", json=body, headers=headers)
