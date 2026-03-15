from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotesMediaDraftForm:
    """濯掍綋鑽夌鍒涘缓琛ㄥ崟"""
    user_id: int = None
    platform: str = None
    product: str = None
    articles: List[PlusNotesPublishArticleForm]
