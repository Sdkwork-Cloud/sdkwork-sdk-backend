from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCouponTemplateVO:
    """Coupon Template Value Object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    template_code: str = None
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
    validity_type: str = None
    validity_days: int = None
    can_share: bool = None
    scope_type: int = None
    scope_value: str = None
