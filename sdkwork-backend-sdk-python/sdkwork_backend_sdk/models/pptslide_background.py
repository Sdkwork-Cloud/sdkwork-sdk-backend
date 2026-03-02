from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTSlideBackground:
    """幻灯片背景"""
    type: PPTSlideBackgroundType
    color: str = None
    image: PPTSlideBackgroundImage = None
    pptgradient: PPTGradient = None
