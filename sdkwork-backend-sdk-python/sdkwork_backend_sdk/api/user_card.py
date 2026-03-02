from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusUserCardVO, PlusApiResultPagePlusUserCardVO, PlusApiResultPlusUserCardVO, PlusUserCardForm, QueryListForm

class UserCardApi:
    """user_card API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusUserCardForm) -> PlusApiResultPlusUserCardVO:
        """Update user-card binding"""
        return self._client.put(f"/backend/v3/api/user/card", json=body)

    def create(self, body: PlusUserCardForm) -> PlusApiResultPlusUserCardVO:
        """Create user-card binding"""
        return self._client.post(f"/backend/v3/api/user/card", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserCardVO:
        """Get user-card bindings by page"""
        return self._client.post(f"/backend/v3/api/user/card/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserCardVO:
        """Get all user-card bindings"""
        return self._client.post(f"/backend/v3/api/user/card/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusUserCardVO:
        """Get user-card binding by ID"""
        return self._client.get(f"/backend/v3/api/user/card/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete user-card binding"""
        return self._client.delete(f"/backend/v3/api/user/card/{id}")
