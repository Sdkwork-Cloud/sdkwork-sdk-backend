from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipPointChangeForm:
    """Point change creation form"""
    user_id: int
    change_type: str
    change_amount: int
    before_balance: int
    after_balance: int
    source_id: int = None
    source_type: str = None
    remark: str = None
