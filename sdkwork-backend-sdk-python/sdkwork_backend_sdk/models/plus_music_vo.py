from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMusicVO:
    """音乐信息VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    version: int = None
    title: str = None
    cover_images: ImageMediaResourceList = None
    description: str = None
    resource: MusicMediaResource = None
    author: AuthorInfo = None
    content_url: str = None
    resource_list: AssetMediaResourceList = None
    format: str = None
    duration: int = None
    file_size: int = None
    thumbnail_url: str = None
    artist: str = None
    genre: str = None
    bitrate: int = None
    status: str = None
