from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMemberRelationsForm:
    """Member relation creation form"""
    member_id: int
    owner: str
    owner_id: int
    type: str
    target_id: int
    is_primary: bool = None
    is_active: bool = None
    effective_at: str = None
    expired_at: str = None
    sort_order: int = None
    remark: str = None
    created_at: str = None
    updated_at: str = None
