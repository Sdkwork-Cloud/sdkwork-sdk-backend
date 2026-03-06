from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderContentItem:
    """订单内容项"""
    id: int = None
    product_id: int = None
    sku_id: int = None
    name: str = None
    type: str = None
    quantity: int = None
    unit_price: float = None
    total_price: float = None
