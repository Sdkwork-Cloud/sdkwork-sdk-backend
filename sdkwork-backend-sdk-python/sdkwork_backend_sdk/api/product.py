from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusProductVO, PlusApiResultPagePlusProductVO, PlusApiResultPlusMallHomeVO, PlusApiResultPlusProductVO, PlusProductForm, QueryListForm

class ProductApi:
    """product API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusProductForm) -> PlusApiResultPlusProductVO:
        """Update an existing product"""
        return self._client.put(f"/backend/v3/api/product", json=body)

    def create(self, body: PlusProductForm) -> PlusApiResultPlusProductVO:
        """Create a new product"""
        return self._client.post(f"/backend/v3/api/product", json=body)

    def mall_home(self, body: Optional[QueryListForm] = None) -> PlusApiResultPlusMallHomeVO:
        """Get all products"""
        return self._client.post(f"/backend/v3/api/product/mall_home", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusProductVO:
        """Get products by page"""
        return self._client.post(f"/backend/v3/api/product/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusProductVO:
        """Get all products"""
        return self._client.post(f"/backend/v3/api/product/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusProductVO:
        """Get a product by ID"""
        return self._client.get(f"/backend/v3/api/product/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a product"""
        return self._client.delete(f"/backend/v3/api/product/{id}")

    def get_detail(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPlusProductVO:
        """Get a product by ID"""
        return self._client.get(f"/backend/v3/api/product/detail", params=params)
