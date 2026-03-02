from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusSku:
    tenant_id: int = None
    organization_id: int = None
    data_scope: str = None
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    v: int = None
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
