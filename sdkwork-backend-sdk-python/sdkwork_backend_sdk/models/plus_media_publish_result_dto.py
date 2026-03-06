from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMediaPublishResultDTO:
    batch_id: str = None
    platform: str = None
    action: str = None
    success: bool = None
    errcode: int = None
    errmsg: str = None
    draft_media_id: str = None
    publish_id: str = None
    article_id: str = None
    preview_data: Any = None
    items: List[PlusMediaPublishItemResultDTO] = None
