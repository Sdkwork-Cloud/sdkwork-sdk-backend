from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateGoodsOrderForm, CreateImGroupOrderForm, CreatePointsOrderForm, CreateVipOrderForm, CreateVirtualOrderForm, PlusApiResultBoolean, PlusApiResultGoodsOrderVO, PlusApiResultImGroupOrderVO, PlusApiResultListPlusOrderVO, PlusApiResultOrderCancelVO, PlusApiResultOrderCloseVO, PlusApiResultOrderCompleteVO, PlusApiResultOrderConfirmVO, PlusApiResultOrderShipVO, PlusApiResultPagePlusOrderVO, PlusApiResultPlusOrderVO, PlusApiResultPointsOrderVO, PlusApiResultVipOrderVO, PlusApiResultVirtualOrderVO, PlusOrderForm, QueryListForm

class OrderApi:
    """order API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusOrderForm) -> PlusApiResultPlusOrderVO:
        """Update an existing order"""
        return self._client.put(f"/backend/v3/api/trade/order", json=body)

    def create(self, body: PlusOrderForm) -> PlusApiResultPlusOrderVO:
        """Create a new order"""
        return self._client.post(f"/backend/v3/api/trade/order", json=body)

    def ship(self, id: str, body: str) -> PlusApiResultOrderShipVO:
        """Ship an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/ship", json=body)

    def confirm(self, id: str) -> PlusApiResultOrderConfirmVO:
        """Confirm an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/confirm")

    def complete(self, id: str) -> PlusApiResultOrderCompleteVO:
        """Complete an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/complete")

    def close(self, id: str) -> PlusApiResultOrderCloseVO:
        """Close an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/close")

    def cancel(self, id: str) -> PlusApiResultOrderCancelVO:
        """Cancel an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/cancel")

    def create_virtual(self, body: CreateVirtualOrderForm) -> PlusApiResultVirtualOrderVO:
        """Create virtual order"""
        return self._client.post(f"/backend/v3/api/trade/order/virtual", json=body)

    def create_vip(self, body: CreateVipOrderForm) -> PlusApiResultVipOrderVO:
        """Create VIP order"""
        return self._client.post(f"/backend/v3/api/trade/order/vip", json=body)

    def create_points(self, body: CreatePointsOrderForm) -> PlusApiResultPointsOrderVO:
        """Create points order"""
        return self._client.post(f"/backend/v3/api/trade/order/points", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOrderVO:
        """Get orders by page"""
        return self._client.post(f"/backend/v3/api/trade/order/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOrderVO:
        """Get all orders"""
        return self._client.post(f"/backend/v3/api/trade/order/list/all", json=body)

    def create_im_group(self, body: CreateImGroupOrderForm) -> PlusApiResultImGroupOrderVO:
        """Create IM group order"""
        return self._client.post(f"/backend/v3/api/trade/order/im_group", json=body)

    def create_goods(self, body: CreateGoodsOrderForm) -> PlusApiResultGoodsOrderVO:
        """Create goods order"""
        return self._client.post(f"/backend/v3/api/trade/order/goods", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusOrderVO:
        """Get an order by ID"""
        return self._client.get(f"/backend/v3/api/trade/order/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete an order"""
        return self._client.delete(f"/backend/v3/api/trade/order/{id}")
