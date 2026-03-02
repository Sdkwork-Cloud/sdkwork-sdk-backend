from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderShipVO:
    """订单发货操作VO"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    message: str = None
    operation_time: str = None
    order_id: int = None
    shipping_company: str = None
    tracking_number: str = None
    ship_time: str = None
    estimated_arrival_time: str = None
