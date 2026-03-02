from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusRefundVO:
    """退款记录VO，记录所有退款交易信息，支持多种退款场景"""
    created_at: str = None
    updated_at: str = None
    order_id: int = None
    payment_id: int = None
    out_refund_no: str = None
    out_trade_no: str = None
    refund_id: str = None
    amount: float = None
    type: str = None
    status: str = None
    apply_time: str = None
    complete_time: str = None
    remark: str = None
    content_type: str = None
    content_id: int = None
