from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCollectionItemForm:
    """Collection item creation form"""
    collection_id: int
    collection_uuid: str = None
    type: str
    content_type: str
    content_id: int
    content_uuid: str = None
    title: str = None
    description: str = None
    position: int = None
    is_pinned: bool = None
    tags: str = None
    extra_data: str = None
