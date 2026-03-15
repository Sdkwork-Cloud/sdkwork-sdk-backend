from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PasswordResetForm:
    """Password reset form"""
    token: str
    new_password: str
