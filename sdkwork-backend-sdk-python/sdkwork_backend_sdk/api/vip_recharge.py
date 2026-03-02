from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipRechargeVO, PlusApiResultPagePlusVipRechargeVO, PlusApiResultPlusVipRechargeVO, PlusVipRechargeForm, QueryListForm

class VipRechargeApi:
    """vip_recharge API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipRechargeForm) -> PlusApiResultPlusVipRechargeVO:
        """Update an existing VIP recharge record"""
        return self._client.put(f"/backend/v3/api/vip/recharge", json=body)

    def create(self, body: PlusVipRechargeForm) -> PlusApiResultPlusVipRechargeVO:
        """Create a new VIP recharge record"""
        return self._client.post(f"/backend/v3/api/vip/recharge", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipRechargeVO:
        """Get VIP recharge records by page"""
        return self._client.post(f"/backend/v3/api/vip/recharge/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipRechargeVO:
        """Get all VIP recharge records"""
        return self._client.post(f"/backend/v3/api/vip/recharge/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipRechargeVO:
        """Get a VIP recharge record by ID"""
        return self._client.get(f"/backend/v3/api/vip/recharge/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP recharge record"""
        return self._client.delete(f"/backend/v3/api/vip/recharge/{id}")
