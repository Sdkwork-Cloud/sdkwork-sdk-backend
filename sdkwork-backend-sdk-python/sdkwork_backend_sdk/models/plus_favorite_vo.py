from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFavoriteVO:
    """Favorite VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    content_type: str = None
    content_id: int = None
    folder_id: int = None
    remark: str = None
    tags: str = None
    sort_weight: int = None
    title: str = None
    image: ImageMediaResource = None
    is_private: bool = None
    status: str = None
    view_count: int = None
    last_viewed_at: str = None
