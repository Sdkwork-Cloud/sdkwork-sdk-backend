from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipPackVO, PlusApiResultPagePlusVipPackVO, PlusApiResultPlusVipPackVO, PlusVipPackForm, QueryListForm

class VipPackageApi:
    """vip_package API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipPackForm) -> PlusApiResultPlusVipPackVO:
        """Update VIP Package"""
        return self._client.put(f"/backend/v3/api/vip/pack", json=body)

    def create(self, body: PlusVipPackForm) -> PlusApiResultPlusVipPackVO:
        """Create VIP Package"""
        return self._client.post(f"/backend/v3/api/vip/pack", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipPackVO:
        """Get VIP Packages by Page"""
        return self._client.post(f"/backend/v3/api/vip/pack/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipPackVO:
        """Get All VIP Packages"""
        return self._client.post(f"/backend/v3/api/vip/pack/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipPackVO:
        """Get VIP Package by ID"""
        return self._client.get(f"/backend/v3/api/vip/pack/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete VIP Package"""
        return self._client.delete(f"/backend/v3/api/vip/pack/{id}")
