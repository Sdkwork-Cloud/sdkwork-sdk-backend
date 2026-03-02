from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusArticleForm:
    """Article creation form"""
    title: str
    subtitle: str = None
    content: str
    word_count: int = None
    reading_time: int = None
    cover_images: ImageMediaResourceList = None
    author: AuthorInfo = None
    source: str = None
    status: str
    keywords: List[str] = None
    summary: str = None
