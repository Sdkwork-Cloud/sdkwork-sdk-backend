from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipPackForm:
    """VIP package creation form"""
    name: str
    description: str = None
    group_id: int
    vip_level_id: int
    price: float
    point_amount: int
    vip_duration_days: int = None
    status: str
    sort_weight: int = None
    valid_from: str = None
    valid_to: str = None
    remark: str = None
