from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptThemeOutline:
    """轮廓效果设置"""
    width: int
    color: str
    style: str
