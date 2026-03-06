from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultPagePlusMessage, PlusImMessageMarkReadForm, PlusImMessageQueryForm

class ImMessageApi:
    """im_message API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def mark_read(self, body: PlusImMessageMarkReadForm) -> PlusApiResultBoolean:
        """Mark conversation messages as read"""
        return self._client.post(f"/backend/v3/api/im/message/mark_read", json=body)

    def list_by_page(self, body: Optional[PlusImMessageQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusMessage:
        """Get messages by page"""
        return self._client.post(f"/backend/v3/api/im/message/list", json=body, params=params)
