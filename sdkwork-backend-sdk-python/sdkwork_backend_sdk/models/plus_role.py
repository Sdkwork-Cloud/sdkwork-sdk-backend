from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusRole:
    tenant_id: int = None
    organization_id: int = None
    data_scope: str = None
    id: int = None
    uuid: str = None
    created_at: str = None
    updated_at: str = None
    v: int = None
    code: str = None
    name: str = None
    description: str = None
    status: str = None
    permissions: List[PlusPermission] = None
    permission_codes: List[str] = None
