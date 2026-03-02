from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PasswordResetForm:
    """密码重置表单"""
    token: str
    new_password: str
