from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusVipPointChangeVO:
    """VIP积分变动记录VO"""
    created_at: str = None
    updated_at: str = None
    user_id: int = None
    change_type: str = None
    change_amount: int = None
    before_balance: int = None
    after_balance: int = None
    source_id: int = None
    source_type: str = None
    remark: str = None
