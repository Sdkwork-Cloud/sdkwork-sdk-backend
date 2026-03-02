from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusDepartmentVO, PlusApiResultPagePlusDepartmentVO, PlusApiResultPlusDepartmentVO, PlusDepartmentForm, QueryListForm

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
