from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNewsForm:
    """News creation form"""
    title: str
    url: str = None
    source: str = None
    summary: str = None
    publish_time: str = None
    tags: TagsContent = None
    category_id: int
    user_id: int = None
