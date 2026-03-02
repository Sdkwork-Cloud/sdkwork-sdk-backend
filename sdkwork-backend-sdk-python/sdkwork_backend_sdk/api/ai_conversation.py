from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusConversationVO, PlusApiResultPagePlusConversationVO, PlusApiResultPlusConversationVO, PlusConversationForm, PlusConversationOpenForm, PlusConversationQueryListForm, PlusMessageFeedbackForm

class AiConversationApi:
    """ai_conversation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusConversationForm) -> PlusApiResultPlusConversationVO:
        """Update an existing conversation"""
        return self._client.put(f"/backend/v3/api/conversation", json=body)

    def create(self, body: PlusConversationForm) -> PlusApiResultPlusConversationVO:
        """Create a new conversation"""
        return self._client.post(f"/backend/v3/api/conversation", json=body)

    def pin_conversation(self, id: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPlusConversationVO:
        """Pin/Unpin a conversation"""
        return self._client.post(f"/backend/v3/api/conversation/{id}/pin", params=params)

    def open(self, body: Optional[PlusConversationOpenForm] = None) -> PlusApiResultPlusConversationVO:
        """Get all open conversations"""
        return self._client.post(f"/backend/v3/api/conversation/open", json=body)

    def message_feedback(self, body: PlusMessageFeedbackForm) -> PlusApiResultBoolean:
        """Update an existing conversation"""
        return self._client.post(f"/backend/v3/api/conversation/message_feedback", json=body)

    def list_by_page(self, body: Optional[PlusConversationQueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusConversationVO:
        """Get conversations by page"""
        return self._client.post(f"/backend/v3/api/conversation/list", json=body, params=params)

    def list_all_entities(self, body: Optional[PlusConversationQueryListForm] = None) -> PlusApiResultListPlusConversationVO:
        """Get all conversations"""
        return self._client.post(f"/backend/v3/api/conversation/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusConversationVO:
        """Get a conversation by ID"""
        return self._client.get(f"/backend/v3/api/conversation/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a conversation"""
        return self._client.delete(f"/backend/v3/api/conversation/{id}")
