from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipPackGroupVO, PlusApiResultPagePlusVipPackGroupVO, PlusApiResultPlusVipPackGroupVO, PlusVipPackGroupForm, PlusVipPackGroupQueryForm, QueryListForm

class VipPackageGroupApi:
    """vip_package_group API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipPackGroupForm) -> PlusApiResultPlusVipPackGroupVO:
        """Update an existing VIP package group"""
        return self._client.put(f"/backend/v3/api/vip/pack_group", json=body)

    def create(self, body: PlusVipPackGroupForm) -> PlusApiResultPlusVipPackGroupVO:
        """Create a new VIP package group"""
        return self._client.post(f"/backend/v3/api/vip/pack_group", json=body)

    def list_public(self, body: Optional[PlusVipPackGroupQueryForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipPackGroupVO:
        """List public"""
        return self._client.post(f"/backend/v3/api/vip/pack_group/list_public", json=body, params=params)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipPackGroupVO:
        """Get VIP package groups by page"""
        return self._client.post(f"/backend/v3/api/vip/pack_group/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipPackGroupVO:
        """Get all VIP package groups"""
        return self._client.post(f"/backend/v3/api/vip/pack_group/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusVipPackGroupVO:
        """Get a VIP package group by ID"""
        return self._client.get(f"/backend/v3/api/vip/pack_group/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP package group"""
        return self._client.delete(f"/backend/v3/api/vip/pack_group/{id}")
