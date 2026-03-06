from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusDepartmentVO, PlusApiResultListPlusOrganizationMemberVO, PlusApiResultPagePlusDepartmentVO, PlusApiResultPlusDepartmentVO, PlusDepartmentForm, QueryListForm

class DepartmentApi:
    """department API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusDepartmentForm) -> PlusApiResultPlusDepartmentVO:
        """Update an existing department"""
        return self._client.put(f"/backend/v3/api/department", json=body)

    def create(self, body: PlusDepartmentForm) -> PlusApiResultPlusDepartmentVO:
        """Create a new department"""
        return self._client.post(f"/backend/v3/api/department", json=body)

    def move(self, id: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPlusDepartmentVO:
        """Move department"""
        return self._client.put(f"/backend/v3/api/department/{id}/move", params=params)

    def set_primary(self, id: str, memberId: str) -> PlusApiResultBoolean:
        """Set primary department"""
        return self._client.put(f"/backend/v3/api/department/{id}/members/{memberId}/primary")

    def add_member_to(self, id: str, memberId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultBoolean:
        """Add member to department"""
        return self._client.post(f"/backend/v3/api/department/{id}/members/{memberId}", params=params)

    def remove_member_from(self, id: str, memberId: str) -> PlusApiResultBoolean:
        """Remove member from department"""
        return self._client.delete(f"/backend/v3/api/department/{id}/members/{memberId}")

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusDepartmentVO:
        """Get departments by page"""
        return self._client.post(f"/backend/v3/api/department/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusDepartmentVO:
        """Get all departments"""
        return self._client.post(f"/backend/v3/api/department/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusDepartmentVO:
        """Get a department by ID"""
        return self._client.get(f"/backend/v3/api/department/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a department"""
        return self._client.delete(f"/backend/v3/api/department/{id}")

    def get_department_members(self, id: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListPlusOrganizationMemberVO:
        """Get department members"""
        return self._client.get(f"/backend/v3/api/department/{id}/members", params=params)
