from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusMemberLevelVO, PlusApiResultPagePlusMemberLevelVO, PlusApiResultPlusMemberLevelVO, PlusMemberLevelForm, QueryListForm

class MemberLevelApi:
    """member_level API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusMemberLevelForm) -> PlusApiResultPlusMemberLevelVO:
        """Update an existing member level"""
        return self._client.put(f"/backend/v3/api/member/level", json=body)

    def create(self, body: PlusMemberLevelForm) -> PlusApiResultPlusMemberLevelVO:
        """Create a new member level"""
        return self._client.post(f"/backend/v3/api/member/level", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusMemberLevelVO:
        """Get member levels by page"""
        return self._client.post(f"/backend/v3/api/member/level/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusMemberLevelVO:
        """Get all member levels"""
        return self._client.post(f"/backend/v3/api/member/level/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusMemberLevelVO:
        """Get a member level by ID"""
        return self._client.get(f"/backend/v3/api/member/level/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a member level"""
        return self._client.delete(f"/backend/v3/api/member/level/{id}")
