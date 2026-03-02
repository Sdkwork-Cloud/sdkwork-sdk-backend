from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AspectRatio:
    """视频/图像生成的宽高比例配置"""
    ratio: str = None
    width: float = None
    height: float = None
