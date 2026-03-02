from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetMediaResource:
    """媒体资源包装类"""
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
    image: ImageMediaResource = None
    video: VideoMediaResource = None
    audio: AudioMediaResource = None
    music: MusicMediaResource = None
    character: CharacterMediaResource = None
    file: FileMediaResource = None
    extra_props: Dict[str, Any] = None
