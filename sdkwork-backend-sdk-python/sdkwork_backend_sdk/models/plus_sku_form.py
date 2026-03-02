from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusSkuForm:
    """SKU creation form"""
    title: str
    product_id: int
    sku_code: str
    images: ImageMediaResourceList = None
    resources: AssetMediaResourceList = None
    price: float
    original_price: float = None
    stock: int
    sales_count: int = None
    status: str
    category_id: int
    attributes: List[AttributeItem] = None
