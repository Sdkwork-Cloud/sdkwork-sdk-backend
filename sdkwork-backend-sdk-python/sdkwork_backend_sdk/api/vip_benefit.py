from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipBenefitVO, PlusApiResultPagePlusVipBenefitVO, PlusApiResultPlusVipBenefitVO, PlusVipBenefitForm, QueryListForm

class VipBenefitApi:
    """vip_benefit API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipBenefitForm) -> PlusApiResultPlusVipBenefitVO:
        """Update an existing VIP benefit"""
        return self._client.put(f"/backend/v3/api/vip/benefit", json=body)

    def create(self, body: PlusVipBenefitForm) -> PlusApiResultPlusVipBenefitVO:
        """Create a new VIP benefit"""
        return self._client.post(f"/backend/v3/api/vip/benefit", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipBenefitVO:
        """Get VIP benefits by page"""
        return self._client.post(f"/backend/v3/api/vip/benefit/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipBenefitVO:
        """Get all VIP benefits"""
        return self._client.post(f"/backend/v3/api/vip/benefit/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipBenefitVO:
        """Get a VIP benefit by ID"""
        return self._client.get(f"/backend/v3/api/vip/benefit/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP benefit"""
        return self._client.delete(f"/backend/v3/api/vip/benefit/{id}")
