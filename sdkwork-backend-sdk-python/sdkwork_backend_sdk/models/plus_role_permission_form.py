from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusRolePermissionForm:
    """Role-permission association creation form"""
    role_id: int
    role_uuid: str
    permission_id: int
    permission_uuid: str
    enabled: bool
    description: str = None
    operator_id: int = None
