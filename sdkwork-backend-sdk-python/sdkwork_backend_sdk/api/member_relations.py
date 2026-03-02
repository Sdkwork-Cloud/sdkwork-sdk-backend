from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusMemberRelationsVO, PlusApiResultPagePlusMemberRelationsVO, PlusApiResultPlusMemberRelationsVO, PlusMemberRelationsForm, QueryListForm

class MemberRelationsApi:
    """member_relations API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusMemberRelationsForm) -> PlusApiResultPlusMemberRelationsVO:
        """Update member relation"""
        return self._client.put(f"/backend/v3/api/organization/member-relations", json=body)

    def create(self, body: PlusMemberRelationsForm) -> PlusApiResultPlusMemberRelationsVO:
        """Create member relation"""
        return self._client.post(f"/backend/v3/api/organization/member-relations", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusMemberRelationsVO:
        """Get member relations by page"""
        return self._client.post(f"/backend/v3/api/organization/member-relations/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusMemberRelationsVO:
        """Get all member relations"""
        return self._client.post(f"/backend/v3/api/organization/member-relations/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusMemberRelationsVO:
        """Get member relation by ID"""
        return self._client.get(f"/backend/v3/api/organization/member-relations/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete member relation"""
        return self._client.delete(f"/backend/v3/api/organization/member-relations/{id}")
