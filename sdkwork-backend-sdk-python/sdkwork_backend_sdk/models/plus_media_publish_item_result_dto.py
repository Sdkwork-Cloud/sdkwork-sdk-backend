from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMediaPublishItemResultDTO:
    record_id: int = None
    note_id: int = None
    note_uuid: str = None
    title: str = None
    article_index: int = None
    success: bool = None
    errcode: int = None
    errmsg: str = None
    draft_media_id: str = None
    publish_id: str = None
    article_id: str = None
