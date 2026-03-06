from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusCategoryVO, PlusApiResultPagePlusCategoryVO, PlusApiResultPlusCategoryVO, PlusApiResultSetPlusTreeNodePlusCategoryVO, PlusCategoryForm, QueryListForm

class CategoryApi:
    """category API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCategoryForm) -> PlusApiResultPlusCategoryVO:
        """Update an existing category"""
        return self._client.put(f"/backend/v3/api/category", json=body)

    def create(self, body: PlusCategoryForm) -> PlusApiResultPlusCategoryVO:
        """Create a new category"""
        return self._client.post(f"/backend/v3/api/category", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCategoryVO:
        """Get categories by page"""
        return self._client.post(f"/backend/v3/api/category/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCategoryVO:
        """Get all categories"""
        return self._client.post(f"/backend/v3/api/category/list/all", json=body)

    def get_tree(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultSetPlusTreeNodePlusCategoryVO:
        """Get Tree"""
        return self._client.post(f"/backend/v3/api/category/get_tree", json=body, params=params)

    def get_by_id(self, id: str) -> PlusApiResultPlusCategoryVO:
        """Get a category by ID"""
        return self._client.get(f"/backend/v3/api/category/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a category"""
        return self._client.delete(f"/backend/v3/api/category/{id}")
