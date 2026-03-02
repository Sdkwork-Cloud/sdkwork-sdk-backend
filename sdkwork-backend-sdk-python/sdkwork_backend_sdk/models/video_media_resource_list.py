from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoMediaResourceList:
    """视频媒体资源列表"""
    videos: List[VideoMediaResource] = None
    resources: List[AssetMediaResource] = None
