from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PPTSectionTag:
    """章节标签"""
    id: str
    title: str = None
