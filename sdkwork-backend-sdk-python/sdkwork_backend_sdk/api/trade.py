from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateBookingOrderForm, CreateGoodsOrderForm, CreateImGroupOrderForm, CreatePointsOrderForm, CreateServiceOrderForm, CreateVipOrderForm, CreateVirtualOrderForm, OrderDispatchActionForm, OrderDispatchAssignForm, PlusApiResultBookingOrderVO, PlusApiResultBoolean, PlusApiResultGoodsOrderVO, PlusApiResultImGroupOrderVO, PlusApiResultListPlusOrderDispatchRuleVO, PlusApiResultListPlusOrderItemVO, PlusApiResultListPlusOrderVO, PlusApiResultListPlusOrderWorkerDispatchProfileVO, PlusApiResultListPlusPaymentVO, PlusApiResultListPlusRefundVO, PlusApiResultListPlusShoppingCartItemVO, PlusApiResultListPlusShoppingCartVO, PlusApiResultOrderCancelVO, PlusApiResultOrderCloseVO, PlusApiResultOrderCompleteVO, PlusApiResultOrderConfirmVO, PlusApiResultOrderShipVO, PlusApiResultPagePlusOrderDispatchRuleVO, PlusApiResultPagePlusOrderItemVO, PlusApiResultPagePlusOrderVO, PlusApiResultPagePlusOrderWorkerDispatchProfileVO, PlusApiResultPagePlusPaymentVO, PlusApiResultPagePlusRefundVO, PlusApiResultPagePlusShoppingCartItemVO, PlusApiResultPagePlusShoppingCartVO, PlusApiResultPlusOrderDispatchRuleVO, PlusApiResultPlusOrderItemVO, PlusApiResultPlusOrderVO, PlusApiResultPlusOrderWorkerDispatchProfileVO, PlusApiResultPlusPaymentVO, PlusApiResultPlusRefundVO, PlusApiResultPlusShoppingCartItemVO, PlusApiResultPlusShoppingCartVO, PlusApiResultPointsOrderVO, PlusApiResultServiceOrderVO, PlusApiResultVipOrderVO, PlusApiResultVirtualOrderVO, PlusOrderDispatchRuleForm, PlusOrderForm, PlusOrderItemForm, PlusOrderWorkerDispatchProfileForm, PlusPaymentCancelForm, PlusPaymentForm, PlusPaymentStatusQueryForm, PlusRefundForm, PlusShoppingCartForm, PlusShoppingCartItemForm, QueryListForm

