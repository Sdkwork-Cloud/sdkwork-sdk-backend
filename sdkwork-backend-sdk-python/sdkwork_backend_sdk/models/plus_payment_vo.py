from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPaymentVO:
    """支付记录VO，记录所有支付交易信息"""
    created_at: str = None
    updated_at: str = None
    purpose: str = None
    order_id: int = None
    transaction_id: str = None
    out_trade_no: str = None
    channel: str = None
    status: str = None
    amount: float = None
    success_time: str = None
    remark: str = None
    content_type: str = None
    content_id: int = None
    product_type: str = None
    provider: str = None
