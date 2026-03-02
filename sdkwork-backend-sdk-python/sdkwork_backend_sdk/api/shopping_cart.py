from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusShoppingCartVO, PlusApiResultPagePlusShoppingCartVO, PlusApiResultPlusShoppingCartVO, PlusShoppingCartForm, QueryListForm

class ShoppingCartApi:
    """shopping_cart API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusShoppingCartForm) -> PlusApiResultPlusShoppingCartVO:
        """Update shopping cart"""
        return self._client.put(f"/backend/v3/api/trade/shopping/cart", json=body)

    def create(self, body: PlusShoppingCartForm) -> PlusApiResultPlusShoppingCartVO:
        """Create shopping cart"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShoppingCartVO:
        """Get shopping carts by page"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShoppingCartVO:
        """Get all shopping carts"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusShoppingCartVO:
        """Get shopping cart by ID"""
        return self._client.get(f"/backend/v3/api/trade/shopping/cart/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete shopping cart"""
        return self._client.delete(f"/backend/v3/api/trade/shopping/cart/{id}")
