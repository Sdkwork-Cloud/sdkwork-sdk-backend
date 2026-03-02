from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderConfirmVO:
    """订单确认操作VO"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    message: str = None
    operation_time: str = None
    order_id: int = None
    confirm_time: str = None
    estimated_ship_time: str = None
