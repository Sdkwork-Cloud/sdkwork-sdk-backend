from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListShortUrlVO, PlusApiResultPageShortUrlVO, PlusApiResultShortUrlVO, QueryListForm, ShortUrlForm

class ShortUrlApi:
    """short_url API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: ShortUrlForm) -> PlusApiResultShortUrlVO:
        """Update short URL"""
        return self._client.put(f"/backend/v3/api/short_url", json=body)

    def create(self, body: ShortUrlForm) -> PlusApiResultShortUrlVO:
        """Create short URL"""
        return self._client.post(f"/backend/v3/api/short_url", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageShortUrlVO:
        """Get short URLs by page"""
        return self._client.post(f"/backend/v3/api/short_url/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListShortUrlVO:
        """Get all short URLs"""
        return self._client.post(f"/backend/v3/api/short_url/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultShortUrlVO:
        """Get short URL details"""
        return self._client.get(f"/backend/v3/api/short_url/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete short URL"""
        return self._client.delete(f"/backend/v3/api/short_url/{id}")
