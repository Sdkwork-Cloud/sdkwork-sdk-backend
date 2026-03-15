from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ChangePasswordForm:
    """Change password form"""
    user_id: str = None
    old_password: str
    new_password: str
