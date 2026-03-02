from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusFavoriteVO, PlusApiResultPagePlusFavoriteVO, PlusApiResultPlusFavoriteVO, PlusFavoriteForm, QueryListForm

class FavoriteApi:
    """favorite API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusFavoriteForm) -> PlusApiResultPlusFavoriteVO:
        """Update an existing favorite"""
        return self._client.put(f"/backend/v3/api/favorite", json=body)

    def create(self, body: PlusFavoriteForm) -> PlusApiResultPlusFavoriteVO:
        """Create a new favorite"""
        return self._client.post(f"/backend/v3/api/favorite", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusFavoriteVO:
        """Get favorites by page"""
        return self._client.post(f"/backend/v3/api/favorite/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusFavoriteVO:
        """Get all favorites"""
        return self._client.post(f"/backend/v3/api/favorite/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusFavoriteVO:
        """Get a favorite by ID"""
        return self._client.get(f"/backend/v3/api/favorite/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a favorite"""
        return self._client.delete(f"/backend/v3/api/favorite/{id}")
