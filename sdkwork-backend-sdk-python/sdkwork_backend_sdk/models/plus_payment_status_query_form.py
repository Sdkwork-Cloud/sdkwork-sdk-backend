from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPaymentStatusQueryForm:
    """Payment status query form"""
    out_trade_no: str = None
    provider: str = None
    amount: float = None
