from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMemberRelationsVO:
    """Member Relations VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    member_id: int = None
    owner: str = None
    owner_id: int = None
    type: str = None
    parent_id: int = None
    target_id: int = None
    is_primary: bool = None
    is_active: bool = None
    effective_at: str = None
    expired_at: str = None
    sort_order: int = None
    remark: str = None
