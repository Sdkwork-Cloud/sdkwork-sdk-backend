from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CartGroupList:
    """购物车分组列表"""
    groups: List[CartGroup] = None
    total_quantity: int = None
    total_price: float = None
    selected_quantity: int = None
    selected_price: float = None
    all_items: List[CartItem] = None
