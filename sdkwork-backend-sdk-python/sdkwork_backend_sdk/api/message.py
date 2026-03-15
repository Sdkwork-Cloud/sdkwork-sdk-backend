from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusChatMessageContentVO, PlusApiResultPagePlusChatMessageContentVO, PlusApiResultPlusChatMessageContentVO, PlusChatMessageContentForm, QueryListForm

class MessageApi:
    """message API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusChatMessageContentForm) -> PlusApiResultPlusChatMessageContentVO:
        """Update an existing chat message"""
        return self._client.put(f"/backend/v3/api/message", json=body)

    def create(self, body: PlusChatMessageContentForm) -> PlusApiResultPlusChatMessageContentVO:
        """Create a new chat message"""
        return self._client.post(f"/backend/v3/api/message", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusChatMessageContentVO:
        """Get chat messages by page"""
        return self._client.post(f"/backend/v3/api/message/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusChatMessageContentVO:
        """Get all chat messages"""
        return self._client.post(f"/backend/v3/api/message/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusChatMessageContentVO:
        """Get chat message by ID"""
        return self._client.get(f"/backend/v3/api/message/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a chat message"""
        return self._client.delete(f"/backend/v3/api/message/{id}")
