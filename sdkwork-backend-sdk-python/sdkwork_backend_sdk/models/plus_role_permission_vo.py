from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusRolePermissionVO:
    """Role-Permission association VO (stores many-to-many relationship between roles and permissions)"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    role_id: int = None
    role_uuid: str = None
    permission_id: int = None
    permission_uuid: str = None
    enabled: bool = None
    description: str = None
    operator_id: int = None
    status: str = None
