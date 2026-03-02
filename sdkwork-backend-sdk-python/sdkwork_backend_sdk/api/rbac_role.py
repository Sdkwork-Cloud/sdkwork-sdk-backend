from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusRoleVO, PlusApiResultPagePlusRoleVO, PlusApiResultPlusRoleVO, PlusRoleForm, QueryListForm

class RbacRoleApi:
    """rbac_role API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusRoleForm) -> PlusApiResultPlusRoleVO:
        """Update an existing system role"""
        return self._client.put(f"/backend/v3/api/role", json=body)

    def create(self, body: PlusRoleForm) -> PlusApiResultPlusRoleVO:
        """Create a new system role"""
        return self._client.post(f"/backend/v3/api/role", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusRoleVO:
        """Get system roles by page"""
        return self._client.post(f"/backend/v3/api/role/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusRoleVO:
        """Get all system roles"""
        return self._client.post(f"/backend/v3/api/role/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusRoleVO:
        """Get a system role by ID"""
        return self._client.get(f"/backend/v3/api/role/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a system role"""
        return self._client.delete(f"/backend/v3/api/role/{id}")
