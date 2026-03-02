from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrganizationMemberForm:
    """Organization member creation form"""
    user_id: int
    owner: str
    owner_id: int
    is_active: bool = None
    joined_at: str = None
    left_at: str = None
    remark: str = None
