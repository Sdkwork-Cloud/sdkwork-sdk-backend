from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTGradientColor:
    """渐变颜色"""
    pos: int
    color: str
