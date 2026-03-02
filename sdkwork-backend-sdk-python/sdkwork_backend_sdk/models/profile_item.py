from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProfileItem:
    """Profile Item"""
    name: str = None
    label: str = None
    values: List[str] = None
    custom: bool = None
    update_count: int = None
    samples: List[str] = None
    description: str = None
