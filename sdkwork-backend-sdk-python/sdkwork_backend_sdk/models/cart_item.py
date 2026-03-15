from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CartItem:
    """Shopping cart item information"""
    id: int = None
    sku: PlusSku = None
    quantity: int = None
    unit_price: float = None
    total_price: float = None
    selected: bool = None
