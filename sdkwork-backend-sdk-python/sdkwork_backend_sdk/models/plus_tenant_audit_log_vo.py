from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusTenantAuditLogVO:
    """租户审计日志值对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    tenant_id: int = None
    action: str = None
    module: str = None
    operator: str = None
    description: str = None
    result: str = None
    create_time: str = None
    ip: str = None
