from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusVipUserVO, PlusApiResultPagePlusVipUserVO, PlusApiResultPlusVipUserVO, PlusVipUserForm, QueryListForm

class VipUserApi:
    """vip_user API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusVipUserForm) -> PlusApiResultPlusVipUserVO:
        """Update an existing VIP user"""
        return self._client.put(f"/backend/v3/api/vip/user", json=body)

    def create(self, body: PlusVipUserForm) -> PlusApiResultPlusVipUserVO:
        """Create a new VIP user"""
        return self._client.post(f"/backend/v3/api/vip/user", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusVipUserVO:
        """Get VIP users by page"""
        return self._client.post(f"/backend/v3/api/vip/user/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusVipUserVO:
        """Get all VIP users"""
        return self._client.post(f"/backend/v3/api/vip/user/list/all", json=body)

    def get_current_user(self) -> PlusApiResultPlusVipUserVO:
        """Get a VIP user by ID"""
        return self._client.post(f"/backend/v3/api/vip/user/get_current_user")

    def get_by_id(self, id: str) -> PlusApiResultPlusVipUserVO:
        """Get a VIP user by ID"""
        return self._client.get(f"/backend/v3/api/vip/user/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a VIP user"""
        return self._client.delete(f"/backend/v3/api/vip/user/{id}")
