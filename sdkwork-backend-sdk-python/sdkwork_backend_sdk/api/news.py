from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusNewsVO, PlusApiResultPagePlusNewsVO, PlusApiResultPlusNewsVO, PlusNewsForm, QueryListForm

class NewsApi:
    """news API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusNewsForm) -> PlusApiResultPlusNewsVO:
        """Update an existing news"""
        return self._client.put(f"/backend/v3/api/news", json=body)

    def create(self, body: PlusNewsForm) -> PlusApiResultPlusNewsVO:
        """Create a new news"""
        return self._client.post(f"/backend/v3/api/news", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusNewsVO:
        """Get news by page"""
        return self._client.post(f"/backend/v3/api/news/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusNewsVO:
        """Get all news"""
        return self._client.post(f"/backend/v3/api/news/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusNewsVO:
        """Get a news by ID"""
        return self._client.get(f"/backend/v3/api/news/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a news"""
        return self._client.delete(f"/backend/v3/api/news/{id}")
