from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAttributeForm:
    """Attribute creation form"""
    name: str
    code: str
    description: str = None
    type: str
    content_type: str
    content_id: int
    category_id: int
    attribute_value: str = None
    sort_weight: int = None
    required: int
    status: str
