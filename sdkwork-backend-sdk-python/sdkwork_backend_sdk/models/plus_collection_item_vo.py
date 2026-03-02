from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCollectionItemVO:
    """Collection Item VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    collection_id: int = None
    collection_uuid: str = None
    type: str = None
    content_type: str = None
    content_id: int = None
    content_uuid: str = None
    title: str = None
    description: str = None
    position: int = None
    is_pinned: bool = None
    tags: str = None
    extra_data: str = None
