from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipPackGroupVO:
    """VIP套餐分组VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    app_id: int = None
    name: str = None
    description: str = None
    sort_weight: int = None
    status: str = None
    remark: str = None
    packs: List[PlusVipPackVO] = None
