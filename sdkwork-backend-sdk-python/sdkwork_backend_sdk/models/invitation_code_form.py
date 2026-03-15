from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvitationCodeForm:
    """Invitation code creation form"""
    code: str
    creator_user_id: int
    status: str = None
    expire_time: str
    usage_limit: int = None
    used_count: int = None
