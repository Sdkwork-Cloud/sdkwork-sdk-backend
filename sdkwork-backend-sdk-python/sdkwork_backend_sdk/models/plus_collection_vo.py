from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCollectionVO:
    """Collection VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    description: str = None
    type: str = None
    content_id: int = None
    cover_image: str = None
    is_public: bool = None
    is_pinned: bool = None
    sort: int = None
    item_count: int = None
    view_count: int = None
    favorite_count: int = None
    last_updated_at: str = None
    parent_id: int = None
    children_ids: List[int] = None
