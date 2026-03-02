from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDepartmentVO:
    """Department VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    parent_id: int = None
    name: str = None
    description: str = None
    owner: str = None
    owner_id: int = None
    code: str = None
    sort_order: int = None
    is_active: bool = None
    organization_id: int = None
    member_ids: List[int] = None
