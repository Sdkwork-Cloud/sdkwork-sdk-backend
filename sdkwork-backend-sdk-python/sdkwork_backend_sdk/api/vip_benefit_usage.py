from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipBenefitUsageVO, PlusApiResultPagePlusVipBenefitUsageVO, PlusApiResultPlusVipBenefitUsageVO, PlusVipBenefitUsageForm, QueryListForm

class VipBenefitUsageApi:
    """vip_benefit_usage API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipBenefitUsageForm) -> PlusApiResultPlusVipBenefitUsageVO:
        """Update an existing VIP benefit usage record"""
        return self._client.put(f"/backend/v3/api/vip/benefit/usage", json=body)

    def create(self, body: PlusVipBenefitUsageForm) -> PlusApiResultPlusVipBenefitUsageVO:
        """Create a new VIP benefit usage record"""
        return self._client.post(f"/backend/v3/api/vip/benefit/usage", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipBenefitUsageVO:
        """Get VIP benefit usage records by page"""
        return self._client.post(f"/backend/v3/api/vip/benefit/usage/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipBenefitUsageVO:
        """Get all VIP benefit usage records"""
        return self._client.post(f"/backend/v3/api/vip/benefit/usage/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipBenefitUsageVO:
        """Get a VIP benefit usage record by ID"""
        return self._client.get(f"/backend/v3/api/vip/benefit/usage/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP benefit usage record"""
        return self._client.delete(f"/backend/v3/api/vip/benefit/usage/{id}")
