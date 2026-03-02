from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioMediaResource:
    """音频媒体资源"""
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
    format: str = None
    bit_rate: int = None
    sample_rate: int = None
    channels: int = None
    duration: int = None
