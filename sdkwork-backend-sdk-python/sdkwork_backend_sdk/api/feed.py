from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusFeedsVO, PlusApiResultPagePlusFeedsVO, PlusApiResultPlusFeedsVO, PlusFeedsForm, QueryListForm

class FeedApi:
    """feed API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusFeedsForm) -> PlusApiResultPlusFeedsVO:
        """Update an existing feeds entry"""
        return self._client.put(f"/backend/v3/api/feeds", json=body)

    def create(self, body: PlusFeedsForm) -> PlusApiResultPlusFeedsVO:
        """Create a new feeds entry"""
        return self._client.post(f"/backend/v3/api/feeds", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusFeedsVO:
        """Get feeds entries by page"""
        return self._client.post(f"/backend/v3/api/feeds/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusFeedsVO:
        """Get all feeds entries"""
        return self._client.post(f"/backend/v3/api/feeds/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusFeedsVO:
        """Get a feeds entry by ID"""
        return self._client.get(f"/backend/v3/api/feeds/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a feeds entry"""
        return self._client.delete(f"/backend/v3/api/feeds/{id}")
