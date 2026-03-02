from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShareVO:
    """分享VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    title: str = None
    description: str = None
    type: str = None
    contents: ShareContents = None
    content_type: str = None
    status: str = None
    share_url: str = None
    content_ids: List[str] = None
    password: str = None
    expire_at: str = None
    click_count: int = None
    tags: TagsContent = None
    share_code: str = None
