from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipOrderVO:
    """会员购买订单VO"""
    created_at: str = None
    updated_at: str = None
    order_id: int = None
    order_sn: str = None
    success: bool = None
    message: str = None
