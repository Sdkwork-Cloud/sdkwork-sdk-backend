from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCouponForm:
    """Coupon template creation form"""
    name: str
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
