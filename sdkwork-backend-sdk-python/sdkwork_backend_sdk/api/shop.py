from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusShopVO, PlusApiResultPagePlusShopVO, PlusApiResultPlusShopVO, PlusShopForm, QueryListForm

class ShopApi:
    """shop API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusShopForm) -> PlusApiResultPlusShopVO:
        """Update an existing shop"""
        return self._client.put(f"/backend/v3/api/shop", json=body)

    def create(self, body: PlusShopForm) -> PlusApiResultPlusShopVO:
        """Create a new shop"""
        return self._client.post(f"/backend/v3/api/shop", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShopVO:
        """Get shops by page"""
        return self._client.post(f"/backend/v3/api/shop/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShopVO:
        """Get all shops"""
        return self._client.post(f"/backend/v3/api/shop/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusShopVO:
        """Get a shop by ID"""
        return self._client.get(f"/backend/v3/api/shop/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a shop"""
        return self._client.delete(f"/backend/v3/api/shop/{id}")
