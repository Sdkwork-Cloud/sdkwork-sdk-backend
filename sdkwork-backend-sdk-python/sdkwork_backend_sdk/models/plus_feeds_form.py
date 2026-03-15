from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusFeedsForm:
    """Feeds creation form"""
    title: str
    summary: str = None
    category_id: int
    content_type: str
    content_id: int
    cover_images: ImageMediaResourceList = None
    source: str = None
    publish_time: str = None
    tags: TagsContent = None
    status: str = None
