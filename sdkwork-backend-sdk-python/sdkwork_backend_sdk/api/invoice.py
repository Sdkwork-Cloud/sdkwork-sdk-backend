from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultPagePlusSystemInvoiceVO, PlusApiResultPlusSystemInvoiceVO, PlusSystemInvoiceApplyForm

class InvoiceApi:
    """invoice API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def apply(self, body: PlusSystemInvoiceApplyForm) -> PlusApiResultPlusSystemInvoiceVO:
        """Apply invoice"""
        return self._client.post(f"/backend/v3/api/system/invoice/apply", json=body)

    def list_by_page(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusSystemInvoiceVO:
        """Query invoice page"""
        return self._client.get(f"/backend/v3/api/system/invoice/page", params=params)
