from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShoppingCartItemVO:
    """购物车条目VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    cart_id: int = None
    cart_group_uuid: str = None
    product_id: int = None
    sku_id: int = None
    quantity: int = None
    price: float = None
    selected: bool = None