class TradeApi:
    """trade API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusShoppingCartForm) -> PlusApiResultPlusShoppingCartVO:
        """Update shopping cart"""
        return self._client.put(f"/backend/v3/api/trade/shopping/cart", json=body)

    def create(self, body: PlusShoppingCartForm) -> PlusApiResultPlusShoppingCartVO:
        """Create shopping cart"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart", json=body)

    def update_item(self, body: PlusShoppingCartItemForm) -> PlusApiResultPlusShoppingCartItemVO:
        """Update an existing shopping cart item"""
        return self._client.put(f"/backend/v3/api/trade/shopping/cart/item", json=body)

    def create_item(self, body: PlusShoppingCartItemForm) -> PlusApiResultPlusShoppingCartItemVO:
        """Create a new shopping cart item"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/item", json=body)

    def update_refund(self, body: PlusRefundForm) -> PlusApiResultPlusRefundVO:
        """Update an existing refund record"""
        return self._client.put(f"/backend/v3/api/trade/refund", json=body)

    def create_refund(self, body: PlusRefundForm) -> PlusApiResultPlusRefundVO:
        """Create a new refund record"""
        return self._client.post(f"/backend/v3/api/trade/refund", json=body)

    def update_payment(self, body: PlusPaymentForm) -> PlusApiResultPlusPaymentVO:
        """Update an existing payment record"""
        return self._client.put(f"/backend/v3/api/trade/payment", json=body)

    def create_payment(self, body: PlusPaymentForm) -> PlusApiResultPlusPaymentVO:
        """Create a new payment record"""
        return self._client.post(f"/backend/v3/api/trade/payment", json=body)

    def update_order(self, body: PlusOrderForm) -> PlusApiResultPlusOrderVO:
        """Update an existing order"""
        return self._client.put(f"/backend/v3/api/trade/order", json=body)

    def create_order(self, body: PlusOrderForm) -> PlusApiResultPlusOrderVO:
        """Create a new order"""
        return self._client.post(f"/backend/v3/api/trade/order", json=body)

    def update_worker_dispatch_profile(self, body: PlusOrderWorkerDispatchProfileForm) -> PlusApiResultPlusOrderWorkerDispatchProfileVO:
        """Update worker dispatch profile"""
        return self._client.put(f"/backend/v3/api/trade/order/worker-dispatch-profile", json=body)

    def create_worker_dispatch_profile(self, body: PlusOrderWorkerDispatchProfileForm) -> PlusApiResultPlusOrderWorkerDispatchProfileVO:
        """Create worker dispatch profile"""
        return self._client.post(f"/backend/v3/api/trade/order/worker-dispatch-profile", json=body)

    def update_item2(self, body: PlusOrderItemForm) -> PlusApiResultPlusOrderItemVO:
        """Update an existing order item"""
        return self._client.put(f"/backend/v3/api/trade/order/item", json=body)

    def create_item2(self, body: PlusOrderItemForm) -> PlusApiResultPlusOrderItemVO:
        """Create a new order item"""
        return self._client.post(f"/backend/v3/api/trade/order/item", json=body)

    def update_dispatch_rule(self, body: PlusOrderDispatchRuleForm) -> PlusApiResultPlusOrderDispatchRuleVO:
        """Update dispatch rule"""
        return self._client.put(f"/backend/v3/api/trade/order/dispatch-rule", json=body)

    def create_dispatch_rule(self, body: PlusOrderDispatchRuleForm) -> PlusApiResultPlusOrderDispatchRuleVO:
        """Create dispatch rule"""
        return self._client.post(f"/backend/v3/api/trade/order/dispatch-rule", json=body)

    def create_list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShoppingCartVO:
        """Get shopping carts by page"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/list", json=body, params=params)

    def create_list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShoppingCartVO:
        """Get all shopping carts"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/list/all", json=body)

    def create_list_by_page_item(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusShoppingCartItemVO:
        """Get shopping cart items by page"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/item/list", json=body, params=params)

    def create_list_all_entities_item(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusShoppingCartItemVO:
        """Get all shopping cart items"""
        return self._client.post(f"/backend/v3/api/trade/shopping/cart/item/list/all", json=body)

    def create_list_by_page_refund(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusRefundVO:
        """Get refund records by page"""
        return self._client.post(f"/backend/v3/api/trade/refund/list", json=body, params=params)

    def create_list_all_entities_refund(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusRefundVO:
        """Get all refund records"""
        return self._client.post(f"/backend/v3/api/trade/refund/list/all", json=body)

    def check_payment_status(self, body: PlusPaymentStatusQueryForm) -> PlusApiResultBoolean:
        """Check payment status"""
        return self._client.post(f"/backend/v3/api/trade/payment/status", json=body)

    def refund_payment(self, body: PlusRefundForm) -> PlusApiResultBoolean:
        """Refund payment"""
        return self._client.post(f"/backend/v3/api/trade/payment/refund", json=body)

    def create_list_by_page_payment(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPaymentVO:
        """Get payment records by page"""
        return self._client.post(f"/backend/v3/api/trade/payment/list", json=body, params=params)

    def create_list_all_entities_payment(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPaymentVO:
        """Get all payment records"""
        return self._client.post(f"/backend/v3/api/trade/payment/list/all", json=body)

    def cancel_payment(self, body: PlusPaymentCancelForm) -> PlusApiResultBoolean:
        """Cancel payment"""
        return self._client.post(f"/backend/v3/api/trade/payment/cancel", json=body)

    def ship_order(self, id: str, body: Optional[str] = None) -> PlusApiResultOrderShipVO:
        """Ship an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/ship", json=body)

    def start_service_order(self, id: str, body: Optional[OrderDispatchActionForm] = None) -> PlusApiResultServiceOrderVO:
        """Start service order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/dispatch/start", json=body)

    def release_service_order(self, id: str, body: Optional[OrderDispatchActionForm] = None) -> PlusApiResultServiceOrderVO:
        """Release service order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/dispatch/release", json=body)

    def complete_service_order(self, id: str, body: Optional[OrderDispatchActionForm] = None) -> PlusApiResultServiceOrderVO:
        """Complete service order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/dispatch/complete", json=body)

    def claim_service_order(self, id: str, body: Optional[OrderDispatchActionForm] = None) -> PlusApiResultServiceOrderVO:
        """Claim service order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/dispatch/claim", json=body)

    def assign_service_order(self, id: str, body: OrderDispatchAssignForm) -> PlusApiResultServiceOrderVO:
        """Assign service order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/dispatch/assign", json=body)

    def confirm_order(self, id: str) -> PlusApiResultOrderConfirmVO:
        """Confirm an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/confirm")

    def complete_order(self, id: str) -> PlusApiResultOrderCompleteVO:
        """Complete an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/complete")

    def close_order(self, id: str) -> PlusApiResultOrderCloseVO:
        """Close an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/close")

    def cancel_order(self, id: str) -> PlusApiResultOrderCancelVO:
        """Cancel an order"""
        return self._client.post(f"/backend/v3/api/trade/order/{id}/cancel")

    def create_list_by_page_worker_dispatch_profile(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOrderWorkerDispatchProfileVO:
        """List worker dispatch profiles by page"""
        return self._client.post(f"/backend/v3/api/trade/order/worker-dispatch-profile/list", json=body, params=params)

    def create_list_all_entities_worker_dispatch_profile(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOrderWorkerDispatchProfileVO:
        """List all worker dispatch profiles"""
        return self._client.post(f"/backend/v3/api/trade/order/worker-dispatch-profile/list/all", json=body)

    def create_virtual_order(self, body: CreateVirtualOrderForm) -> PlusApiResultVirtualOrderVO:
        """Create virtual order"""
        return self._client.post(f"/backend/v3/api/trade/order/virtual", json=body)

    def create_vip_order(self, body: CreateVipOrderForm) -> PlusApiResultVipOrderVO:
        """Create VIP order"""
        return self._client.post(f"/backend/v3/api/trade/order/vip", json=body)

    def create_service_order(self, body: CreateServiceOrderForm) -> PlusApiResultServiceOrderVO:
        """Create service order"""
        return self._client.post(f"/backend/v3/api/trade/order/service", json=body)

    def create_points_order(self, body: CreatePointsOrderForm) -> PlusApiResultPointsOrderVO:
        """Create points order"""
        return self._client.post(f"/backend/v3/api/trade/order/points", json=body)

    def create_list_by_page_order(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOrderVO:
        """Get orders by page"""
        return self._client.post(f"/backend/v3/api/trade/order/list", json=body, params=params)

    def create_list_all_entities_order(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOrderVO:
        """Get all orders"""
        return self._client.post(f"/backend/v3/api/trade/order/list/all", json=body)

    def create_list_by_page_item2(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOrderItemVO:
        """Get order items by page"""
        return self._client.post(f"/backend/v3/api/trade/order/item/list", json=body, params=params)

    def create_list_all_entities_item2(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOrderItemVO:
        """Get all order items"""
        return self._client.post(f"/backend/v3/api/trade/order/item/list/all", json=body)

    def create_im_group_order(self, body: CreateImGroupOrderForm) -> PlusApiResultImGroupOrderVO:
        """Create IM group order"""
        return self._client.post(f"/backend/v3/api/trade/order/im_group", json=body)

    def create_goods_order(self, body: CreateGoodsOrderForm) -> PlusApiResultGoodsOrderVO:
        """Create goods order"""
        return self._client.post(f"/backend/v3/api/trade/order/goods", json=body)

    def create_list_by_page_dispatch_rule(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusOrderDispatchRuleVO:
        """List dispatch rules by page"""
        return self._client.post(f"/backend/v3/api/trade/order/dispatch-rule/list", json=body, params=params)

    def create_list_all_entities_dispatch_rule(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusOrderDispatchRuleVO:
        """List all dispatch rules"""
        return self._client.post(f"/backend/v3/api/trade/order/dispatch-rule/list/all", json=body)

    def create_booking_order(self, body: CreateBookingOrderForm) -> PlusApiResultBookingOrderVO:
        """Create booking order"""
        return self._client.post(f"/backend/v3/api/trade/order/booking", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusShoppingCartVO:
        """Get shopping cart by ID"""
        return self._client.get(f"/backend/v3/api/trade/shopping/cart/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete shopping cart"""
        return self._client.delete(f"/backend/v3/api/trade/shopping/cart/{id}")

    def get_by_id_item(self, id: str) -> PlusApiResultPlusShoppingCartItemVO:
        """Get a shopping cart item by ID"""
        return self._client.get(f"/backend/v3/api/trade/shopping/cart/item/{id}")

    def delete_item(self, id: str) -> PlusApiResultBoolean:
        """Delete a shopping cart item"""
        return self._client.delete(f"/backend/v3/api/trade/shopping/cart/item/{id}")

    def get_by_id_refund(self, id: str) -> PlusApiResultPlusRefundVO:
        """Get a refund record by ID"""
        return self._client.get(f"/backend/v3/api/trade/refund/{id}")

    def delete_refund(self, id: str) -> PlusApiResultBoolean:
        """Delete a refund record"""
        return self._client.delete(f"/backend/v3/api/trade/refund/{id}")

    def get_by_id_payment(self, id: str) -> PlusApiResultPlusPaymentVO:
        """Get a payment record by ID"""
        return self._client.get(f"/backend/v3/api/trade/payment/{id}")

    def delete_payment(self, id: str) -> PlusApiResultBoolean:
        """Delete a payment record"""
        return self._client.delete(f"/backend/v3/api/trade/payment/{id}")

    def get_by_id_order(self, id: str) -> PlusApiResultPlusOrderVO:
        """Get an order by ID"""
        return self._client.get(f"/backend/v3/api/trade/order/{id}")

    def delete_order(self, id: str) -> PlusApiResultBoolean:
        """Delete an order"""
        return self._client.delete(f"/backend/v3/api/trade/order/{id}")

    def get_by_id_worker_dispatch_profile(self, id: str) -> PlusApiResultPlusOrderWorkerDispatchProfileVO:
        """Get worker dispatch profile by id"""
        return self._client.get(f"/backend/v3/api/trade/order/worker-dispatch-profile/{id}")

    def delete_worker_dispatch_profile(self, id: str) -> PlusApiResultBoolean:
        """Delete worker dispatch profile"""
        return self._client.delete(f"/backend/v3/api/trade/order/worker-dispatch-profile/{id}")

    def get_by_id_item2(self, id: str) -> PlusApiResultPlusOrderItemVO:
        """Get an order item by ID"""
        return self._client.get(f"/backend/v3/api/trade/order/item/{id}")

    def delete_item2(self, id: str) -> PlusApiResultBoolean:
        """Delete an order item"""
        return self._client.delete(f"/backend/v3/api/trade/order/item/{id}")

    def get_by_id_dispatch_rule(self, id: str) -> PlusApiResultPlusOrderDispatchRuleVO:
        """Get dispatch rule by id"""
        return self._client.get(f"/backend/v3/api/trade/order/dispatch-rule/{id}")

    def delete_dispatch_rule(self, id: str) -> PlusApiResultBoolean:
        """Delete dispatch rule"""
        return self._client.delete(f"/backend/v3/api/trade/order/dispatch-rule/{id}")
