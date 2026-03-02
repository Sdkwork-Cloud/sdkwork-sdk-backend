from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipPointChangeVO, PlusApiResultPagePlusVipPointChangeVO, PlusApiResultPlusVipPointChangeVO, PlusVipPointChangeForm, QueryListForm

class VipPointChangeApi:
    """vip_point_change API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipPointChangeForm) -> PlusApiResultPlusVipPointChangeVO:
        """Update an existing VIP point change record"""
        return self._client.put(f"/backend/v3/api/vip/point/change", json=body)

    def create(self, body: PlusVipPointChangeForm) -> PlusApiResultPlusVipPointChangeVO:
        """Create a new VIP point change record"""
        return self._client.post(f"/backend/v3/api/vip/point/change", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipPointChangeVO:
        """Get VIP point change records by page"""
        return self._client.post(f"/backend/v3/api/vip/point/change/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipPointChangeVO:
        """Get all VIP point change records"""
        return self._client.post(f"/backend/v3/api/vip/point/change/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipPointChangeVO:
        """Get a VIP point change record by ID"""
        return self._client.get(f"/backend/v3/api/vip/point/change/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP point change record"""
        return self._client.delete(f"/backend/v3/api/vip/point/change/{id}")
