from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFeedsForm:
    """Feeds creation form"""
    title: str
    summary: str = None
    content_type: str
    content_id: int
    cover_images: ImageMediaResourceList = None
    source: str = None
    publish_time: str = None
    tags: TagsContent = None
    status: str
    view_count: int = None
    like_count: int = None
    comment_count: int = None
