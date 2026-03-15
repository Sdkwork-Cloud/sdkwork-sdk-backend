from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusMemberCardVO, PlusApiResultListPlusMemberLevelVO, PlusApiResultPagePlusMemberCardVO, PlusApiResultPagePlusMemberLevelVO, PlusApiResultPlusMemberCardVO, PlusApiResultPlusMemberLevelVO, PlusMemberCardForm, PlusMemberLevelForm, QueryListForm

class MemberApi:
    """member API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusMemberLevelForm) -> PlusApiResultPlusMemberLevelVO:
        """Update an existing member level"""
        return self._client.put(f"/backend/v3/api/member/level", json=body)

    def create(self, body: PlusMemberLevelForm) -> PlusApiResultPlusMemberLevelVO:
        """Create a new member level"""
        return self._client.post(f"/backend/v3/api/member/level", json=body)

    def update_card(self, body: PlusMemberCardForm) -> PlusApiResultPlusMemberCardVO:
        """Update an existing member card"""
        return self._client.put(f"/backend/v3/api/member/card", json=body)

    def create_card(self, body: PlusMemberCardForm) -> PlusApiResultPlusMemberCardVO:
        """Create a new member card"""
        return self._client.post(f"/backend/v3/api/member/card", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusMemberLevelVO:
        """Get member levels by page"""
        return self._client.post(f"/backend/v3/api/member/level/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusMemberLevelVO:
        """Get all member levels"""
        return self._client.post(f"/backend/v3/api/member/level/list/all", json=body)

    def create_list_by_page_card(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusMemberCardVO:
        """Get member cards by page"""
        return self._client.post(f"/backend/v3/api/member/card/list", json=body, params=params)

    def create_list_all_entities_card(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusMemberCardVO:
        """Get all member cards"""
        return self._client.post(f"/backend/v3/api/member/card/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusMemberLevelVO:
        """Get a member level by ID"""
        return self._client.get(f"/backend/v3/api/member/level/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a member level"""
        return self._client.delete(f"/backend/v3/api/member/level/{id}")

    def get_by_id_card(self, id: str) -> PlusApiResultPlusMemberCardVO:
        """Get a member card by ID"""
        return self._client.get(f"/backend/v3/api/member/card/{id}")

    def delete_card(self, id: str) -> PlusApiResultBoolean:
        """Delete a member card"""
        return self._client.delete(f"/backend/v3/api/member/card/{id}")
