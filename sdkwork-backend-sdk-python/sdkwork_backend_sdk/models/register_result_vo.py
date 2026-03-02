from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RegisterResultVO:
    """注册结果"""
    created_at: str = None
    updated_at: str = None
    user: UserVO = None
