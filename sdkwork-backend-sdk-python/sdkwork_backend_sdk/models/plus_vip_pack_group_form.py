from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipPackGroupForm:
    """VIP package group creation form"""
    app_id: int
    name: str
    description: str = None
    sort_weight: int = None
    status: str
    remark: str = None
