from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusUserRoleVO:
    """用户角色关联关系VO"""
    created_at: str = None
    updated_at: str = None
    user_id: int = None
    role_id: int = None
