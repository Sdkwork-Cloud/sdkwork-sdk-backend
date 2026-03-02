from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipRechargePackForm:
    """VIP recharge package creation form"""
    name: str
    description: str = None
    price: float
    point_amount: int
    vip_duration_days: int = None
    status: int
    sort_weight: int = None
    valid_from: str = None
    valid_to: str = None
    remark: str = None
