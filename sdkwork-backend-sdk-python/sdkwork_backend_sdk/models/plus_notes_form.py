from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotesForm:
    """Notes form"""
    title: str
    content: str = None
    user_id: int
    category_id: int = None
    tags: str = None
    access_scope: str = None
    password: str = None
    cover_image: ImageMediaResource = None
    status: str = None
    remark: str = None
    disk_id: int = None
    parent_id: int = None
    type: str = None
    tags_as_tags_content: TagsContent = None
