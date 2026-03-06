from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusArticleVO, PlusApiResultPagePlusArticleVO, PlusApiResultPlusArticleVO, PlusArticleForm, QueryListForm

class ArticleApi:
    """article API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusArticleForm) -> PlusApiResultPlusArticleVO:
        """Update an existing AI article"""
        return self._client.put(f"/backend/v3/api/article", json=body)

    def create(self, body: PlusArticleForm) -> PlusApiResultPlusArticleVO:
        """Create a new AI article"""
        return self._client.post(f"/backend/v3/api/article", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusArticleVO:
        """Get AI articles by page"""
        return self._client.post(f"/backend/v3/api/article/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusArticleVO:
        """Get all AI articles"""
        return self._client.post(f"/backend/v3/api/article/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusArticleVO:
        """Get an AI article by ID"""
        return self._client.get(f"/backend/v3/api/article/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an AI article"""
        return self._client.delete(f"/backend/v3/api/article/{id}")
