from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusImGroupVO:
    """聊天群组VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    description: str = None
    avatar: ImageMediaResource = None
    announcement: str = None
    member_count: int = None
    max_members: int = None
    creator_id: int = None
    type: str = None
    status: str = None
    allow_member_invite: bool = None
    require_approval: bool = None
