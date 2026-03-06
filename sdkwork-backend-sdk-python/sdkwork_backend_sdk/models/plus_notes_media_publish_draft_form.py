from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotesMediaPublishDraftForm:
    """媒体草稿发布表单"""
    user_id: int = None
    platform: str = None
    product: str = None
    draft_media_id: str
