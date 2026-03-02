from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterMediaResource:
    """数字人媒体资源"""
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
    character_type: str = None
    gender: str = None
    age_group: str = None
    avatar_url: str = None
    avatar_video_url: str = None
    speaker_id: int = None
    appearance_params: Dict[str, Any] = None
    animation_params: Dict[str, Any] = None
