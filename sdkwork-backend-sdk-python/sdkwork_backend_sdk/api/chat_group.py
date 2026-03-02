from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusImGroupVO, PlusApiResultPagePlusImGroupVO, PlusApiResultPlusImGroupVO, PlusImGroupForm, QueryListForm

class ChatGroupApi:
    """chat_group API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusImGroupForm) -> PlusApiResultPlusImGroupVO:
        """Update an existing chat group"""
        return self._client.put(f"/backend/v3/api/im/group", json=body)

    def create(self, body: PlusImGroupForm) -> PlusApiResultPlusImGroupVO:
        """Create a new chat group"""
        return self._client.post(f"/backend/v3/api/im/group", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusImGroupVO:
        """Get chat groups by page"""
        return self._client.post(f"/backend/v3/api/im/group/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusImGroupVO:
        """Get all chat groups"""
        return self._client.post(f"/backend/v3/api/im/group/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusImGroupVO:
        """Get a chat group by ID"""
        return self._client.get(f"/backend/v3/api/im/group/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a chat group"""
        return self._client.delete(f"/backend/v3/api/im/group/{id}")
