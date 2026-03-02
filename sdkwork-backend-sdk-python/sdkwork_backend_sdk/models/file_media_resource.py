from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileMediaResource:
    """文件媒体资源"""
    id: int = None
    uuid: str = None
    url: str = None
    bytes: str = None
    local_file: Any = None
    base64: str = None
    type: str = None
    size: int = None
    name: str = None
    extension: str = None
    tags: TagsContent = None
    metadata: Dict[str, Any] = None
    prompt: str = None
    width: int = None
    height: int = None
    duration: int = None
    mime_type: str = None
