from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipUserVO:
    """VIP会员用户信息VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    vip_level_id: int = None
    status: str = None
    point_balance: int = None
    total_recharged_points: int = None
    valid_from: str = None
    valid_to: str = None
    last_active_time: str = None
    remark: str = None
    vip_level: PlusVipLevelVO = None
