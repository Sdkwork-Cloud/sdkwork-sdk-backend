from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipRechargeForm:
    """Recharge record creation form"""
    user_id: int
    vip_level_id: int = None
    amount: float
    point_amount: int
    recharge_type: str
    recharge_time: str
    transaction_no: str = None
    status: int
    remark: str = None
