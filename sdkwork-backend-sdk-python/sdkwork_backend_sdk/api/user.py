from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusUserVO, PlusApiResultPagePlusUserVO, PlusApiResultPlusUserProfileVO, PlusApiResultPlusUserVO, PlusUserForm, QueryListForm

class UserApi:
    """user API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusUserForm) -> PlusApiResultPlusUserVO:
        """Update an existing user"""
        return self._client.put(f"/backend/v3/api/user", json=body)

    def create(self, body: PlusUserForm) -> PlusApiResultPlusUserVO:
        """Create a new user"""
        return self._client.post(f"/backend/v3/api/user", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserVO:
        """Get users by page"""
        return self._client.post(f"/backend/v3/api/user/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserVO:
        """Get all users"""
        return self._client.post(f"/backend/v3/api/user/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusUserVO:
        """Get a user by ID"""
        return self._client.get(f"/backend/v3/api/user/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a user"""
        return self._client.delete(f"/backend/v3/api/user/{id}")

    def get_profile(self) -> PlusApiResultPlusUserProfileVO:
        """Get current user profile"""
        return self._client.get(f"/backend/v3/api/user/profile")
