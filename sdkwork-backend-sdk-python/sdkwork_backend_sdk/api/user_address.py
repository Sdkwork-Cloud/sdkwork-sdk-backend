from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusUserAddressVO, PlusApiResultPagePlusUserAddressVO, PlusApiResultPlusUserAddressVO, PlusUserAddressForm, QueryListForm

class UserAddressApi:
    """user_address API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusUserAddressForm) -> PlusApiResultPlusUserAddressVO:
        """Update an existing user address"""
        return self._client.put(f"/backend/v3/api/user/address", json=body)

    def create(self, body: PlusUserAddressForm) -> PlusApiResultPlusUserAddressVO:
        """Create a new user address"""
        return self._client.post(f"/backend/v3/api/user/address", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserAddressVO:
        """Get addresses by page"""
        return self._client.post(f"/backend/v3/api/user/address/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserAddressVO:
        """Get all user addresses"""
        return self._client.post(f"/backend/v3/api/user/address/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusUserAddressVO:
        """Get address by ID"""
        return self._client.get(f"/backend/v3/api/user/address/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a user address"""
        return self._client.delete(f"/backend/v3/api/user/address/{id}")
