from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PermissionCheckForm, PlusApiResultBoolean, PlusApiResultListString, RoleCheckForm

class AuthorizationApi:
    """authorization API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def has_role(self, body: RoleCheckForm) -> PlusApiResultBoolean:
        """检查用户角色"""
        return self._client.post(f"/backend/v3/api/auth/authorization/has_role", json=body)

    def has_permission(self, body: PermissionCheckForm) -> PlusApiResultBoolean:
        """检查用户权限"""
        return self._client.post(f"/backend/v3/api/auth/authorization/has_permission", json=body)

    def get_roles(self) -> PlusApiResultListString:
        """获取用户角色列表"""
        return self._client.get(f"/backend/v3/api/auth/authorization/roles")

    def get_permissions(self) -> PlusApiResultListString:
        """获取用户权限列表"""
        return self._client.get(f"/backend/v3/api/auth/authorization/permissions")
