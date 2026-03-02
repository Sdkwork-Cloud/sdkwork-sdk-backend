from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PasswordResetResultVO:
    """密码重置响应视图对象"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    message: str = None
    expires_in: int = None
    token: str = None
