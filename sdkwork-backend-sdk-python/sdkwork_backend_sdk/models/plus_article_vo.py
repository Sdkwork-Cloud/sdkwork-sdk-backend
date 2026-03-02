from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusArticleVO:
    """AI生成文章VO对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    title: str = None
    subtitle: str = None
    content: str = None
    word_count: int = None
    reading_time: int = None
    cover_images: ImageMediaResourceList = None
    author: AuthorInfo = None
    source: str = None
    status: str = None
    keywords: List[str] = None
    summary: str = None
