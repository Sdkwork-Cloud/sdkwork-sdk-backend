from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTBaseElement:
    """元素通用属性"""
    id: str
    left: int
    top: int
    lock: bool = None
    group_id: str = None
    width: int
    height: int
    rotate: int
    link: PPTElementLink = None
    name: str = None
