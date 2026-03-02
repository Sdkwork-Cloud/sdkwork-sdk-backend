from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusCouponTemplateVO, PlusApiResultPagePlusCouponTemplateVO, PlusApiResultPlusCouponTemplateVO, PlusCouponTemplateForm, QueryListForm

class CouponTemplateApi:
    """coupon_template API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCouponTemplateForm) -> PlusApiResultPlusCouponTemplateVO:
        """Update an existing coupon template"""
        return self._client.put(f"/backend/v3/api/coupon/template", json=body)

    def create(self, body: PlusCouponTemplateForm) -> PlusApiResultPlusCouponTemplateVO:
        """Create a new coupon template"""
        return self._client.post(f"/backend/v3/api/coupon/template", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCouponTemplateVO:
        """Get coupon templates by page"""
        return self._client.post(f"/backend/v3/api/coupon/template/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCouponTemplateVO:
        """Get all coupon templates"""
        return self._client.post(f"/backend/v3/api/coupon/template/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusCouponTemplateVO:
        """Get a coupon template by ID"""
        return self._client.get(f"/backend/v3/api/coupon/template/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a coupon template"""
        return self._client.delete(f"/backend/v3/api/coupon/template/{id}")
