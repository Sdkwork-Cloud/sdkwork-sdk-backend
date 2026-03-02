from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvitationRelationVO:
    """邀请关系VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    inviter_user_id: int = None
    invitee_user_id: int = None
    invite_code: str = None
    used_time: str = None
    relation_level: int = None
    reward_status: str = None
    reward_amount: float = None
    reward_type: str = None
