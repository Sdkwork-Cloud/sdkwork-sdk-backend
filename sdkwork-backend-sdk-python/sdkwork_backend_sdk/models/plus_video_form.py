from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVideoForm:
    """Video creation form"""
    title: str = None
    description: str = None
    content_url: str
    aspect_ratio: str = None
    duration: int = None
    resolution: str = None
    width: int = None
    height: int = None
    file_size: int = None
    format: str = None
    thumbnail_url: str = None
    status: str
