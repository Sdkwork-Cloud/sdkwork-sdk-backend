from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class InvitationCodeVO:
    """邀请码VO对象"""
    created_at: str = None
    updated_at: str = None
    code: str = None
    creator_user_id: int = None
    status: str = None
    expire_time: str = None
    usage_limit: int = None
    used_count: int = None
