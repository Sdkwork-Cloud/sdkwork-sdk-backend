from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotesMediaPublishDraftForm:
    """濯掍綋鑽夌鍙戝竷琛ㄥ崟"""
    user_id: int = None
    platform: str = None
    product: str = None
    draft_media_id: str
