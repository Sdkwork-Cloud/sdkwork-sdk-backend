from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GetAccessTokenForm, PlusApiResultBoolean, PlusApiResultListPlusMemberRelationsVO, PlusApiResultListPlusOrganizationVO, PlusApiResultListPlusPositionVO, PlusApiResultListTokenResult, PlusApiResultPagePlusMemberRelationsVO, PlusApiResultPagePlusOrganizationVO, PlusApiResultPagePlusPositionVO, PlusApiResultPlusMemberRelationsVO, PlusApiResultPlusOrganizationVO, PlusApiResultPlusPositionVO, PlusMemberRelationsForm, PlusOrganizationForm, PlusPositionForm, QueryListForm

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

    def update_position(self, body: PlusPositionForm) -> PlusApiResultPlusPositionVO:
        """Update an existing position"""
        return self._client.put(f"/backend/v3/api/organization/position", json=body)

    def create_position(self, body: PlusPositionForm) -> PlusApiResultPlusPositionVO:
        """Create a new position"""
        return self._client.post(f"/backend/v3/api/organization/position", json=body)

    def update_member_relations(self, body: PlusMemberRelationsForm) -> PlusApiResultPlusMemberRelationsVO:
        """Update member relation"""
        return self._client.put(f"/backend/v3/api/organization/member-relations", json=body)

    def create_member_relations(self, body: PlusMemberRelationsForm) -> PlusApiResultPlusMemberRelationsVO:
        """Create member relation"""
        return self._client.post(f"/backend/v3/api/organization/member-relations", json=body)

    def uninstall(self, id: str, body: PlusOrganizationForm) -> PlusApiResultPlusOrganizationVO:
        """Uninstall app from organization"""
        return self._client.post(f"/backend/v3/api/organization/{id}/uninstall", json=body)

    def install(self, id: str, body: PlusOrganizationForm) -> PlusApiResultPlusOrganizationVO:
        """Install app for organization"""
        return self._client.post(f"/backend/v3/api/organization/{id}/install", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPositionVO:
        """Get positions by page"""
        return self._client.post(f"/backend/v3/api/organization/position/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPositionVO:
        """Get all positions"""
        return self._client.post(f"/backend/v3/api/organization/position/list/all", json=body)

    def create_list_by_page_member_relations(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusMemberRelationsVO:
        """Get member relations by page"""
        return self._client.post(f"/backend/v3/api/organization/member-relations/list", json=body, params=params)

    def create_list_all_entities_member_relations(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusMemberRelationsVO:
        """Get all member relations"""
        return self._client.post(f"/backend/v3/api/organization/member-relations/list/all", json=body)

    def create_list_by_page_organization(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOrganizationVO:
        """Get organizations by page"""
        return self._client.post(f"/backend/v3/api/organization/list", json=body, params=params)

    def create_list_all_entities_organization(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOrganizationVO:
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

    def get_children(self, id: str) -> PlusApiResultListPlusOrganizationVO:
        """Get child organizations"""
        return self._client.get(f"/backend/v3/api/organization/{id}/children")

    def get_by_id_position(self, id: str) -> PlusApiResultPlusPositionVO:
        """Get a position by ID"""
        return self._client.get(f"/backend/v3/api/organization/position/{id}")

    def delete_position(self, id: str) -> PlusApiResultBoolean:
        """Delete a position"""
        return self._client.delete(f"/backend/v3/api/organization/position/{id}")

    def get_by_id_member_relations(self, id: str) -> PlusApiResultPlusMemberRelationsVO:
        """Get member relation by ID"""
        return self._client.get(f"/backend/v3/api/organization/member-relations/{id}")

    def delete_member_relations(self, id: str) -> PlusApiResultBoolean:
        """Delete member relation"""
        return self._client.delete(f"/backend/v3/api/organization/member-relations/{id}")
