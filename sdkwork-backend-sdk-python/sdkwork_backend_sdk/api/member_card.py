from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusMemberCardVO, PlusApiResultPagePlusMemberCardVO, PlusApiResultPlusMemberCardVO, PlusMemberCardForm, QueryListForm

class MemberCardApi:
    """member_card API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusMemberCardForm) -> PlusApiResultPlusMemberCardVO:
        """Update an existing member card"""
        return self._client.put(f"/backend/v3/api/member/card", json=body)

    def create(self, body: PlusMemberCardForm) -> PlusApiResultPlusMemberCardVO:
        """Create a new member card"""
        return self._client.post(f"/backend/v3/api/member/card", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusMemberCardVO:
        """Get member cards by page"""
        return self._client.post(f"/backend/v3/api/member/card/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusMemberCardVO:
        """Get all member cards"""
        return self._client.post(f"/backend/v3/api/member/card/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusMemberCardVO:
        """Get a member card by ID"""
        return self._client.get(f"/backend/v3/api/member/card/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a member card"""
        return self._client.delete(f"/backend/v3/api/member/card/{id}")
