from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTSlideBackgroundImage:
    """幻灯片背景图片"""
    src: str
    size: str
