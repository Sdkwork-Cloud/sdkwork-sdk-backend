from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPermissionVO:
    """RBAC Permission Value Object (stores system permission metadata)"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    code: str = None
    description: str = None
    status: str = None
    sort_order: int = None
    resource_url: str = None
    http_method: str = None
