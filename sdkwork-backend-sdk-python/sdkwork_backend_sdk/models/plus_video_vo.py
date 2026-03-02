from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVideoVO:
    """视频信息VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    version: int = None
    title: str = None
    description: str = None
    resource: VideoMediaResource = None
    author: AuthorInfo = None
    content_url: str = None
    aspect_ratio: str = None
    duration: int = None
    resolution: str = None
    width: int = None
    height: int = None
    file_size: int = None
    format: str = None
    thumbnail_url: str = None
    status: str = None
