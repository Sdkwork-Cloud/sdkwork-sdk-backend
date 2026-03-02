from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPptTemplateTags:
    """PPT模板标签信息"""
    scene: List[str]
    design: List[str]
    theme: List[str] = None
    style: List[str] = None
