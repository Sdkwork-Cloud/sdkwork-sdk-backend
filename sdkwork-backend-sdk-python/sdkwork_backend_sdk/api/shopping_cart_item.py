from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusShoppingCartItemVO, PlusApiResultPagePlusShoppingCartItemVO, PlusApiResultPlusShoppingCartItemVO, PlusShoppingCartItemForm, QueryListForm

class ShoppingCartItemApi:
    """shopping_cart_item API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusShoppingCartItemForm) -> PlusApiResultPlusShoppingCartItemVO:
        """Update an existing shopping cart item"""
        return self._client.put(f"/backend/v3/api/trade/shopping/cart/item", json=body)

    def create(self, body: PlusShoppingCartItemForm) -> PlusApiResultPlusShoppingCartItemVO:
        """Create a new shopping cart item"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/item", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShoppingCartItemVO:
        """Get shopping cart items by page"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/item/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShoppingCartItemVO:
        """Get all shopping cart items"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/item/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusShoppingCartItemVO:
        """Get a shopping cart item by ID"""
        return self._client.get(f"/backend/v3/api/trade/shopping/cart/item/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a shopping cart item"""
        return self._client.delete(f"/backend/v3/api/trade/shopping/cart/item/{id}")
