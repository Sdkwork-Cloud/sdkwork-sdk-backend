from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusRolePermissionVO, PlusApiResultListPlusRoleVO, PlusApiResultPagePlusRolePermissionVO, PlusApiResultPagePlusRoleVO, PlusApiResultPlusRolePermissionVO, PlusApiResultPlusRoleVO, PlusRoleForm, PlusRolePermissionForm, QueryListForm

class RoleApi:
    """role API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusRoleForm) -> PlusApiResultPlusRoleVO:
        """Update an existing system role"""
        return self._client.put(f"/backend/v3/api/role", json=body)

    def create(self, body: PlusRoleForm) -> PlusApiResultPlusRoleVO:
        """Create a new system role"""
        return self._client.post(f"/backend/v3/api/role", json=body)

    def update_permission(self, body: PlusRolePermissionForm) -> PlusApiResultPlusRolePermissionVO:
        """Update role-permission association"""
        return self._client.put(f"/backend/v3/api/role/permission", json=body)

    def create_permission(self, body: PlusRolePermissionForm) -> PlusApiResultPlusRolePermissionVO:
        """Create role-permission association"""
        return self._client.post(f"/backend/v3/api/role/permission", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusRolePermissionVO:
        """Get role-permission associations by page"""
        return self._client.post(f"/backend/v3/api/role/permission/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusRolePermissionVO:
        """Get all role-permission associations"""
        return self._client.post(f"/backend/v3/api/role/permission/list/all", json=body)

    def create_list_by_page_role(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusRoleVO:
        """Get system roles by page"""
        return self._client.post(f"/backend/v3/api/role/list", json=body, params=params)

    def create_list_all_entities_role(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusRoleVO:
        """Get all system roles"""
        return self._client.post(f"/backend/v3/api/role/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusRoleVO:
        """Get a system role by ID"""
        return self._client.get(f"/backend/v3/api/role/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a system role"""
        return self._client.delete(f"/backend/v3/api/role/{id}")

    def get_by_id_permission(self, id: str) -> PlusApiResultPlusRolePermissionVO:
        """Get role-permission association by ID"""
        return self._client.get(f"/backend/v3/api/role/permission/{id}")

    def delete_permission(self, id: str) -> PlusApiResultBoolean:
        """Delete role-permission association"""
        return self._client.delete(f"/backend/v3/api/role/permission/{id}")
