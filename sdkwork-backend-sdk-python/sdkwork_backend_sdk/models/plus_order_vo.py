from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrderVO:
    """订单主表VO"""
    created_at: str = None
    updated_at: str = None
    order_type: str = None
    user_id: int = None
    order_sn: str = None
    transaction_id: str = None
    out_trade_no: str = None
    total_amount: float = None
    paid_amount: float = None
    paid_points_amount: int = None
    status: str = None
    pay_time: str = None
    expire_time: str = None
    content_type: str = None
    content_id: int = None
    pay_objects: ClientPayObjects = None
