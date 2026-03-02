from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusCategoryForm:
    """Category creation form"""
    name: str
    description: str = None
    type: str
    icon: str = None
    sort_weight: int = None
    parent_id: int = None
    path: List[str] = None
    visible: int
    status: str
