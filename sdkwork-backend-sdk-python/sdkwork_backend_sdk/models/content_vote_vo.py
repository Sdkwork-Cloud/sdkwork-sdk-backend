from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ContentVoteVO:
    """内容投票数据传输对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    v: int = None
    user_id: int = None
    content_type: str = None
    rating: str = None
    content_id: int = None
    metadata: ContentVoteMetadata = None
