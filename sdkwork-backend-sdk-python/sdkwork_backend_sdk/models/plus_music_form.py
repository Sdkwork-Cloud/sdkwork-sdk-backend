from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMusicForm:
    """Music creation form"""
    title: str
    description: str = None
    content_url: str
    format: str = None
    duration: int
    file_size: int = None
    thumbnail_url: str = None
    artist: str = None
    genre: str = None
    bitrate: int = None
    status: str
