from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderCancelVO:
    """订单取消操作VO"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    message: str = None
    operation_time: str = None
    order_id: int = None
    cancel_reason: str = None
    refundable: bool = None
    refund_amount: str = None
    cancel_time: str = None
