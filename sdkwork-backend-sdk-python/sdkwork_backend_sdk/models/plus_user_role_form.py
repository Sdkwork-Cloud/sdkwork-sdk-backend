from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserRoleForm:
    """User-role relationship creation form"""
    user_id: int
    role_id: int
