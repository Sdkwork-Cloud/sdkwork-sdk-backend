from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GetAccessTokenForm, PlusApiResultBoolean, PlusApiResultListPlusTenantVO, PlusApiResultListTokenResult, PlusApiResultPagePlusTenantVO, PlusApiResultPlusTenantVO, PlusTenantForm, QueryListForm

class TenantApi:
    """tenant API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusTenantForm) -> PlusApiResultPlusTenantVO:
        """Update an existing tenant"""
        return self._client.put(f"/backend/v3/api/tenant", json=body)

    def create(self, body: PlusTenantForm) -> PlusApiResultPlusTenantVO:
        """Create a new tenant"""
        return self._client.post(f"/backend/v3/api/tenant", json=body)

    def uninstall(self, id: str, body: PlusTenantForm) -> PlusApiResultPlusTenantVO:
        """Uninstall app from tenant"""
        return self._client.post(f"/backend/v3/api/tenant/{id}/uninstall", json=body)

    def install(self, id: str, body: PlusTenantForm) -> PlusApiResultPlusTenantVO:
        """Install app for tenant"""
        return self._client.post(f"/backend/v3/api/tenant/{id}/install", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusTenantVO:
        """Get tenants by page"""
        return self._client.post(f"/backend/v3/api/tenant/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusTenantVO:
        """Get all tenants"""
        return self._client.post(f"/backend/v3/api/tenant/list/all", json=body)

    def get_access_tokens(self, body: GetAccessTokenForm) -> PlusApiResultListTokenResult:
        """Get access tokens"""
        return self._client.post(f"/backend/v3/api/tenant/get_access_tokens", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusTenantVO:
        """Get a tenant by ID"""
        return self._client.get(f"/backend/v3/api/tenant/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a tenant"""
        return self._client.delete(f"/backend/v3/api/tenant/{id}")
