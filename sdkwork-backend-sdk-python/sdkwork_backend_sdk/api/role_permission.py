from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusRolePermissionVO, PlusApiResultPagePlusRolePermissionVO, PlusApiResultPlusRolePermissionVO, PlusRolePermissionForm, QueryListForm

class RolePermissionApi:
    """role_permission API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusRolePermissionForm) -> PlusApiResultPlusRolePermissionVO:
        """Update role-permission association"""
        return self._client.put(f"/backend/v3/api/role/permission", json=body)

    def create(self, body: PlusRolePermissionForm) -> PlusApiResultPlusRolePermissionVO:
        """Create role-permission association"""
        return self._client.post(f"/backend/v3/api/role/permission", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusRolePermissionVO:
        """Get role-permission associations by page"""
        return self._client.post(f"/backend/v3/api/role/permission/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusRolePermissionVO:
        """Get all role-permission associations"""
        return self._client.post(f"/backend/v3/api/role/permission/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusRolePermissionVO:
        """Get role-permission association by ID"""
        return self._client.get(f"/backend/v3/api/role/permission/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete role-permission association"""
        return self._client.delete(f"/backend/v3/api/role/permission/{id}")
