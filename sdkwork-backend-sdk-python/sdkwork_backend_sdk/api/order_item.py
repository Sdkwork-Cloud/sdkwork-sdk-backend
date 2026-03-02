from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusOrderItemVO, PlusApiResultPagePlusOrderItemVO, PlusApiResultPlusOrderItemVO, PlusOrderItemForm, QueryListForm

class OrderItemApi:
    """order_item API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusOrderItemForm) -> PlusApiResultPlusOrderItemVO:
        """Update an existing order item"""
        return self._client.put(f"/backend/v3/api/trade/order/item", json=body)

    def create(self, body: PlusOrderItemForm) -> PlusApiResultPlusOrderItemVO:
        """Create a new order item"""
        return self._client.post(f"/backend/v3/api/trade/order/item", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOrderItemVO:
        """Get order items by page"""
        return self._client.post(f"/backend/v3/api/trade/order/item/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOrderItemVO:
        """Get all order items"""
        return self._client.post(f"/backend/v3/api/trade/order/item/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusOrderItemVO:
        """Get an order item by ID"""
        return self._client.get(f"/backend/v3/api/trade/order/item/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an order item"""
        return self._client.delete(f"/backend/v3/api/trade/order/item/{id}")
