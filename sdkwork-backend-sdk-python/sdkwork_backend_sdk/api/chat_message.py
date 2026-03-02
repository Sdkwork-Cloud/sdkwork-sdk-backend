from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatMessageQueryListForm, PlusApiResultBoolean, PlusApiResultListPlusChatMessageContentVO, PlusApiResultListPlusChatMessageVO, PlusApiResultPagePlusChatMessageContentVO, PlusApiResultPagePlusChatMessageVO, PlusApiResultPlusChatMessageContentVO, PlusApiResultPlusChatMessageVO, PlusChatMessageContentForm, PlusChatMessageForm, QueryListForm

class ChatMessageApi:
    """chat_message API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusChatMessageContentForm) -> PlusApiResultPlusChatMessageContentVO:
        """Update an existing chat message"""
        return self._client.put(f"/backend/v3/api/message", json=body)

    def create(self, body: PlusChatMessageContentForm) -> PlusApiResultPlusChatMessageContentVO:
        """Create a new chat message"""
        return self._client.post(f"/backend/v3/api/message", json=body)

    def update_message(self, body: PlusChatMessageForm) -> PlusApiResultPlusChatMessageVO:
        """Update an existing chat message"""
        return self._client.put(f"/backend/v3/api/chat/message", json=body)

    def create_message(self, body: PlusChatMessageForm) -> PlusApiResultPlusChatMessageVO:
        """Create a new chat message"""
        return self._client.post(f"/backend/v3/api/chat/message", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChatMessageContentVO:
        """Get chat messages by page"""
        return self._client.post(f"/backend/v3/api/message/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChatMessageContentVO:
        """Get all chat messages"""
        return self._client.post(f"/backend/v3/api/message/list/all", json=body)

    def load_more(self, body: Optional[ChatMessageQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChatMessageVO:
        """Get chat messages by page"""
        return self._client.post(f"/backend/v3/api/chat/message/load_more", json=body, params=params)

    def create_list_by_page(self, body: Optional[ChatMessageQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChatMessageVO:
        """Get chat messages by page"""
        return self._client.post(f"/backend/v3/api/chat/message/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[ChatMessageQueryListForm] = None) -> PlusApiResultListPlusChatMessageVO:
        """Get all chat messages"""
        return self._client.post(f"/backend/v3/api/chat/message/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusChatMessageContentVO:
        """Get chat message by ID"""
        return self._client.get(f"/backend/v3/api/message/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a chat message"""
        return self._client.delete(f"/backend/v3/api/message/{id}")

    def get_by_id_message(self, id: str) -> PlusApiResultPlusChatMessageVO:
        """Get a chat message by ID"""
        return self._client.get(f"/backend/v3/api/chat/message/{id}")

    def delete_message(self, id: str) -> PlusApiResultBoolean:
        """Delete a chat message"""
        return self._client.delete(f"/backend/v3/api/chat/message/{id}")
