from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusProductForm:
    """Product creation form"""
    title: str
    code: str = None
    subtitle: str = None
    resources: AssetMediaResourceList = None
    price: float
    original_price: float = None
    stock: int = None
    sales_count: int = None
    status: str
    on_sale_at: str = None
    description: str = None
    category_id: int
    base_attributes: Attributes = None
    spec_attributes: Attributes = None
