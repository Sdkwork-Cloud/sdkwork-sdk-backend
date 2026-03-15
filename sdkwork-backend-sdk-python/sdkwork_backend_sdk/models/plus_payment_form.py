from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPaymentForm:
    """Payment creation form"""
    purpose: str
    order_id: int
    transaction_id: str = None
    out_trade_no: str = None
    channel: str = None
    provider: str = None
    status: str = None
    amount: float
    success_time: str = None
    remark: str = None
    content_type: str = None
    content_id: int = None
    product_type: str = None
