from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDepartmentForm:
    """Department creation form"""
    name: str
    description: str = None
    owner: str = None
    owner_id: int
    code: str = None
    sort_order: int = None
    is_active: bool = None
    parent_id: int = None
