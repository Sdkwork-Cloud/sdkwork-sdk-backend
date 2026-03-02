from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusCardVO, PlusApiResultPagePlusCardVO, PlusApiResultPlusCardVO, PlusCardForm, QueryListForm

class MembershipCardApi:
    """membership_card API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCardForm) -> PlusApiResultPlusCardVO:
        """Update an existing membership card"""
        return self._client.put(f"/backend/v3/api/card", json=body)

    def create(self, body: PlusCardForm) -> PlusApiResultPlusCardVO:
        """Create a new membership card"""
        return self._client.post(f"/backend/v3/api/card", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCardVO:
        """Get membership cards by page"""
        return self._client.post(f"/backend/v3/api/card/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCardVO:
        """Get all membership cards"""
        return self._client.post(f"/backend/v3/api/card/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusCardVO:
        """Get a membership card by ID"""
        return self._client.get(f"/backend/v3/api/card/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a membership card"""
        return self._client.delete(f"/backend/v3/api/card/{id}")
