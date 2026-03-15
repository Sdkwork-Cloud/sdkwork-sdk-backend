from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusPermissionVO, PlusApiResultPagePlusPermissionVO, PlusApiResultPlusPermissionVO, PlusPermissionForm, QueryListForm

class PermissionApi:
    """permission API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusPermissionForm) -> PlusApiResultPlusPermissionVO:
        return self._client.put(f"/backend/v3/api/permission", json=body)

    def create(self, body: PlusPermissionForm) -> PlusApiResultPlusPermissionVO:
        return self._client.post(f"/backend/v3/api/permission", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPermissionVO:
        """List permissions by page"""
        return self._client.post(f"/backend/v3/api/permission/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPermissionVO:
        """List all permissions"""
        return self._client.post(f"/backend/v3/api/permission/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusPermissionVO:
        return self._client.get(f"/backend/v3/api/permission/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        return self._client.delete(f"/backend/v3/api/permission/{id}")
