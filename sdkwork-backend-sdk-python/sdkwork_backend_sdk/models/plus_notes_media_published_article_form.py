from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotesMediaPublishedArticleForm:
    """P lu sN ot es Me di aP ub li sh ed Ar ti cl eF or m"""
    user_id: int = None
    platform: str = None
    product: str = None
    article_id: str
