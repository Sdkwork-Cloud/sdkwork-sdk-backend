from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptProject:
    """PPT项目信息"""
    id: str = None
    uuid: str = None
    type: str = None
    screen_type: str = None
    name: str
    title: str
    owner: str = None
    owner_id: int = None
    disk_id: int = None
    files: List[PlusFileObject] = None
    author: str = None
    created_at: str = None
    last_modified_time: str = None
    version: str = None
    prompt: str = None
    description: str = None
    tags: TagsContent = None
    width: float
    height: float
    slides: List[PlusPptSlide]
    theme: PlusPptTheme = None
    context: PlusPptContext = None
    subtitle: str = None
    include_page_numbers: bool = None
    include_footer: bool = None
    footer_text: str = None
    export_format: str = None
