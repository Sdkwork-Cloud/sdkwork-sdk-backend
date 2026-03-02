from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioMediaResourceList:
    """音频媒体资源列表"""
    audios: List[AudioMediaResource] = None
    resources: List[AssetMediaResource] = None
