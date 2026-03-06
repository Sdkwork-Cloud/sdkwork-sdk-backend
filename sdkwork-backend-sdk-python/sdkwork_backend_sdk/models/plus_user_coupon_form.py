from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserCouponForm:
    """User coupon creation form"""
    user_id: int
    coupon_id: int
    coupon_code: str
    acquire_at: str
    acquire_request_no: str = None
    acquire_type: str = None
    point_cost: int = None
    points_refunded: bool = None
    points_refund_at: str = None
    use_at: str = None
    status: str
