from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusSkuVO:
    """Product SKU Value Object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    product_id: int = None
    sku_code: str = None
    name: str = None
    title: str = None
    price: float = None
    original_price: float = None
    stock: int = None
    sales: int = None
    status: int = None
    image: str = None
    specs: str = None
