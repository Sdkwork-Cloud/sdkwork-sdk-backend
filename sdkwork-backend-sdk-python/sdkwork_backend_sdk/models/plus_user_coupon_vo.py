from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserCouponVO:
    """用户优惠券VO，记录用户持有的优惠券信息"""
    created_at: str = None
    updated_at: str = None
    user_id: int = None
    coupon_id: int = None
    coupon_code: str = None
    acquire_time: str = None
    acquire_request_no: str = None
    acquire_type: str = None
    point_cost: int = None
    points_refunded: bool = None
    points_refund_at: str = None
    use_time: str = None
    status: str = None
