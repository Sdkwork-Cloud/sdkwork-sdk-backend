from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFavoriteForm:
    """Favorite creation form"""
    content_type: str
    content_id: int
    remark: str = None
    sort_weight: int = None
    title: str = None
    image: ImageMediaResource = None
    is_private: bool = None
    status: str = None
