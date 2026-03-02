from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShardingContext:
    platform: str = None
    owner: str = None
    sharding_key: str = None
    tenant_id: int = None
    organization_id: int = None
    user_id: int = None
