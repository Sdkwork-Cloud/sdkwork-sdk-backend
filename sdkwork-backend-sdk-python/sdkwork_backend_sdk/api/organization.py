from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GetAccessTokenForm, PlusApiResultBoolean, PlusApiResultListPlusOrganizationVO, PlusApiResultListTokenResult, PlusApiResultPagePlusOrganizationVO, PlusApiResultPlusOrganizationVO, PlusOrganizationForm, QueryListForm

class OrganizationApi:
    """organization API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusOrganizationForm) -> PlusApiResultPlusOrganizationVO:
        """Update an existing organization"""
        return self._client.put(f"/backend/v3/api/organization", json=body)

    def create(self, body: PlusOrganizationForm) -> PlusApiResultPlusOrganizationVO:
        """Create a new organization"""
        return self._client.post(f"/backend/v3/api/organization", json=body)

    def uninstall(self, id: str, body: PlusOrganizationForm) -> PlusApiResultPlusOrganizationVO:
        """Uninstall app from organization"""
        return self._client.post(f"/backend/v3/api/organization/{id}/uninstall", json=body)

    def install(self, id: str, body: PlusOrganizationForm) -> PlusApiResultPlusOrganizationVO:
        """Install app for organization"""
        return self._client.post(f"/backend/v3/api/organization/{id}/install", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOrganizationVO:
        """Get organizations by page"""
        return self._client.post(f"/backend/v3/api/organization/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOrganizationVO:
        """Get all organizations"""
        return self._client.post(f"/backend/v3/api/organization/list/all", json=body)

    def get_access_tokens(self, body: GetAccessTokenForm) -> PlusApiResultListTokenResult:
        """Get access tokens"""
        return self._client.post(f"/backend/v3/api/organization/get_access_tokens", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusOrganizationVO:
        """Get an organization by ID"""
        return self._client.get(f"/backend/v3/api/organization/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an organization"""
        return self._client.delete(f"/backend/v3/api/organization/{id}")
