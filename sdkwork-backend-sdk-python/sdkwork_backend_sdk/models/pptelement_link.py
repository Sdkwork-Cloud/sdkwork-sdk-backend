from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTElementLink:
    """元素超链接"""
    type: PPTElementLinkType
    target: str
