from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserForm:
    """User creation form"""
    username: str
    password: str
    salt: str = None
    email: str = None
    phone: str = None
    status: str
    role_ids: List[int] = None
