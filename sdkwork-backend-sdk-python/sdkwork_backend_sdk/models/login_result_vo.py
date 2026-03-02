from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LoginResultVO:
    """认证令牌信息"""
    created_at: str = None
    updated_at: str = None
    token: str
    refresh_token: str
    expires_in: int
    refresh_expires_in: int
    user_id: int
    user: UserVO = None
