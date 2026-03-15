from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusImGroupVO, PlusApiResultPagePlusImGroupVO, PlusApiResultPagePlusMessage, PlusApiResultPlusImGroupVO, PlusImGroupForm, PlusImMessageMarkReadForm, PlusImMessageQueryForm, QueryListForm

class ImApi:
    """im API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusImGroupForm) -> PlusApiResultPlusImGroupVO:
        """Update an existing chat group"""
        return self._client.put(f"/backend/v3/api/im/group", json=body)

    def create(self, body: PlusImGroupForm) -> PlusApiResultPlusImGroupVO:
        """Create a new chat group"""
        return self._client.post(f"/backend/v3/api/im/group", json=body)

    def mark_read(self, body: PlusImMessageMarkReadForm) -> PlusApiResultBoolean:
        """Mark conversation messages as read"""
        return self._client.post(f"/backend/v3/api/im/message/mark_read", json=body)

    def create_list_by_page(self, body: Optional[PlusImMessageQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusMessage:
        """Get messages by page"""
        return self._client.post(f"/backend/v3/api/im/message/list", json=body, params=params)

    def create_list_by_page_group(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusImGroupVO:
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
