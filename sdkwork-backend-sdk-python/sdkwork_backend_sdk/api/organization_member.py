from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusOrganizationMemberVO, PlusApiResultPagePlusOrganizationMemberVO, PlusApiResultPlusOrganizationMemberVO, PlusOrganizationMemberForm, QueryListForm

class OrganizationMemberApi:
    """organization_member API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusOrganizationMemberForm) -> PlusApiResultPlusOrganizationMemberVO:
        """Update organization member"""
        return self._client.put(f"/backend/v3/api/organization-member", json=body)

    def create(self, body: PlusOrganizationMemberForm) -> PlusApiResultPlusOrganizationMemberVO:
        """Create organization member"""
        return self._client.post(f"/backend/v3/api/organization-member", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOrganizationMemberVO:
        """Get organization members by page"""
        return self._client.post(f"/backend/v3/api/organization-member/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOrganizationMemberVO:
        """Get all organization members"""
        return self._client.post(f"/backend/v3/api/organization-member/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusOrganizationMemberVO:
        """Get organization member by ID"""
        return self._client.get(f"/backend/v3/api/organization-member/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete organization member"""
        return self._client.delete(f"/backend/v3/api/organization-member/{id}")
