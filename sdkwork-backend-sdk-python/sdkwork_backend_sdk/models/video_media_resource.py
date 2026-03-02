from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoMediaResource:
    """视频媒体资源"""
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
    duration: int = None
    width: int = None
    height: int = None
