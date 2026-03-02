from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipLevelVO, PlusApiResultPagePlusVipLevelVO, PlusApiResultPlusVipLevelVO, PlusVipLevelForm, QueryListForm

class VipLevelApi:
    """vip_level API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipLevelForm) -> PlusApiResultPlusVipLevelVO:
        """Update an existing VIP level"""
        return self._client.put(f"/backend/v3/api/vip/level", json=body)

    def create(self, body: PlusVipLevelForm) -> PlusApiResultPlusVipLevelVO:
        """Create a new VIP level"""
        return self._client.post(f"/backend/v3/api/vip/level", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipLevelVO:
        """Get VIP levels by page"""
        return self._client.post(f"/backend/v3/api/vip/level/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipLevelVO:
        """Get all VIP levels"""
        return self._client.post(f"/backend/v3/api/vip/level/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipLevelVO:
        """Get a VIP level by ID"""
        return self._client.get(f"/backend/v3/api/vip/level/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP level"""
        return self._client.delete(f"/backend/v3/api/vip/level/{id}")
