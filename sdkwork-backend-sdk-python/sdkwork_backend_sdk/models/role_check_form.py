from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RoleCheckForm:
    """角色检查请求表单"""
    role: str
