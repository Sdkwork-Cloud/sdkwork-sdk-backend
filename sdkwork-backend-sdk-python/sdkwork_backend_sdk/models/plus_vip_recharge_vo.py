from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipRechargeVO:
    """VIP充值记录Value Object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    vip_level_id: int = None
    amount: float = None
    point_amount: int = None
    recharge_type: str = None
    recharge_time: str = None
    transaction_no: str = None
    status: int = None
    remark: str = None
