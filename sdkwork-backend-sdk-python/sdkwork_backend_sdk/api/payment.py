from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusPaymentVO, PlusApiResultPagePlusPaymentVO, PlusApiResultPlusPaymentVO, PlusPaymentCancelForm, PlusPaymentForm, PlusPaymentStatusQueryForm, PlusRefundForm, QueryListForm

class PaymentApi:
    """payment API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusPaymentForm) -> PlusApiResultPlusPaymentVO:
        """Update an existing payment record"""
        return self._client.put(f"/backend/v3/api/trade/payment", json=body)

    def create(self, body: PlusPaymentForm) -> PlusApiResultPlusPaymentVO:
        """Create a new payment record"""
        return self._client.post(f"/backend/v3/api/trade/payment", json=body)

    def check_payment_status(self, body: PlusPaymentStatusQueryForm) -> PlusApiResultBoolean:
        """Check payment status"""
        return self._client.post(f"/backend/v3/api/trade/payment/status", json=body)

    def refund(self, body: PlusRefundForm) -> PlusApiResultBoolean:
        """Refund payment"""
        return self._client.post(f"/backend/v3/api/trade/payment/refund", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusPaymentVO:
        """Get payment records by page"""
        return self._client.post(f"/backend/v3/api/trade/payment/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusPaymentVO:
        """Get all payment records"""
        return self._client.post(f"/backend/v3/api/trade/payment/list/all", json=body)

    def cancel(self, body: PlusPaymentCancelForm) -> PlusApiResultBoolean:
        """Cancel payment"""
        return self._client.post(f"/backend/v3/api/trade/payment/cancel", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusPaymentVO:
        """Get a payment record by ID"""
        return self._client.get(f"/backend/v3/api/trade/payment/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a payment record"""
        return self._client.delete(f"/backend/v3/api/trade/payment/{id}")
