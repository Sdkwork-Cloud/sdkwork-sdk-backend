from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNewsVO:
    """新闻资讯VO对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    title: str = None
    url: str = None
    source: str = None
    summary: str = None
    publish_time: str = None
    tags: TagsContent = None
