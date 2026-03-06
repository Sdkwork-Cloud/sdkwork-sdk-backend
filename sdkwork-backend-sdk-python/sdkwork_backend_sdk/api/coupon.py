from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CouponPointsExchangeForm, CouponRedeemForm, CouponRollbackForm, PlusApiResultBoolean, PlusApiResultListPlusCouponVO, PlusApiResultPagePlusCouponVO, PlusApiResultPlusCouponVO, PlusApiResultPlusUserCouponVO, PlusCouponForm, QueryListForm

class CouponApi:
    """coupon API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update(self, body: PlusCouponForm) -> PlusApiResultPlusCouponVO:
        """Update an existing coupon template"""
        return self._client.put(f"/backend/v3/api/coupon", json=body)

    def create(self, body: PlusCouponForm) -> PlusApiResultPlusCouponVO:
        """Create a new coupon template"""
        return self._client.post(f"/backend/v3/api/coupon", json=body)

    def exchange_by_points(self, couponId: str, body: CouponPointsExchangeForm) -> PlusApiResultPlusUserCouponVO:
        """Exchange coupon by points"""
        return self._client.post(f"/backend/v3/api/coupon/{couponId}/exchange/points", json=body)

    def redeem(self, body: CouponRedeemForm) -> PlusApiResultPlusUserCouponVO:
        """Redeem coupon"""
        return self._client.post(f"/backend/v3/api/coupon/redeem", json=body)

    def rollback_points_exchange(self, userCouponId: str, body: Optional[CouponRollbackForm] = None) -> PlusApiResultPlusUserCouponVO:
        """Rollback points exchange coupon"""
        return self._client.post(f"/backend/v3/api/coupon/my/{userCouponId}/rollback", json=body)

    def list_by_page(self, body: Optional[QueryListForm] = None, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePlusCouponVO:
        """Get coupon templates by page"""
        return self._client.post(f"/backend/v3/api/coupon/list", json=body, params=params)

    def list_all_entities(self, body: Optional[QueryListForm] = None) -> PlusApiResultListPlusCouponVO:
        """Get all coupon templates"""
        return self._client.post(f"/backend/v3/api/coupon/list/all", json=body)

    def get_by_id(self, id: str) -> PlusApiResultPlusCouponVO:
        """Get a coupon template by ID"""
        return self._client.get(f"/backend/v3/api/coupon/{id}")

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete a coupon template"""
        return self._client.delete(f"/backend/v3/api/coupon/{id}")
