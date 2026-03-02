from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipUserForm:
    """VIP user creation form"""
    user_id: int
    vip_level_id: int = None
    status: str
    point_balance: int
    total_recharged_points: int
    valid_from: str = None
    valid_to: str = None
    last_active_time: str = None
    remark: str = None
