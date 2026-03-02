from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShoppingCartItemForm:
    """Shopping cart item creation form"""
    cart_id: int
    cart_group_uuid: str
    product_id: int
    sku_id: int
    quantity: int
    price: float
    selected: bool
