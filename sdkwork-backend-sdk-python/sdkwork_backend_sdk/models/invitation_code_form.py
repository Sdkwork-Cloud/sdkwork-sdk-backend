from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvitationCodeForm:
    """Invitation code creation form"""
    code: str
    creator_user_id: int
    status: str
    expire_time: str = None
    usage_limit: int = None
    used_count: int = None
