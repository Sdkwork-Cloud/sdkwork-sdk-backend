from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipPackGroupQueryForm:
    """VIP套餐分组查询Form"""
    id: int = None
    created_at_from: str = None
    created_at_to: str = None
    app_id: int = None
    app_id_in: List[int] = None
