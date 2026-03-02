from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusDetailVO, PlusApiResultPagePlusDetailVO, PlusApiResultPlusDetailVO, PlusDetailForm, QueryListForm

class DetailApi:
    """detail API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusDetailForm) -> PlusApiResultPlusDetailVO:
        """Update existing detail content"""
        return self._client.put(f"/backend/v3/api/detail", json=body)

    def create(self, body: PlusDetailForm) -> PlusApiResultPlusDetailVO:
        """Create new detail content"""
        return self._client.post(f"/backend/v3/api/detail", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusDetailVO:
        """Get detail contents by page"""
        return self._client.post(f"/backend/v3/api/detail/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusDetailVO:
        """Get all detail contents"""
        return self._client.post(f"/backend/v3/api/detail/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusDetailVO:
        """Get detail content by ID"""
        return self._client.get(f"/backend/v3/api/detail/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete detail content"""
        return self._client.delete(f"/backend/v3/api/detail/{id}")
