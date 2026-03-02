from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusImGroupForm:
    """Chat group creation form"""
    name: str
    description: str = None
    avatar: ImageMediaResource = None
    announcement: str = None
    member_count: int
    max_members: int
    creator_id: int
    type: str = None
    status: str = None
    allow_member_invite: bool = None
    require_approval: bool = None
