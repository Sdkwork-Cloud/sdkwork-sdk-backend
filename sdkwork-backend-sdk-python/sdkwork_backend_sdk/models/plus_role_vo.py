from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusRoleVO:
    """系统角色VO类"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    code: str = None
    name: str = None
    description: str = None
    status: str = None
