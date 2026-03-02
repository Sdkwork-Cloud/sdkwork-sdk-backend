from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShareForm:
    """分享创建表单"""
    title: str = None
    description: str = None
    type: str
    contents: ShareContents = None
    content_type: str = None
    status: str
    share_url: str = None
    content_ids: List[str] = None
    password: str = None
    expire_at: str = None
    click_count: int = None
    tags: TagsContent = None
    share_code: str = None
