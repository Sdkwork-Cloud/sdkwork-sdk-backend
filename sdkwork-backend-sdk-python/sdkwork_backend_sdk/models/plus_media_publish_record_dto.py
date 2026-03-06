from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMediaPublishRecordDTO:
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    version: int = None
    batch_id: str = None
    user_id: int = None
    note_id: int = None
    note_uuid: str = None
    note_title: str = None
    platform: str = None
    action: str = None
    status: str = None
    draft_media_id: str = None
    publish_id: str = None
    article_id: str = None
    article_index: int = None
    errcode: int = None
    errmsg: str = None
    request_payload: Dict[str, Any] = None
    response_payload: Dict[str, Any] = None
    started_at: str = None
    finished_at: str = None
