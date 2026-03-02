from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipRechargePackVO:
    """VIP充值套餐VO对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    price: float = None
    point_amount: int = None
    vip_duration_days: int = None
    status: int = None
    sort_weight: int = None
    valid_from: str = None
    valid_to: str = None
    remark: str = None
