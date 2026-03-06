from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotesMediaDraftForm:
    """媒体草稿创建表单"""
    user_id: int = None
    platform: str = None
    product: str = None
    articles: List[PlusNotesPublishArticleForm]
