from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusMusicVO, PlusApiResultPagePlusMusicVO, PlusApiResultPlusMusicVO, PlusMusicForm, QueryListForm

class MusicApi:
    """music API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusMusicForm) -> PlusApiResultPlusMusicVO:
        """Update music"""
        return self._client.put(f"/backend/v3/api/music", json=body)

    def create(self, body: PlusMusicForm) -> PlusApiResultPlusMusicVO:
        """Create new music"""
        return self._client.post(f"/backend/v3/api/music", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusMusicVO:
        """Get music records by page"""
        return self._client.post(f"/backend/v3/api/music/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusMusicVO:
        """Get all music records"""
        return self._client.post(f"/backend/v3/api/music/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusMusicVO:
        """Get music by ID"""
        return self._client.get(f"/backend/v3/api/music/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete music"""
        return self._client.delete(f"/backend/v3/api/music/{id}")
