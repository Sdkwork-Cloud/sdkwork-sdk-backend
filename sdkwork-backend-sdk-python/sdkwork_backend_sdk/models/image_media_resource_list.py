from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageMediaResourceList:
    """图片媒体资源列表"""
    images: List[ImageMediaResource] = None
