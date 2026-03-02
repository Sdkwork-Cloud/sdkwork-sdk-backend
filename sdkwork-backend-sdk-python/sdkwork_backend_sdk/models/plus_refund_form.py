from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusRefundForm:
    """Refund form"""
    order_id: int
    payment_id: int
    out_refund_no: str
    out_trade_no: str = None
    refund_id: str = None
    amount: float
    type: str
    status: str
    apply_time: str
    complete_time: str = None
    remark: str = None
    content_type: str = None
    content_id: int = None
