from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserCouponForm:
    """User coupon creation form"""
    user_id: int
    coupon_id: int
    coupon_code: str
    acquire_at: str
    use_at: str = None
    status: str
