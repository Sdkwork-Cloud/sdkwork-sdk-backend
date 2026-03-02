from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrganizationMemberVO:
    """Organization Member VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    user_id: int = None
    owner: str = None
    owner_id: int = None
    is_active: bool = None
    joined_at: str = None
    left_at: str = None
    remark: str = None
    department_ids: List[int] = None
    position_ids: List[int] = None
    role_ids: List[int] = None
    primary_department_id: int = None
    primary_position_id: int = None
    valid: bool = None
