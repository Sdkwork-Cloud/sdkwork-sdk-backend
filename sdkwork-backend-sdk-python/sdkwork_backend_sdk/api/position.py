from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusPositionVO, PlusApiResultPagePlusPositionVO, PlusApiResultPlusPositionVO, PlusPositionForm, QueryListForm

class PositionApi:
    """position API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusPositionForm) -> PlusApiResultPlusPositionVO:
        """Update an existing position"""
        return self._client.put(f"/backend/v3/api/organization/position", json=body)

    def create(self, body: PlusPositionForm) -> PlusApiResultPlusPositionVO:
        """Create a new position"""
        return self._client.post(f"/backend/v3/api/organization/position", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPositionVO:
        """Get positions by page"""
        return self._client.post(f"/backend/v3/api/organization/position/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPositionVO:
        """Get all positions"""
        return self._client.post(f"/backend/v3/api/organization/position/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusPositionVO:
        """Get a position by ID"""
        return self._client.get(f"/backend/v3/api/organization/position/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a position"""
        return self._client.delete(f"/backend/v3/api/organization/position/{id}")
