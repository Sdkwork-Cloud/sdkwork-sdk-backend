from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChangePasswordForm:
    """修改密码表单"""
    user_id: str
    old_password: str
    new_password: str
