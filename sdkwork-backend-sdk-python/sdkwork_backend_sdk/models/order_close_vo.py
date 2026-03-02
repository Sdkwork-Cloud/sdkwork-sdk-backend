from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderCloseVO:
    """订单关闭操作VO"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    message: str = None
    operation_time: str = None
    order_id: int = None
    close_reason: str = None
    close_time: str = None
    reopenable: bool = None
