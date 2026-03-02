from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvitationRelationForm:
    """Invitation relation creation form"""
    inviter_user_id: int
    invitee_user_id: int
    invite_code: str
    used_time: str
    relation_level: int
    reward_status: str = None
    reward_amount: float = None
    reward_type: str = None
