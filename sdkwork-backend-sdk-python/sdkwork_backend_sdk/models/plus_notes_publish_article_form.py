from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusNotesPublishArticleForm:
    """笔记发布文章表单"""
    note_id: int = None
    note_uuid: str = None
    title: str = None
    content: str = None
    digest: str = None
    author: str = None
    thumb_media_id: str = None
    content_source_url: str = None
    show_cover_pic: int = None
    need_open_comment: int = None
    only_fans_can_comment: int = None
