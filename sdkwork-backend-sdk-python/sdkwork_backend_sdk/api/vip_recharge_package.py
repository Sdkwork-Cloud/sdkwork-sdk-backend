from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipRechargePackVO, PlusApiResultPagePlusVipRechargePackVO, PlusApiResultPlusVipRechargePackVO, PlusVipRechargePackForm, QueryListForm

class VipRechargePackageApi:
    """vip_recharge_package API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipRechargePackForm) -> PlusApiResultPlusVipRechargePackVO:
        """Update an existing VIP recharge package"""
        return self._client.put(f"/backend/v3/api/vip/recharge/pack", json=body)

    def create(self, body: PlusVipRechargePackForm) -> PlusApiResultPlusVipRechargePackVO:
        """Create a new VIP recharge package"""
        return self._client.post(f"/backend/v3/api/vip/recharge/pack", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipRechargePackVO:
        """Get VIP recharge packages by page"""
        return self._client.post(f"/backend/v3/api/vip/recharge/pack/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipRechargePackVO:
        """Get all VIP recharge packages"""
        return self._client.post(f"/backend/v3/api/vip/recharge/pack/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipRechargePackVO:
        """Get a VIP recharge package by ID"""
        return self._client.get(f"/backend/v3/api/vip/recharge/pack/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP recharge package"""
        return self._client.delete(f"/backend/v3/api/vip/recharge/pack/{id}")
