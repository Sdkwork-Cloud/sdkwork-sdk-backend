from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPermissionForm:
    """RBAC Permission Form (stores system permission metadata for data transfer and validation)"""
    name: str
    code: str
    description: str = None
    status: str
    sort_order: int = None
    resource_url: str = None
    http_method: str = None
