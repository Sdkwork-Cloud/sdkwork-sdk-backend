from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAttributeVO:
    """商品分类属性VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    version: int = None
    name: str = None
    code: str = None
    description: str = None
    type: str = None
    content_type: str = None
    content_id: int = None
    category_id: int = None
    attribute_value: str = None
    sort_weight: int = None
    required: int = None
    status: str = None
