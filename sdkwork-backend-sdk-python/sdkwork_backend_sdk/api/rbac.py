from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusUserRoleVO, PlusApiResultPagePlusUserRoleVO, PlusApiResultPlusUserRoleVO, PlusUserRoleForm, QueryListForm

class RbacApi:
    """rbac API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusUserRoleForm) -> PlusApiResultPlusUserRoleVO:
        """Update user-role relationship"""
        return self._client.put(f"/backend/v3/api/rbac/user/role", json=body)

    def create(self, body: PlusUserRoleForm) -> PlusApiResultPlusUserRoleVO:
        """Create user-role relationship"""
        return self._client.post(f"/backend/v3/api/rbac/user/role", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserRoleVO:
        """Get user-role relationships by page"""
        return self._client.post(f"/backend/v3/api/rbac/user/role/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserRoleVO:
        """Get all user-role relationships"""
        return self._client.post(f"/backend/v3/api/rbac/user/role/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusUserRoleVO:
        """Get user-role relationship by ID"""
        return self._client.get(f"/backend/v3/api/rbac/user/role/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete user-role relationship"""
        return self._client.delete(f"/backend/v3/api/rbac/user/role/{id}")
