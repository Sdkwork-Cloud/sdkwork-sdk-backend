from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipLevelBenefitVO, PlusApiResultPagePlusVipLevelBenefitVO, PlusApiResultPlusVipLevelBenefitVO, PlusVipLevelBenefitForm, QueryListForm

class VipLevelBenefitApi:
    """vip_level_benefit API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipLevelBenefitForm) -> PlusApiResultPlusVipLevelBenefitVO:
        """Update an existing VIP level benefit"""
        return self._client.put(f"/backend/v3/api/vip/level/benefit", json=body)

    def create(self, body: PlusVipLevelBenefitForm) -> PlusApiResultPlusVipLevelBenefitVO:
        """Create a new VIP level benefit"""
        return self._client.post(f"/backend/v3/api/vip/level/benefit", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipLevelBenefitVO:
        """Get VIP level benefits by page"""
        return self._client.post(f"/backend/v3/api/vip/level/benefit/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipLevelBenefitVO:
        """Get all VIP level benefits"""
        return self._client.post(f"/backend/v3/api/vip/level/benefit/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipLevelBenefitVO:
        """Get a VIP level benefit by ID"""
        return self._client.get(f"/backend/v3/api/vip/level/benefit/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP level benefit"""
        return self._client.delete(f"/backend/v3/api/vip/level/benefit/{id}")
