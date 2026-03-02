from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusPermission:
    tenant_id: int = None
    organization_id: int = None
    data_scope: str = None
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    v: int = None
    name: str = None
    code: str = None
    description: str = None
    status: str = None
    sort_order: int = None
    resource_url: str = None
    http_method: str = None
