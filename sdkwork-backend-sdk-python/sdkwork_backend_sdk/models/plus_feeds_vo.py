from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFeedsVO:
    """Feeds流VO对象，支持通用内容展示，包括新闻资讯、博客、视频、图片、音频等多种类型"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    title: str = None
    summary: str = None
    content_type: str = None
    content_id: int = None
    cover_images: ImageMediaResourceList = None
    resource_list: AssetMediaResourceList = None
    author: AuthorInfo = None
    source: str = None
    publish_time: str = None
    tags: TagsContent = None
    status: str = None
    view_count: int = None
    like_count: int = None
    comment_count: int = None
