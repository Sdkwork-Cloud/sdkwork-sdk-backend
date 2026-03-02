from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusImageVO:
    """图片信息VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    title: str = None
    description: str = None
    resource: ImageMediaResource = None
    author: AuthorInfo = None
    url: str = None
    aspect_ratio: str = None
    width: int = None
    height: int = None
    file_size: int = None
    format: str = None
    status: str = None
