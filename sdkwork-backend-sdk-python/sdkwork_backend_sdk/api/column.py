from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusColumnVO, PlusApiResultPagePlusColumnVO, PlusApiResultPlusColumnVO, PlusColumnForm, QueryListForm

class ColumnApi:
    """column API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusColumnForm) -> PlusApiResultPlusColumnVO:
        """Update column"""
        return self._client.put(f"/backend/v3/api/column", json=body)

    def create(self, body: PlusColumnForm) -> PlusApiResultPlusColumnVO:
        """Create column"""
        return self._client.post(f"/backend/v3/api/column", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusColumnVO:
        """Get columns by page"""
        return self._client.post(f"/backend/v3/api/column/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusColumnVO:
        """Get all columns"""
        return self._client.post(f"/backend/v3/api/column/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusColumnVO:
        """Get column by ID"""
        return self._client.get(f"/backend/v3/api/column/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete column"""
        return self._client.delete(f"/backend/v3/api/column/{id}")
