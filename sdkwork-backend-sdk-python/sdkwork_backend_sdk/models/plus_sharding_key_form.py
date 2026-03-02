from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusShardingKeyForm:
    """Sharding key creation form"""
    sharding_key: str
    tenant_id: int
    owner: str
    owner_id: int
    status: str
    description: str = None
