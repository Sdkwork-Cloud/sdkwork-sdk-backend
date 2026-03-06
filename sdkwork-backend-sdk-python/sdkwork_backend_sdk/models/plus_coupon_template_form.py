from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCouponTemplateForm:
    """Coupon template creation form"""
    name: str
    template_code: str = None
    type: str
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
    scope_type: str
    scope_value: str = None
