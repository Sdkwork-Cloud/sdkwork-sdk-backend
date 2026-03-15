from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCommentsForm:
    """Comment creation form with content details"""
    content: str
    content_type: str
    content_id: int
    status: str = None
    likes: int = None
    reply_count: int = None
    is_top: bool = None
    ip_address: str = None
    device_info: str = None
    parent_id: int = None
    parent_uuid: str = None
    user_id: int
    parent_metadata: PlusTreeParentMetadata = None
