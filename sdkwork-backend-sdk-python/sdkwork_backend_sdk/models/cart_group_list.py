from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CartGroupList:
    """Shopping cart group list"""
    groups: List[CartGroup] = None
    total_quantity: int = None
    total_price: float = None
    selected_quantity: int = None
    selected_price: float = None
    all_items: List[CartItem] = None
