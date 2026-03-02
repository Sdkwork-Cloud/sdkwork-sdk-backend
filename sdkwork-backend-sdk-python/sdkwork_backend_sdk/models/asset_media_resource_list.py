from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetMediaResourceList:
    """媒体资源列表"""
    images: List[ImageMediaResource] = None
    videos: List[VideoMediaResource] = None
    audios: List[AudioMediaResource] = None
    files: List[FileMediaResource] = None
    musics: List[MusicMediaResource] = None
    resources: List[AssetMediaResource] = None
