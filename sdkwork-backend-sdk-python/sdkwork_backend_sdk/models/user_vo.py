from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserVO:
    """用户信息视图对象"""
    created_at: str = None
    updated_at: str = None
    id: int
    username: str
    email: str = None
    phone: str = None
