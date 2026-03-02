from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTGradient:
    """渐变"""
    type: PPTGradientType
    colors: List[PPTGradientColor]
    rotate: int
