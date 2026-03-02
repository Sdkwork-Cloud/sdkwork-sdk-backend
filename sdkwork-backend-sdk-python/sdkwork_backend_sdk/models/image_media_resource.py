from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageMediaResource:
    """图片媒体资源"""
    id: int = None
    uuid: str = None
    url: str = None
    bytes: str = None
    local_file: Any = None
    base64: str = None
    type: str = None
    mime_type: str = None
    size: int = None
    name: str = None
    extension: str = None
    tags: TagsContent = None
    metadata: Dict[str, Any] = None
    prompt: str = None
    width: int = None
    height: int = None
    split_images: ImageMediaResource = None
    aspect_ratio: str = None
