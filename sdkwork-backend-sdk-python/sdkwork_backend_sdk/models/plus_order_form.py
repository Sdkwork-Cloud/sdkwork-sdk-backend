from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrderForm:
    """Order creation form"""
    order_type: str
    user_id: int
    order_sn: str = None
    transaction_id: str = None
    out_trade_no: str = None
    total_amount: float
    paid_amount: float
    paid_points_amount: int = None
    status: str
    pay_time: str = None
    expire_time: str = None
    content_type: str = None
    content_id: int = None
