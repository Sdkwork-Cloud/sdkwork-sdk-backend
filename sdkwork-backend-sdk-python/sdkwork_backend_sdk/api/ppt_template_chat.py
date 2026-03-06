from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResultBoolean

class PptTemplateChatApi:
    """ppt_template_chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def stop(self, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> PlusApiResultBoolean:
        return self._client.post(f"/backend/v3/api/ppt/template/chat/stop", params=params, headers=headers)

    def create(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion with PPT template"""
        return self._client.post(f"/backend/v3/api/ppt/template/chat/completions", json=body, params=params, headers=headers)
