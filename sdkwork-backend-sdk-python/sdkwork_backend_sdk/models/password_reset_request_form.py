from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PasswordResetRequestForm:
    """密码重置请求表单"""
    email: str
