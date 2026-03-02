from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipPackVO:
    """VIP套餐VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    description: str = None
    group_id: int = None
    vip_level_id: int = None
    price: float = None
    point_amount: int = None
    vip_duration_days: int = None
    status: str = None
    sort_weight: int = None
    valid_from: str = None
    valid_to: str = None
    remark: str = None
    vip_level: PlusVipLevelVO = None
