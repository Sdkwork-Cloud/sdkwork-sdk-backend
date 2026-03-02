from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptThemeShadow:
    """阴影效果设置"""
    h: int
    v: int
    blur: int
    color: str
