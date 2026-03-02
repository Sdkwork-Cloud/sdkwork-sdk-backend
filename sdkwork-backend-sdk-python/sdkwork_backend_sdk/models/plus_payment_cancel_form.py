from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPaymentCancelForm:
    """Payment cancel form"""
    payment_id: int
    out_trade_no: str
    amount: float
    reason: str = None
