from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusRefundVO, PlusApiResultPagePlusRefundVO, PlusApiResultPlusRefundVO, PlusRefundForm, QueryListForm

class RefundApi:
    """refund API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusRefundForm) -> PlusApiResultPlusRefundVO:
        """Update an existing refund record"""
        return self._client.put(f"/backend/v3/api/trade/refund", json=body)

    def create(self, body: PlusRefundForm) -> PlusApiResultPlusRefundVO:
        """Create a new refund record"""
        return self._client.post(f"/backend/v3/api/trade/refund", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusRefundVO:
        """Get refund records by page"""
        return self._client.post(f"/backend/v3/api/trade/refund/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusRefundVO:
        """Get all refund records"""
        return self._client.post(f"/backend/v3/api/trade/refund/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusRefundVO:
        """Get a refund record by ID"""
        return self._client.get(f"/backend/v3/api/trade/refund/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a refund record"""
        return self._client.delete(f"/backend/v3/api/trade/refund/{id}")
