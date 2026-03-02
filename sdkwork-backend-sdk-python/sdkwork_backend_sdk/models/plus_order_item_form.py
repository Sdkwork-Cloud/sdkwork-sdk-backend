from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrderItemForm:
    """Order item creation form"""
    order_id: int
    product_type: str
    product_id: int
    sku_id: int
    quantity: int
    unit_price: float
    total_amount: float
    expire_time: str = None
    content_type: str = None
    content_id: int = None
