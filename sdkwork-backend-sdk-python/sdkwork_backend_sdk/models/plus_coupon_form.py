from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCouponForm:
    """Coupon template creation form"""
    name: str
    redeem_code: str = None
    point_cost: int = None
    type: str
    description: str = None
    amount: int = None
    discount: float = None
    min_consume: int = None
    start_time: str
    end_time: str
    total: int
    get_limit: int
    status: str
    scope_type: str
    scope_value: str = None
