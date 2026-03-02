from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListPlusUserCouponVO, PlusApiResultPagePlusUserCouponVO, PlusApiResultPlusUserCouponVO, PlusUserCouponForm, QueryListForm

class UserCouponApi:
    """user_coupon API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusUserCouponForm) -> PlusApiResultPlusUserCouponVO:
        """Update an existing user coupon"""
        return self._client.put(f"/backend/v3/api/user/coupon", json=body)

    def create(self, body: PlusUserCouponForm) -> PlusApiResultPlusUserCouponVO:
        """Create a new user coupon"""
        return self._client.post(f"/backend/v3/api/user/coupon", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusUserCouponVO:
        """Get user coupons by page"""
        return self._client.post(f"/backend/v3/api/user/coupon/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusUserCouponVO:
        """Get all user coupons"""
        return self._client.post(f"/backend/v3/api/user/coupon/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusUserCouponVO:
        """Get a user coupon by ID"""
        return self._client.get(f"/backend/v3/api/user/coupon/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a user coupon"""
        return self._client.delete(f"/backend/v3/api/user/coupon/{id}")
