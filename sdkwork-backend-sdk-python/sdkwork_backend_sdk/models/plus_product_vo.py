from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusProductVO:
    """Product Value Object - Represents a product in the system with basic information, pricing, inventory, and relationships"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    title: str = None
    code: str = None
    subtitle: str = None
    resources: AssetMediaResourceList = None
    tags: TagsContent = None
    price: float = None
    original_price: float = None
    stock: int = None
    sales_count: int = None
    status: str = None
    on_sale_at: str = None
    description: str = None
    category_id: int = None
    base_attributes: Attributes = None
    spec_attributes: Attributes = None
