from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListLong, PlusApiResultListPlusDepartmentVO, PlusApiResultListPlusOrganizationMemberVO, PlusApiResultListPlusPositionVO, PlusApiResultPagePlusOrganizationMemberVO, PlusApiResultPlusOrganizationMemberVO, PlusOrganizationMemberForm, QueryListForm

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

    def transfer_position(self, id: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultBoolean:
        """Transfer member position"""
        return self._client.put(f"/backend/v3/api/organization-member/{id}/positions/transfer", params=params)

    def set_primary_department(self, id: str, departmentId: str) -> PlusApiResultBoolean:
        """Set member primary department"""
        return self._client.put(f"/backend/v3/api/organization-member/{id}/departments/{departmentId}/primary")

    def transfer_department(self, id: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultBoolean:
        """Transfer member department"""
        return self._client.put(f"/backend/v3/api/organization-member/{id}/departments/transfer", params=params)

    def deactivate_member(self, id: str) -> PlusApiResultBoolean:
        """Deactivate member"""
        return self._client.put(f"/backend/v3/api/organization-member/{id}/deactivate")

    def activate_member(self, id: str) -> PlusApiResultBoolean:
        """Activate member"""
        return self._client.put(f"/backend/v3/api/organization-member/{id}/activate")

    def add_to_department(self, id: str, departmentId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultBoolean:
        """Bind member to department"""
        return self._client.post(f"/backend/v3/api/organization-member/{id}/departments/{departmentId}", params=params)

    def remove_from_department(self, id: str, departmentId: str) -> PlusApiResultBoolean:
        """Unbind member from department"""
        return self._client.delete(f"/backend/v3/api/organization-member/{id}/departments/{departmentId}")

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

    def get_member_role_ids(self, id: str) -> PlusApiResultListLong:
        """Get member role ids"""
        return self._client.get(f"/backend/v3/api/organization-member/{id}/roles")

    def get_member_positions(self, id: str) -> PlusApiResultListPlusPositionVO:
        """Get member positions"""
        return self._client.get(f"/backend/v3/api/organization-member/{id}/positions")

    def get_member_departments(self, id: str) -> PlusApiResultListPlusDepartmentVO:
        """Get member departments"""
        return self._client.get(f"/backend/v3/api/organization-member/{id}/departments")
