from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDetailVO:
    """Detail Value Object (Generic detailed content for various entities)"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    content_type: str = None
    content_id: int = None
    content: DetailContent = None
    product_id: int = None
    sku_id: int = None
