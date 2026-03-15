from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CartGroup:
    """Shopping cart group information"""
    uuid: str = None
    name: str = None
    items: List[CartItem] = None
    total_quantity: int = None
    total_price: float = None
