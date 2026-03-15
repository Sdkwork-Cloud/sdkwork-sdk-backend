from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatCompletionChunk, ChatCompletionCreateForm, ChatMessageQueryListForm, PlusApiResult, PlusApiResultBoolean, PlusApiResultListPlusChatMessageVO, PlusApiResultPagePlusChatMessageVO, PlusApiResultPlusChatMessageVO, PlusChatMessageForm

class ChatApi:
    """chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update_message(self, body: PlusChatMessageForm) -> PlusApiResultPlusChatMessageVO:
        """Update an existing chat message"""
        return self._client.put(f"/backend/v3/api/chat/message", json=body)

    def create_message(self, body: PlusChatMessageForm) -> PlusApiResultPlusChatMessageVO:
        """Create a new chat message"""
        return self._client.post(f"/backend/v3/api/chat/message", json=body)

    def stop(self, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> PlusApiResult:
        """Stop a chat completion stream"""
        return self._client.post(f"/backend/v3/api/chat/stop", params=params, headers=headers)

    def load_more(self, body: Optional[ChatMessageQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChatMessageVO:
        """Get chat messages by page"""
        return self._client.post(f"/backend/v3/api/chat/message/load_more", json=body, params=params)

    def create_list_by_page(self, body: Optional[ChatMessageQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChatMessageVO:
        """Get chat messages by page"""
        return self._client.post(f"/backend/v3/api/chat/message/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[ChatMessageQueryListForm] = None) -> PlusApiResultListPlusChatMessageVO:
        """Get all chat messages"""
        return self._client.post(f"/backend/v3/api/chat/message/list/all", json=body)

    def create(self, body: ChatCompletionCreateForm, params: Optional[Dict[str, Any]] = None, headers: Optional[Dict[str, str]] = None) -> ChatCompletionChunk:
        """Create a chat completion"""
        return self._client.post(f"/backend/v3/api/chat/completions", json=body, params=params, headers=headers)

    def get_by_id_message(self, id: str) -> PlusApiResultPlusChatMessageVO:
        """Get a chat message by ID"""
        return self._client.get(f"/backend/v3/api/chat/message/{id}")

    def delete_message(self, id: str) -> PlusApiResultBoolean:
        """Delete a chat message"""
        return self._client.delete(f"/backend/v3/api/chat/message/{id}")
