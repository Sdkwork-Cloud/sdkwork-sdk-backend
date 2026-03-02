from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderCompleteVO:
    """订单完成操作VO"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    message: str = None
    operation_time: str = None
    order_id: int = None
    complete_time: str = None
    reviewed: bool = None
    points_earned: int = None
