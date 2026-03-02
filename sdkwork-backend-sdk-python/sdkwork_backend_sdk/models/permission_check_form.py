from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PermissionCheckForm:
    """权限检查请求表单"""
    permission: str
