from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCouponVO:
    """优惠券模板VO，定义优惠券属性"""
    created_at: str = None
    updated_at: str = None
    name: str = None
    redeem_code: str = None
    point_cost: int = None
    type: str = None
    description: str = None
    amount: int = None
    discount: float = None
    min_consume: int = None
    start_time: str = None
    end_time: str = None
    total: int = None
    get_limit: int = None
    status: str = None
    scope_type: str = None
    scope_value: str = None
