from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCommentsVO:
    """用户评论VO，支持新闻、文章、视频、图片、商品、帖子等任何内容类型的评论"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    parent_id: int = None
    parent_uuid: str = None
    user_id: int = None
    content: str
    content_type: str
    content_id: int
    status: str = None
    likes: int = None
    reply_count: int = None
    is_top: bool = None
    ip_address: str = None
    device_info: str = None
    author: AuthorInfo = None
