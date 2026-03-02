from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShardingKeyVO:
    """分片键值对象"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    sharding_key: str = None
    tenant_id: int = None
    owner: str = None
    owner_id: int = None
    status: str = None
    description: str = None
