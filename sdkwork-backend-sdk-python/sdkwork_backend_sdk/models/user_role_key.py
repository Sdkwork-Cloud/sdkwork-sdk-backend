from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserRoleKey:
    user_id: int = None
    role_id: int = None
