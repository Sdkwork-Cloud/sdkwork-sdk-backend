from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotesVO:
    """Notes VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    title: str = None
    content: str = None
    user_id: int = None
    user_name: str = None
    category_id: int = None
    category_name: str = None
    tags: str = None
    access_scope: str = None
    password: str = None
    cover_image: ImageMediaResource = None
    status: str = None
    remark: str = None
    disk_id: int = None
    parent_id: int = None
    type: str = None
    path: str = None
    relative_path: str = None
