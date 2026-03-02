from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPositionForm:
    """Position creation form"""
    parent_id: int = None
    name: str
    description: str = None
    owner: str = None
    owner_id: int
    code: str = None
    level: int = None
    sort_order: int = None
    is_active: bool = None
